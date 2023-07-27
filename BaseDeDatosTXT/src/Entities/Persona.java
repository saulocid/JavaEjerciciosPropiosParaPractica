package Entities;

import java.util.Objects;

public class Persona {
   
   private String nombre;
   private String apellido;
   private String nacionalidad;
   private Integer DNI;   
   private String fechaNacimiento;
   private Long telefono;
   private String eMail;

   public Persona() {
   }

   public Persona(String nombre, String apellido, String nacionalidad, Integer DNI, String fechaNacimiento, Long telefono, String eMail) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.nacionalidad = nacionalidad;
      this.DNI = DNI;
      this.fechaNacimiento = fechaNacimiento;
      this.telefono = telefono;
      this.eMail = eMail;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getNacionalidad() {
      return nacionalidad;
   }

   public void setNacionalidad(String nacionalidad) {
      this.nacionalidad = nacionalidad;
   }

   public Integer getDNI() {
      return DNI;
   }

   public void setDNI(Integer DNI) {
      this.DNI = DNI;
   }

   public String getFechaNacimiento() {
      return fechaNacimiento;
   }

   public void setFechaNacimiento(String fechaNacimiento) {
      this.fechaNacimiento = fechaNacimiento;
   }

   public Long getTelefono() {
      return telefono;
   }

   public void setTelefono(Long telefono) {
      this.telefono = telefono;
   }

   public String geteMail() {
      return eMail;
   }

   public void seteMail(String eMail) {
      this.eMail = eMail;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 37 * hash + Objects.hashCode(this.nombre);
      hash = 37 * hash + Objects.hashCode(this.apellido);
      hash = 37 * hash + Objects.hashCode(this.nacionalidad);
      hash = 37 * hash + Objects.hashCode(this.DNI);
      hash = 37 * hash + Objects.hashCode(this.fechaNacimiento);
      hash = 37 * hash + Objects.hashCode(this.telefono);
      hash = 37 * hash + Objects.hashCode(this.eMail);
      return hash;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }
      final Persona other = (Persona) obj;
      if (!Objects.equals(this.nombre, other.nombre)) {
         return false;
      }
      if (!Objects.equals(this.apellido, other.apellido)) {
         return false;
      }
      if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
         return false;
      }
      if (!Objects.equals(this.eMail, other.eMail)) {
         return false;
      }
      if (!Objects.equals(this.DNI, other.DNI)) {
         return false;
      }
      if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
         return false;
      }
      return Objects.equals(this.telefono, other.telefono);
   }

   @Override
   public String toString() {
      //Nombre;Apellido;Nacionalidad;DNI;Fecha de nacimiento;Teléfono;Email
      return nombre+" "+apellido+" nacido en "+nacionalidad+", con DNI nº "+DNI+", fecha de nacimiento el "+fechaNacimiento+", su teléfono es"+telefono+" y e-mail: "+eMail;
   }
   
}
