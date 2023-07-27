package basededatostxt;

import Entities.Persona;
import Services.PersonaService;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseDeDatosTXT {

   public static void main(String[] args) throws ParseException {

      String ruta = "D:\\Mis Documentos\\Documentos\\Cursos Online\\EGG web fullstack\\Ejercicios\\Ejercicios de prueba\\BaseDeDatosTXT\\src\\Sources\\BaseDeDatos.txt";
      PersonaService ps = new PersonaService();
      ArrayList<Persona> personas = new ArrayList<>();

      try {
         File archivo = new File(ruta);
         Scanner baseDatos = new Scanner(archivo);

         while (baseDatos.hasNext()) {
            String next = baseDatos.next();
            ps.crearPersona(personas, next);
         }

      } catch (FileNotFoundException e) {
         System.err.println("Error: Archivo no encontrado.");
      }

      ps.menu(personas, ruta);
      
   }

}
