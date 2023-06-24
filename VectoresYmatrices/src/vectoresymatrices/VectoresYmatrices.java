package vectoresymatrices;

import java.util.Scanner;

public class VectoresYmatrices {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[] vector = new int[5];
        String[] nombres = {"Juan", "Pepe"};
        int longitud = nombres.length;
        
        System.out.println("Ingrese 5 numeros");
        for ( int i = 0 ; i < vector.length ; i++){
            vector[i] = leer.nextInt();
        }
        
        System.out.println("Su vector es");
        for (int elemento: vector){
            System.out.print(elemento + " ");
        }
        System.out.println("");
        
        /*for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }*/////
    }
    
}
