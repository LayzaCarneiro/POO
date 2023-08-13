package aula2_classes;

// Crie uma classe principal que instancie duas contas, configure seus atributos e realize saques e depósitos

public class ContaPrincipal {
  public static void main(String args[]){
    // CONTA 1
    Conta conta1 = new Conta("Layza", 1234-1, 200);

    // CONTA 2
    Conta conta2 = new Conta("Laryssa", 5678-2);

    //MÉTODOS
    conta1.depositar(1300);
    conta2.sacar(500);
    conta1.transferir(800, conta2);
    System.out.println();

    //MOSTRAR
    System.out.println("Conta 1: ");
    conta1.mostrarDados();
    System.out.println();
    System.out.println("Conta 2: ");
    conta2.mostrarDados();
  }
}
