package ejecutarmusica;

import Entities.Musica;
import Services.MusicaService;

public class EjecutarMusica {

   public static void main(String[] args) {

      MusicaService ms = new MusicaService();
      Musica music = ms.crearMusica();
      ms.ejecutar(music);

   }

}
