package aula6_classes_abstratas;

public class Quadrado extends FiguraGeometrica {
  public double lado;

  public Quadrado(double lado){
    this.lado = lado;
  }

  public double calcularArea() {
    return lado*lado;
  }

  public double calcularPerimetro() {
    return lado*4;
  }

}
