package ejemploCalculadora;

import Entidades.Calculadora;
import Servicios.ServicioCalculadora;

public class EjemploCalculadora {

    public static void main(String[] args) {
       
        ServicioCalculadora sc = new ServicioCalculadora(); 
        System.out.println("<<||BIENVENIDOS AL PROGRAMA 'EJEMPLO CALCULADORA'||>>");
        System.out.println("---------------------------------------------------");
        Calculadora c = sc.crearCalculadora();
        System.out.println("---------------------------------------------------");
        sc.programa(c);
        
    }

}