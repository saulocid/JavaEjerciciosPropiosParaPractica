package Services;

import Entities.Musica;
import java.awt.HeadlessException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class MusicaService {

   public Musica crearMusica() {
      Musica music = new Musica();
      music.setArtista("metal");
      String[] track = {
         "D:\\Mis Documentos\\Documentos\\Cursos Online\\EGG web fullstack\\Ejercicios\\Ejercicios de prueba\\EjecutarMusica\\src\\Tracks\\001_SOAD-Mr_Jack.mp3",
         "D:\\Mis Documentos\\Documentos\\Cursos Online\\EGG web fullstack\\Ejercicios\\Ejercicios de prueba\\EjecutarMusica\\src\\Tracks\\002_Jinjer-Perennial.mp3",
         "D:\\Mis Documentos\\Documentos\\Cursos Online\\EGG web fullstack\\Ejercicios\\Ejercicios de prueba\\EjecutarMusica\\src\\Tracks\\003_Arch_Enemy-My_Apocalypse.mp3",
         "D:\\Mis Documentos\\Documentos\\Cursos Online\\EGG web fullstack\\Ejercicios\\Ejercicios de prueba\\EjecutarMusica\\src\\Tracks\\004_Slipknot-Wait_And_Bleed.mp3"
      };
      music.setTrack(track);
      return music;
   }

   public int seleccion() {
      int seleccion = 0;
      boolean valido = false;
      do {
         String input = JOptionPane.showInputDialog("Seleccione el número de las siguientes canciones para escuchar:\n1. SYSTEM OF A DOWN - Mr. Jack \n2. JINJER - Perennial \n3. ARCH ENEMY - My apocalypse \n4. SLIPKNOT - Wait and bleed");
         try {
            if (input == null) {
               return 0;
            }
            seleccion = Integer.parseInt(input);
            if (seleccion >= 1 && seleccion <= 4) {
               valido = true;
            } else {
               JOptionPane.showMessageDialog(null, "Selección inválida. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
            }
         } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Selección inválida. Intente nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
         }
      } while (!valido);
      return seleccion;
   }

   public void ejecutar(Musica music) {
      boolean continuar = true;
      do {
         int seleccion = seleccion();
         if (seleccion == 0) {
            System.exit(0);
         }
         String trackPath = music.getTrack()[seleccion - 1];
         ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", trackPath);
         try {
            processBuilder.start();
            String input;
            do {
               input = JOptionPane.showInputDialog("¿Desea elegir otra canción? (S/N)").toUpperCase();
            } while (!input.equals("S") && !input.equals("N"));

            if (input.equals("N")) {
               continuar = false;
            }
         } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al reproducir la canción.", "Error", JOptionPane.ERROR_MESSAGE);
            continuar = false;
         }
      } while (continuar);
   }

}
