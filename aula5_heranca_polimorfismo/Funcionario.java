package aula5_heranca_polimorfismo;

public class Funcionario {
  protected int matricula;
  protected String nome;
  protected double salario;

  public Funcionario(int matricula, String nome){
    this.matricula = matricula;
    this.nome = nome;
    salario = 1000;
  }

  public void imprimirDados(){
    System.out.println("Matrícula = " + matricula);
    System.out.println("Nome = " + nome);
    System.out.println("Salário = " + salario);
  }

  public void calcularSalario(){
    salario = 1000;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }


}
