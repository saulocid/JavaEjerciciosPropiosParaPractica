package registrousuarios;

import javax.swing.JOptionPane;

public class RegistroUsuarios {

   public static void main(String[] args) {
      String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
      String direccion = JOptionPane.showInputDialog("Ingrese su dirección:");
      int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));

      JOptionPane.showMessageDialog(null, "Registro exitoso:\n"
              + "Nombre: " + nombre + "\n"
              + "Dirección: " + direccion + "\n"
              + "Edad: " + edad);

      
      
      
   }

}
