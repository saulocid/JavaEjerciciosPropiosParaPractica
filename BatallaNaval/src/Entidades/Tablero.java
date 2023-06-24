package Entidades;

public class Tablero {
    
    private char[][] tablero;
    private char[][] tableroHundido;
    private int intentos;
    private int ganar;

    public Tablero() {
    }

    public Tablero(char[][] tablero, char[][] tableroHundido, int intentos, int ganar) {
        this.tablero = tablero;
        this.tableroHundido = tableroHundido;
        this.intentos = intentos;
        this.ganar = ganar;
    }
    
        public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public char[][] getTableroHundido() {
        return tableroHundido;
    }

    public void setTableroHundido(char[][] tableroHundido) {
        this.tableroHundido = tableroHundido;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getGanar() {
        return ganar;
    }

    public void setGanar(int ganar) {
        this.ganar = ganar;
    }
    
}
