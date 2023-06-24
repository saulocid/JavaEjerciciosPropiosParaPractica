package libreriamath;

import java.util.Scanner;

public class LibreriaMath {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese primer número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo número");
        int num2 = leer.nextInt();
        
        int mayor = Integer.max(num2, num1);
        int menor = Integer.min(num2, num1);
        System.out.println("El mayor entre " + num1 + " y " + num2 + " es " + mayor);
        System.out.println("El menor entre " + num1 + " y " + num2 + " es " + menor);//
        
    }     
    
}
