package questão6;

import java.util.ArrayList;

public abstract class Pessoa {
  protected String nome;
  protected int matricula;
  protected ArrayList<Livro> livrosEmp = new ArrayList<Livro>();

  public Pessoa(String nome, int matricula){
    this.nome = nome;
    this.matricula = matricula;
  }

  public abstract boolean emprestarLivro(Livro l);
  public abstract double devolverLivro(String l, int qtdDias);
  public abstract double devolverLivro(int qtdDias);
}
