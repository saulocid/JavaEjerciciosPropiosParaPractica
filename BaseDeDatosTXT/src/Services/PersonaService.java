package Services;

import Entities.Persona;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

//Nombre;Apellido;Nacionalidad;DNI;Fecha de nacimiento;Teléfono;Email
public class PersonaService {

   public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

   public void crearPersona(ArrayList<Persona> personas, String next) throws ParseException {
      Persona p = new Persona();
      String[] datosPersona = next.split(";");
      p.setNombre(datosPersona[0]);
      p.setApellido(datosPersona[1]);
      p.setNacionalidad(datosPersona[2]);
      p.setDNI(Integer.parseInt(datosPersona[3]));
      p.setFechaNacimiento(datosPersona[4]);
      p.setTelefono(Long.parseLong(datosPersona[5]));
      p.seteMail(datosPersona[6]);
      personas.add(p);
   }

   public void mostrarPersona(ArrayList<Persona> personas) {
      System.out.println("Las personas en este .txt son");
      System.out.println("--------------------------------------------------");
      for (Persona persona : personas) {
         System.out.println(persona.toString());
      }
   }

   public void agregarPersona(ArrayList<Persona> personas, String ruta) {
      System.out.println("Cuántas personas quiere agregar?");
      Integer cantidad = leer.nextInt();

      for (int i = 0; i < cantidad; i++) {
         System.out.println("Datos persona " + (i + 1));
         Persona p = new Persona();
         System.out.print("Ingrese nombre: ");
         p.setNombre(leer.next());
         System.out.print("Ingrese apellido: ");
         p.setApellido(leer.next());
         System.out.print("Ingrese nacionalidad: ");
         p.setNacionalidad(leer.next());
         do {
            System.out.print("Ingrese DNI: ");
            p.setDNI(leer.nextInt());
            if (p.getDNI() < 10000000 || p.getDNI() > 60000000) {
               System.out.println("El rango es entre 10000000 y 60000000");
            }
         } while (p.getDNI() < 10000000 || p.getDNI() > 60000000);
         System.out.print("Ingrese fecha nacimiento (dd/mm/aaaa): ");
         p.setFechaNacimiento(leer.next());
         do {
            System.out.print("Ingrese teléfono: ");
            p.setTelefono(leer.nextLong());
            if (p.getTelefono() < 1000000000) {
               System.err.println("ERROR");
            }
         } while (p.getTelefono() < 1000000000);
         System.out.print("Ingrese e-mail: ");
         p.seteMail(leer.next());
         personas.add(p);
         archivar(p, ruta);
      }
   }

   public static void archivar(Persona persona, String ruta) {
      try {
         BufferedWriter writer = new BufferedWriter(new FileWriter(ruta, true));
         writer.write(persona.getNombre() + ";" + persona.getApellido() + ";" + persona.getNacionalidad() + ";"
                 + persona.getDNI() + ";" + persona.getFechaNacimiento() + ";" + persona.getTelefono() + ";"
                 + persona.geteMail());
         writer.newLine();
         writer.close();
      } catch (IOException e) {
         System.err.println("Error al agregar la persona al archivo.");
      }
   }

   public void menu(ArrayList<Persona> personas, String ruta) {
      System.out.println("Bienvenido al sistema de datos de Fedex");
      do {
         System.out.println("---------------------------------------");
         System.out.println("Ingrese una opción para:");
         System.out.println("1. Ver lista");
         System.out.println("2. Agregar persona");
         System.out.println("3. Eliminar persona");
         System.out.println("4. Salir");

         Integer opc;
         do {
            System.out.print("Ingrese opción correcta: ");
            opc = leer.nextInt();
            if (opc < 1 || opc > 4) {
               System.err.println("Error");
            }
         } while (opc < 1 || opc > 4);

         switch (opc) {
            case 1:
               mostrarPersona(personas);
               break;
            case 2:
               agregarPersona(personas, ruta);
               break;
            case 3:
               eliminar(personas, ruta);
               break;
            case 4:
               System.out.println("Ha salido del sistema");
               System.exit(0);
         }
      } while (true);

   }

   public void eliminar(ArrayList<Persona> personas, String ruta) {
      System.out.println("Busque la persona por DNI");
      System.out.println("Si se ecuentra coincidencia se eliminará la persona");
      Integer dni = leer.nextInt();
      Iterator<Persona> iterator = personas.iterator();
      boolean encontro = false;
      while (iterator.hasNext()) {
         Persona persona = iterator.next();
         if (Objects.equals(persona.getDNI(), dni)) {
            System.out.println("La persona a eliminar es: " + persona.getNombre() + " " + persona.getApellido());
            iterator.remove();
            encontro = true;
         }
      }

      if (encontro == false) {
         System.out.println("No se encontró DNI");
      }

      try {
         BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));
         for (Persona persona : personas) {
            writer.write(persona.getNombre() + ";" + persona.getApellido() + ";" + persona.getNacionalidad() + ";"
                    + persona.getDNI() + ";" + persona.getFechaNacimiento() + ";" + persona.getTelefono() + ";"
                    + persona.geteMail());
            writer.newLine();
         }
         writer.close();
      } catch (IOException e) {
         System.err.println("Error al actualizar el archivo.");
      }
   }

}
