package Entities;

public class Musica {
   
   private String artista;
   private String[] track;
   private int meGusta;
   private int noMeGusta;

   public Musica() {
   }

   public Musica(String artista, String[] track, int meGusta, int noMeGusta) {
      this.artista = artista;
      this.track = track;
      this.meGusta = meGusta;
      this.noMeGusta = noMeGusta;
   }

   public String getArtista() {
      return artista;
   }

   public void setArtista(String artista) {
      this.artista = artista;
   }

   public String[] getTrack() {
      return track;
   }

   public void setTrack(String[] track) {
      this.track = track;
   }

   public int getMeGusta() {
      return meGusta;
   }

   public void setMeGusta(int meGusta) {
      this.meGusta = meGusta;
   }

   public int getNoMeGusta() {
      return noMeGusta;
   }

   public void setNoMeGusta(int noMeGusta) {
      this.noMeGusta = noMeGusta;
   }
      
}
