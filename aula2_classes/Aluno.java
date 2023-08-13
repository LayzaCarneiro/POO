package aula2_classes;

public class Aluno {
  private String nome;
  private String curso;
  private int matricula;
  private int ano;

  //Construtor
  public Aluno(String n, String c, int m, int a){
    this.nome = n;
    this.curso = c;
    this.matricula = m;
    this.ano = a;
  }
  public Aluno(String nome, int m){
    this.nome = nome;
    this.matricula = m;
  };

  void mostrarDados(){
    System.out.println("Nome = " + this.nome);
    System.out.println("Curso = " + this.curso);
    System.out.println("Matrícula = " + this.matricula);
  }

  int calcularIdade(int anoAtual){
    int idade = anoAtual - ano;
    return idade;
  }
}
