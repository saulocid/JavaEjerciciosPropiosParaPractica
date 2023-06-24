package ejemplodate;

import Entidades.Persona;
import Servicios.PerServ;

/* El programa crea un objeto de tipo persona
y utiliza una función recursiva de validadción
para los enteros positivos, en este caso  el dni,
el dia, el mes y el año. Ideal para usar.
*/

public class EjemploDate {

    public static void main(String[] args) {
       
        PerServ ps = new PerServ();
        Persona per001 = ps.crearPer();
        System.out.println("La persona creada es: " + per001.toString());
        
    }

}