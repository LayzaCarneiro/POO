package aula5_heranca_polimorfismo;

public class Tecnico extends Funcionario{
  public int horasExtra;

  public Tecnico(int matricula, String nome, int horasExtra){
    super(matricula, nome);
    this.horasExtra = horasExtra;
  }

  public void calcularSalario(){
    salario = salario + horasExtra*15;
  }

  public void imprimirDados(){
    super.imprimirDados();
  }

}
