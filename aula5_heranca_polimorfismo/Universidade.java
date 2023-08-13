package aula5_heranca_polimorfismo;

import java.util.ArrayList;

public class Universidade {
  private String nome;
  private ArrayList<Funcionario> funcs;

  public Universidade(String nome){
    this.nome = nome;
    funcs = new ArrayList<Funcionario>();
  }

  public void adicionarFuncionario(Funcionario f){
    funcs.add(f);
  }

  public void gerarFolha(){
    double totalSalarios = 0;
    for(Funcionario f: funcs){
      f.calcularSalario();
      totalSalarios += f.getSalario();
      System.out.println("===================");
      f.imprimirDados();
      System.out.println("===================");
    }
    System.out.println("Total pago no mês: " + totalSalarios);
  }

}
