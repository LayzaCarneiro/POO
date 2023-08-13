package aula3_construtores;

public class PotenciaPrinc {
  public static void main(String args[]){
    Potencia teste = new Potencia(25, 31);
    double elevar = teste.elevar();
    System.out.println("Elevar = " + elevar);
  }
}
