package aula6_classes_abstratas;

import java.util.ArrayList;

public class Principal {
  public static void main(String[] args) {
    FiguraGeometrica f1 = new Quadrado(5);
    FiguraGeometrica f2 = new Triangulo(3,4,5,4);

    ArrayList<FiguraGeometrica> figs = new ArrayList<FiguraGeometrica>();

    figs.add(f1);
    figs.add(f2);

    for(FiguraGeometrica f : figs){
      if(f instanceof Quadrado){
        System.out.println("Figura é um quadrado.");
      }
      else if(f instanceof Triangulo){
        System.out.println("A figura é um triângulo.");
      }

      System.out.println("Área = " + f.calcularArea());
      System.out.println("Perimetro = " + f.calcularPerimetro());

    }
  }
}
