/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

public class Servicios {

  private String Mostrar;
  private double Numeritos;
  private double Numeritos2;
  private String operacion;
  private String AcumMostrar;
  private String porcentaje;
  private String Aux;
  private String Aux2;

  public Servicios() {
  }

  public Servicios(String Mostrar, double Numeritos, double Numeritos2, String operacion, String AcumMostrar, String porcentaje, String Aux, String Aux2) {
    this.Mostrar = Mostrar;
    this.Numeritos = Numeritos;
    this.Numeritos2 = Numeritos2;
    this.operacion = operacion;
    this.AcumMostrar = AcumMostrar;
    this.porcentaje = porcentaje;
    this.Aux = Aux;
    this.Aux2 = Aux2;
  }

  public String getAux2() {
    return Aux2;
  }

  public void setAux2(String Aux2) {
    this.Aux2 = Aux2;
  }

  public String getAux() {
    return Aux;
  }

  public void setAux(String Aux) {
    this.Aux = Aux;
  }

  public String getPorcentaje() {
    return porcentaje;
  }

  public void setPorcentaje(String porcentaje) {
    this.porcentaje = porcentaje;
  }

  public void setAcumMostrar(String AcumMostrar) {
    this.AcumMostrar = AcumMostrar;
  }

  public String getAcumMostrar() {
    return AcumMostrar;
  }

  public String getMostrar() {
    return Mostrar;
  }

  public double getNumeritos() {
    return Numeritos;
  }

  public double getNumeritos2() {
    return Numeritos2;
  }

  public String getOperacion() {
    return operacion;
  }

  public void setMostrar(String Mostrar) {
    this.Mostrar = Mostrar;
  }

  public void setNumeritos(double Numeritos) {
    this.Numeritos = Numeritos;
  }

  public void setNumeritos2(double Numeritos2) {
    this.Numeritos2 = Numeritos2;
  }

  public void setOperacion(String operacion) {
    this.operacion = operacion;
  }

  public boolean validarBoton(String mostrar) {
    boolean bandera = true;

    if (this.Mostrar.contains(".")) {
      bandera = false;
    }

    return bandera;
  }

  public void asignacion(String Mostrar, double Numeritos, double Numeritos2, String operacion, String Aux) {

    if (!this.operacion.equals(" = ")) {
      if (this.Numeritos == 0) {
        this.Numeritos = Double.parseDouble(this.Mostrar);
        this.Aux = this.operacion;
        this.Mostrar = "";
      }
    } else {
      if (porcentaje == ""){
        this.Numeritos2 = Double.parseDouble(this.Mostrar);
        this.Mostrar = "";
      }else{
        this.Numeritos2 = Double.parseDouble(this.Mostrar.substring(0,this.Mostrar.length()-3));
        this.Mostrar = "";
      }

    }

  }

  public double Resultado(String Aux, double numeritos, double numeritos2, String porcentaje, String operacion, String Aux2) {

    if (!this.porcentaje.equals(" % ")) {
      switch (this.Aux) {

        case " + ":
          this.Numeritos += this.Numeritos2;
          break;
        case " - ":
          this.Numeritos -= this.Numeritos2;
          break;
        case " * ":
          this.Numeritos *= this.Numeritos2;
          break;
        case " / ":
          this.Numeritos /= this.Numeritos2;
          break;
      }
    } else {

      switch (this.Aux) {

        case " + ":
          this.Numeritos += (this.Numeritos2*this.Numeritos/100);
          break;
        case " - ":
          this.Numeritos -= (this.Numeritos2*this.Numeritos/100);
          break;
        case " * ":
          this.Numeritos *= (this.Numeritos2 / 100);
          break;
        case " / ":
          this.Numeritos /= (this.Numeritos2 / 100);
          break;
      }
    }

    return Numeritos;
  }

  public void Reset() {
    setMostrar("");
    setAcumMostrar("");
    setOperacion("");
    setAux("");
    setPorcentaje("");
    setNumeritos(0);
    setNumeritos2(0);
  }

}
