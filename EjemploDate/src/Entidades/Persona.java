package Entidades;

import java.util.Date;

public class Persona {
    
    private String nombre;
    private int dni;
    private Date fechaNac;
    private String domicilio;
    private double sueldo;

    public Persona() {
    }

    public Persona(String nombre, int dni, Date fechaNac, String domicilio, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + ", fechaNac=" + fechaNac + ", domicilio=" + domicilio + ", sueldo=" + sueldo + '}';
    }
           
}