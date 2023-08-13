package aula4_encapsulamento;
import java.util.Scanner;

public class BancoPrincipal{
  public static void main(String args[]){
    Banco banco = new Banco("Banco LMRC",10);

    System.out.println("Seja bem-vindo ao banco " + banco);
    System.out.println("Informe o número do que deseja: \n[1] Adicionar conta \n[2] Procurar conta \n[3] Sacar \n[4] Depositar \n[5] Transferir \n[6] Sair");
    Scanner scanner = new Scanner(System.in);
    Integer escolha = scanner.nextInt();

    while(escolha != 6){
      if(escolha >= 1 && escolha <= 5){
        if(escolha == 1){
          System.out.print("Informe o titular, número e saldo da conta. \nTitular: ");
          String titular = scanner.next();
          System.out.print("Número: ");
          Integer numero = scanner.nextInt();
          System.out.print("Saldo: R$");
          Double saldo = scanner.nextDouble();
          Conta conta = new Conta(titular, numero, saldo);
          if (banco.adicionar(conta)){System.out.println("Conta adicionada com sucesso.");}
          else{System.out.println("Limite de contas atingido.");}
        }
        else if(escolha == 2){
            System.out.println("Informe o número da conta que deseja procurar. \nConta: ");
            Integer numC = scanner.nextInt();
            Conta procurar = banco.procurar(numC);
            System.out.println(procurar);
        }
        else if(escolha == 3){
          System.out.println("Informe o número da conta da qual deseja sacar. \nConta: ");
          Integer numC = scanner.nextInt();
          Conta contaSacar = banco.procurar(numC);
          System.out.println("Informe o valor que deseja sacar. \nValor: ");
          Integer valor = scanner.nextInt();
          contaSacar.sacar(valor);
          System.out.println("Saque realizado com sucesso.");
        }
        else if(escolha == 4){
          System.out.println("Informe o número da conta da qual deseja depositar. \nConta: ");
          Integer numC = scanner.nextInt();
          Conta contaDepositar = banco.procurar(numC);
          System.out.println("Informe o valor que deseja depositar. \nValor: ");
          Integer valor = scanner.nextInt();
          contaDepositar.depositar(valor);
          System.out.println("Depósito realizado com sucesso.");
        }
        else if(escolha == 5){
          System.out.println("Informe o valor que deseja transferir. \nValor: ");
          Integer valor = scanner.nextInt();
          System.out.println("Informe o número da conta para a qual deseja transferir. \nConta: ");
          Integer numC2 = scanner.nextInt();
          Conta contaDepositar2 = banco.procurar(numC2);
          contaDepositar2.transferir(valor, contaDepositar2);
          System.out.println("Transferência realizada com sucesso.");
        }
      }
      else{System.out.println("Escolha inválida.");}

      System.out.println("Informe o número do que deseja: \n[1] Adicionar conta \n[2] Procurar conta \n[3] Sacar \n[4] Depositar \n[5] Transferir \n[6] Sair");
      scanner = new Scanner(System.in);
      escolha = scanner.nextInt();
    } 
  }
}
