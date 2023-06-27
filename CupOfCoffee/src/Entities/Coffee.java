package Entities;

public class Coffee {

  private String marca;
  private double capacidad;
  private int taza;
  private double jarro;

  public Coffee() {
  }

  public Coffee(String marca, double capacidad, int taza, double jarro) {
    this.marca = marca;
    this.capacidad = capacidad;
    this.taza = taza;
    this.jarro = jarro;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(double capacidad) {
    this.capacidad = capacidad;
  }

  public int getTaza() {
    return taza;
  }

  public void setTaza(int taza) {
    this.taza = taza;
  }

  public double getJarro() {
    return jarro;
  }

  public void setJarro(double jarro) {
    this.jarro = jarro;
  }

}
