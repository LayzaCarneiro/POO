package aula4_encapsulamento;

public class ContaPrincipal {
  public static void main(String args[]){
    // CONTA 1
    Conta conta1 = new Conta("Layza", 1234, 500);

    // CONTA 2
    Conta conta2 = new Conta("Laryssa", 5678, 1000);

    //MÉTODOS
    System.out.println();

    //MOSTRAR
    System.out.println("Conta 1: ");
    conta1.mostrarDados();
    System.out.println();
    System.out.println("Conta 2: ");
    conta2.mostrarDados();
  }
}

