                                        package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PerServ {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPer() {
        System.out.print("Ingrese su nombre completo: ");
        String nombre = leer.next();
        System.out.print("Ingrese su número de dni: ");
        int dni = (int)validarNum(leer.nextDouble());
        System.out.println("Ingrese fecha de nacimiento formato DD/MM/AAAA: ");
        int day = (int)validarNum(leer.nextDouble());
        int month = (int)validarNum(leer.nextDouble());
        int year = (int)validarNum(leer.nextDouble());
        Date fechaNac  = new Date(year-1900, month-1,  day);
        System.out.print("Ingrese su domicilio (Calle y altura): ");
        String domicilio = leer.next();
        System.out.print("Ingrese su sueldo mensual:  $");
        double sueldo = leer.nextDouble();
        return new Persona(nombre, dni, fechaNac, domicilio, sueldo);
    }

    public double validarNum(double num) {
        if (num < 1 || num != Math.round(num)) {
            System.out.print("Valor erróneo, vuelva a ingresar: ");
            num = validarNum(leer.nextDouble());
        }
        return num;
    }

}
