package questao5;

import java.util.ArrayList;

public class SetorPessoal {
  private ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();

  public void adicionarFuncionario(Funcionario f){
    funcs.add(f);
  }

  public void imprimirFolha(){
    double valorTotal = 0;
    for(Funcionario f : funcs){
      valorTotal += f.getSalario();
      System.out.println("Nome do funcionário: " + f.getNome());
      System.out.println("Salário do funcionário: " + f.getSalario());
      System.out.println("Valor total: " + valorTotal);
    }
  }

  public String maiorSalario(){
    double maiorSalario = 0;
    String nomeMaiorSalario = "";
    for(Funcionario f : funcs){
      if(f.getSalario() > maiorSalario){
        maiorSalario = f.getSalario();
        nomeMaiorSalario = f.getNome();
      }
    }
    return nomeMaiorSalario;
  }
}
