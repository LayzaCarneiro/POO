package aula5_heranca_polimorfismo;

public class Secretario extends Funcionario{
  private int cargaHoraria;

  public Secretario(int matricula, String nome, int cargaHoraria){
    super(matricula, nome);
    this.cargaHoraria = cargaHoraria;
  }

  public void calcularSalario(){
    if (cargaHoraria == 20 || cargaHoraria == 30){
      salario = 8 * cargaHoraria * 4;
    }else{salario = 10 * cargaHoraria * 4;}
  }

  public void imprimirDados(){
    super.imprimirDados();
  }
}
