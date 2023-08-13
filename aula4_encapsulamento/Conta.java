package aula4_encapsulamento;
/*
  Refaça a classe Conta encapsulando seus atributos como privados e definindo métodos get e set para eles
  Altere a classe Principal para refletir essas mudanças.
*/

public class Conta {
  private String titular;
  private int numero;
  private double saldo;

  public Conta(String titular, int numero, double saldo){
    this.titular = titular;
    this.numero = numero;
    this.saldo = saldo;
  }

  public Conta(String titular, int numero){
    this.titular = titular;
    this.numero = numero;
  }

  public String getTitular(){
    return titular;
  }
  public double getNumero(){
    return numero;
  }
  public double getSaldo(){
    return saldo;
  }
  public void setTitular(String titular){
    this.titular = titular;
  }
  public void setNumero(int numero){
    this.numero = numero;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
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

