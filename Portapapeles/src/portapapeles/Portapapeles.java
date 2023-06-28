package portapapeles;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

/* Programa que sirve para copiar la entrada en el portapapeles.
Este código es muy útil cuando desarrollamos una web en donde
queremos dejar un link hacia otra página, queremos mostrar un
código de referido o una llave para acceder y con un simple boton
al costado que tenga el presente código el usuario podrá copiarlo
sin ningún problema. Ejemplo: cuando creamos un repositorio
en GitHub y nos da la opción de copiado con un botón tipo svg*/

public class Portapapeles {

   public static void main(String[] args) {

      Scanner leer = new Scanner(System.in).useDelimiter("\n");

      System.out.println("Ingrese una cadena de texto para ser copiada al portapapeles y usarla fuera de NetBeans");
      System.out.print("Texto a copiar: ");
      String texto = leer.next();

      /* Aquí es la parte importanto en donte "texto" es l avariable que se copia
      al portapapeles, la cual se debería cambiar por lo que querramos hacer, ejemplo
      copiar una url de nuestra web.*/
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      StringSelection selection = new StringSelection(texto);
      clipboard.setContents(selection, null);

      System.out.println("Texto copiado al portapapeles: " + texto);
      System.out.println("Ya puedes hacer CTRL+V donde gustes ;)");
   }
}
