package aula5_heranca_polimorfismo;

public class Professor extends Funcionario {
  private String titulação;
  private int cargaHoraria;
  private boolean isCoordenador;

  public Professor(int matricula, String nome, String titulação, int cargaHoraria, boolean isCoordenador){
    super(matricula, nome);
    this.titulação = titulação;
    this.cargaHoraria = cargaHoraria;
    this.isCoordenador = isCoordenador;
  }

  public void calcularSalario(){
    if(titulação.contentEquals("mestre")){
      salario = cargaHoraria * 80;
    }else{
      salario = cargaHoraria * 100;
    }

    if(isCoordenador){
      salario += salario*0.2;
    }
  }

  public void imprimirDados(){
    super.imprimirDados();
    System.out.println("Professor titulação: " + titulação + "\nCarga horária: " + cargaHoraria + "\nProfessor coordenador: " + isCoordenador);
  }

}
