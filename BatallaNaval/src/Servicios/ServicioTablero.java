package Servicios;

import Entidades.Tablero;
import java.util.Random;
import java.util.Scanner;

public class ServicioTablero {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public final Random ran = new Random();

    public Tablero crearTablero() {
        char[][] vec = iniciarMatriz();
        return new Tablero(vec, vec, 0, 0);
    }

    public char[][] iniciarMatriz() {
        System.out.println("Iniciando el juego de la Batalla Naval.");
        System.out.println("El Tablero es el clásico de 10 x 10.");
        System.out.println("Se agregan 5 barcos de forma aleatora de 5, 4, 3, 2 y 1 espacios");
        return new char[10][10];
    }

    public void juego(Tablero tab) {
        String res = "";
        do {
            double num;
            System.out.println("Ingrese la cantidad de intentos (entero positivo)");
            do {
                System.out.print("Ingrese intento/s: ");
                num = leer.nextDouble();
                if (num != Math.round(num) || num < 1) {
                    System.out.println("Valor erróneo!");
                }
            } while (num != Math.round(num) || num < 1);
            tab.setIntentos((int)num);
            tab.setTablero(llenarTablero()); //iniciamos el mar con '~'
            tab.setTableroHundido(llenarTablero());
            tab.setTablero(llenarBarcos(tab)); // llenamos las posiciones de forma random
            disparar(tab);
            terminar(tab);
            System.out.println("Quieres volver a jugar? Ingresa S o N");
            do {
                res = leer.next().toUpperCase();
                if (!res.equals("S") && !res.equals("N")) {
                    System.out.println("Error! vuelve a ingresar S o N");
                }
            } while (!res.equals("S") && !res.equals("N"));
        } while (!res.equals("N"));

    }

    public char[][] llenarTablero() {
        char[][] matriz = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = '~';
            }
        }
        return matriz;
    }

    public char[][] llenarBarcos(Tablero tab) {
        //barcos:  5, 4, 3, 2, 1.
        System.out.println("");
        char[][] matriz = tab.getTablero();
        int x, y, pos;
        boolean hay /*m1, m2*/;
        for (int i = 5; i > 0; i--) {
            do {
                hay = false;
                //m1 = false; //intento de colocación
                //m2 = false; //intento de colocación
                x = ran.nextInt(10);
                y = ran.nextInt(10);
                pos = ran.nextInt(4) + 1;
                switch (pos) {
                    case 1:
                        // llena de izq a der
                        for (int j = 0; j < i; j++) {
                            if ((y + i) > 9) {
                                hay = true;
                                //m1 = true; //intento de colocación
                            } else if (matriz[x][y + j] == 'O') {
                                hay = true;
                                //m2 = true; //intento de colocación
                            }
                        }
                        if (hay == false) {
                            for (int j = 0; j < i; j++) {
                                matriz[x][y + j] = 'O';
                            }
                        }
                        break;
                    case 2:
                        // llenar de der a izq
                        for (int j = 0; j < i; j++) {
                            if ((y - i) < 0) {
                                hay = true;
                                //m1 = true; //intento de colocación
                            } else if (matriz[x][y - j] == 'O') {
                                hay = true;
                                //m2 = true; //intento de colocación
                            }
                        }
                        if (hay == false) {
                            for (int j = 0; j < i; j++) {
                                matriz[x][y - j] = 'O';
                            }
                        }
                        break;
                    case 3:
                        // llenar de arr a ab
                        for (int j = 0; j < i; j++) {
                            if ((x + i) > 9) {
                                hay = true;
                                //m1 = true; //intento de colocación
                            } else if (matriz[x + j][y] == 'o') {
                                hay = true;
                                //m2 = true; //intento de colocación
                            }
                        }
                        if (hay == false) {
                            for (int j = 0; j < i; j++) {
                                matriz[x + j][y] = 'O';
                            }
                        }
                        break;
                    case 4:
                        // llenar de ab a arr
                        for (int j = 0; j < i; j++) {
                            if ((x - i) < 0) {
                                hay = true;
                                //m1 = true; //intento de colocación
                            } else if (matriz[x - j][y] == 'O') {
                                hay = true;
                                ///m2 = true; //intento de colocación
                            }
                        }
                        if (hay == false) {
                            for (int j = 0; j < i; j++) {
                                matriz[x - j][y] = 'O';
                            }
                        }
                }
//                if (m1 == true) {
//                    System.out.println("SE SALIO DEL MAPA"); //intento de colocación
//                }
//                if (m2 == true) {
//                    System.out.println("Ya hay otro MALDITO barco AHÍ"); //intento de colocación
//                }
            } while (hay == true);

        }
        return matriz;
    }

    public void mostrarTablero(char[][] ma) {
        char[][] matriz = ma;
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void disparar(Tablero tab) {
        System.out.println("");
        System.out.println("Ingrese la coordenada a disparar el proyectil");
        System.out.println("Recuerde ingresar valores enteros entre 1 y 10");
        char[][] matriz = tab.getTablero();
        char[][] matrizHundida = tab.getTableroHundido();
        double X, Y;

        do {
            do {
                System.out.print("Ingrese valor para Fila: ");
                X = leer.nextDouble();
                if (X != Math.round(X) || X < 1 || X > 10) {
                    System.out.println("Valor erróneo!");
                }
            } while (X != Math.round(X) || X < 1 || X > 10);

            do {
                System.out.print("Ingrese valor para Columna: ");
                Y = leer.nextDouble();
                if (Y != Math.round(Y) || Y < 1 || Y > 10) {
                    System.out.println("Valor erróneo!");
                }
            } while (Y != Math.round(Y) || Y < 1 || Y > 10);

            if (matriz[(int) X - 1][(int) Y - 1] == 'O') {
                if (matrizHundida[(int) X - 1][(int) Y - 1] == 'Ø') {
                    System.out.println("YA ACERTASTE ESE IMPACTO");
                } else {
                    System.out.println("");
                    System.out.println("HAS IMPACTADO!!!");
                    matrizHundida[(int) X - 1][(int) Y - 1] = 'Ø';
                    tab.setGanar(tab.getGanar() + 1);
                }
            } else if (matrizHundida[(int) X - 1][(int) Y - 1] == 'x') {
                System.out.println("Ya te había dicho que HAY AGUA AHÍ");
            } else {
                System.out.println("");
                System.out.println("Agua por aquí");
                matrizHundida[(int) X - 1][(int) Y - 1] = 'x';
                tab.setIntentos(tab.getIntentos() - 1);
            }

            tab.setTableroHundido(matrizHundida);
            mostrarTablero(tab.getTableroHundido());
            System.out.println("Te quedan " + tab.getIntentos() + " intentos.");
            System.out.println("Has impactado " + tab.getGanar() + " veces");
            System.out.println("");
        } while (tab.getIntentos() != 0 && tab.getGanar() != 15);

    }

    public void terminar(Tablero tab) {
        if (tab.getIntentos() == 0) {
            System.out.println("SE TE HAN TERMINADO LOS PROYECTILES!!!");
            System.out.println("Has perdido esta partida =(");
            mostrarTablero(tab.getTablero());
        } else {
            System.out.println("HAS HUNDIDO TODOS LOS BARCOS!!!");
            System.out.println("You are de winner =D");
        }
    }

}
