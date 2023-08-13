package aula6_classes_abstratas;

public class Circulo extends FiguraGeometrica{
  public double pi = 3.14;
  public double raio;
  public double area;
  public double perimetro;

  public Circulo(double raio){
    this.raio = raio;
  }

  public double calcularArea() {
    return (pi*raio*raio);
  }

  public double calcularPerimetro() {
    return (2*pi*raio);
  }
}
