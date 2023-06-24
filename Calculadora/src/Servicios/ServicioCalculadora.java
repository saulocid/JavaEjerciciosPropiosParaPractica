package Servicios;

import Entidades.Calculadora;
import java.util.Scanner;

public class ServicioCalculadora {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Calculadora crearCalculadora() {
        System.out.println("Ingrese 2 números a operar");
        System.out.print("Ingrese primer número: ");
        double n1 = leer.nextDouble();
        System.out.print("Ingrese segundo número: ");
        double n2 = leer.nextDouble();
        return new Calculadora(n1, n2);
    }

    public void programa(Calculadora c) {
        double opc;
        String salir = "N";
        do {
            System.out.println("********************************");
            System.out.println("* Elija una opción para operar *");
            System.out.println("*                              *");
            System.out.println("* 1. Suma n1 + n2              *");
            System.out.println("* 2. Resta n1 - n2             *");
            System.out.println("* 3. Resta n2 - n1             *");
            System.out.println("* 4. Multiplica n1 * n2        *");
            System.out.println("* 5. Divide n1 / n2            *");
            System.out.println("* 6. Divide n2 / n1            *");
            System.out.println("* 7. Potencia de n1 a la n2    *");
            System.out.println("* 8. Potencia de n2 a la n1    *");
            System.out.println("* 9. Raíz n2 de n1             *");
            System.out.println("* 10. Raíz n1 de n2            *");
            System.out.println("* 11. Modifica  n1             *");
            System.out.println("* 12. Modifica  n2             *");
            System.out.println("* 13. Salir del programa       *");
            System.out.println("********************************");
            System.out.println("");

            do {
                System.out.print("Opción: ");
                opc = leer.nextDouble();
                if (opc < 1 || opc > 13 || opc != Math.abs(opc)) {
                    System.out.println("Error! Vuelva a intentar.");
                }
            } while (opc < 1 || opc > 13 || opc != Math.abs(opc));

            switch ((int) opc) {
                case 1:
                    System.out.println("La suma de " + c.getNum1() + " + " + c.getNum2() + " = " + sumar(c));
                    continuar();
                    break;
                case 2:
                    System.out.println("La resta de " + c.getNum1() + " - " + c.getNum2() + " = " + restar1(c));
                    continuar();
                    break;
                case 3:
                    System.out.println("La resta de " + c.getNum2() + " - " + c.getNum1() + " = " + restar2(c));
                    continuar();
                    break;
                case 4:
                    System.out.println("El producto de " + c.getNum1() + " * " + c.getNum2() + " = " + multiplicar(c));
                    continuar();
                    break;
                case 5:
                    if (c.getNum2() != 0) {
                        System.out.println("La división de " + c.getNum1() + " / " + c.getNum2() + " = " + dividir1(c));
                    } else {
                        System.out.println("NO SE PUEDE DIVIDIR POR 0!");
                    }
                    continuar();
                    break;
                case 6:
                    if (c.getNum1() != 0) {
                        System.out.println("La división de " + c.getNum2() + " / " + c.getNum1() + " = " + dividir2(c));
                    } else {
                        System.out.println("NO SE PUEDE DIVIDIR POR 0!");
                    }
                    continuar();
                    break;
                case 7:
                    System.out.println("La potencia de " + c.getNum1() + " elevado a " + c.getNum2() + " = " + potencia1(c));
                    continuar();
                    break;
                case 8:
                    System.out.println("La potencia de " + c.getNum2() + " elevado a " + c.getNum1() + " = " + potencia2(c));
                    continuar();
                    break;
                case 9:
                    System.out.println("La raiz " + c.getNum2() + " de " + c.getNum1() + " = " + raiz1(c));
                    continuar();
                    break;
                case 10:
                    System.out.println("La raiz " + c.getNum1() + " de " + c.getNum2() + " = " + raiz2(c));
                    continuar();
                    break;
                case 11:
                    modifica1(c);
                    continuar();
                    break;
                case 12:
                    modifica2(c);
                    continuar();
                    break;
                default:
                    do {
                        salir = salir(c);
                    } while (!salir.equalsIgnoreCase("N") && !salir.equalsIgnoreCase("S"));
            }
        } while (opc != 13 || !salir.equalsIgnoreCase("S"));
        System.out.println("HA SALIDO DEL PROGRAMA. Gracias por participar.");

    }

    public double sumar(Calculadora c) {
        double res = c.getNum1() + c.getNum2();
        return res;
    }

    public double restar1(Calculadora c) {
        double res = c.getNum1() - c.getNum2();
        return res;
    }

    public double restar2(Calculadora c) {
        double res = c.getNum2() - c.getNum1();
        return res;
    }

    public double multiplicar(Calculadora c) {
        double res = c.getNum2() * c.getNum1();
        return res;
    }

    public double dividir1(Calculadora c) {
        double res = c.getNum1() / c.getNum2();
        return res;
    }

    public double dividir2(Calculadora c) {
        double res = c.getNum2() / c.getNum1();
        return res;
    }

    public double potencia1(Calculadora c) {
        double res = Math.pow(c.getNum1(), c.getNum2());
        return res;
    }

    public double potencia2(Calculadora c) {
        double res = Math.pow(c.getNum2(), c.getNum1());
        return res;
    }

    public double raiz1(Calculadora c) {
        double res = Math.pow(c.getNum1(), 1 / c.getNum2());
        return res;
    }

    public double raiz2(Calculadora c) {
        double res = Math.pow(c.getNum2(), 1 / c.getNum1());
        return res;
    }

    public void modifica1(Calculadora c) {
        System.out.print("Ingrese nuevo valor del primer número: ");
        c.setNum1(leer.nextDouble());
    }

    public void modifica2(Calculadora c) {
        System.out.print("Ingrese nuevo valor del segundo número: ");
        c.setNum2(leer.nextDouble());
    }

    public String salir(Calculadora c) {
        System.out.print("Ingrese S o N: ");
        String res = leer.next();
        return res;
    }

    public void continuar() {
        System.out.println("Enter para continuar");
        leer.next();
        System.out.println("");
    }
    
}
