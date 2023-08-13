package aula2_classes;

// Crie uma classe que represente uma conta bancária. Toda conta possui um titular, um número e um saldo. 
// Crie um método para depositar um valor e outro para realizar um saque (lembre que saldo não pode ser negativo).

public class Conta {
  String titular;
  int numero;
  double saldo;

  public Conta(String titular, int numero, double saldo){
    this.titular = titular;
    this.numero = numero;
    this.saldo = saldo;
  }


  public Conta(String titular, int numero){
    this.titular = titular;
    this.numero = numero;
    this.saldo = 0;
  }

  void depositar(double depositar){
    System.out.println(String.format("Depósito concluído com sucesso. Valor depositado na conta de %s: R$%s", this.titular, depositar));
    this.saldo += depositar;
  }

  void sacar(double sacar){
    if (sacar > saldo){
      System.out.println("Dinheiro insuficiente para realizar saque.");
    } else{
      this.saldo -= sacar;
      System.out.println(String.format("Saque concluído com sucesso. Valor sacado na conta de %s: R$%s", this.titular, sacar));
    }
   }

   void transferir(double valorTrans, Conta contaDestino){
    if (valorTrans > this.saldo){
      System.out.println("Dinheiro insuficiente para realizar transferência.");
    } else{
      this.saldo -= valorTrans;
      contaDestino.depositar(valorTrans);
      System.out.println(String.format("Transferência concluída com sucesso. Valor transferido da conta de %s: R$%s", this.titular, valorTrans));
    }
   }

   void mostrarDados(){
    System.out.println("Titular = " + titular);
    System.out.println("Número = " + numero);
    System.out.println("Saldo = R$" + saldo);
   }
}
