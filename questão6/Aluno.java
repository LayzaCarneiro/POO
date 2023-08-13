package questão6;

public class Aluno extends Pessoa{
  private String curso;

  public Aluno (String nome, int matricula, String curso){
    super(nome, matricula);
    this.curso = curso;
  }

  public boolean emprestarLivro(Livro l){
    if(livrosEmp.size() > 2){
      return false;
    }
    else{
      livrosEmp.add(l);
      return true;
    }
  }

  public double devolverLivro(String titulo, int qtdDias){
    double multa = 0;

    if(qtdDias > 7){
      multa = 0.5 * (qtdDias - 7);
    }

    for(Livro l : livrosEmp){
      if(l.getTitulo().equals(titulo)){
        livrosEmp.remove(l);
        break;
      }
    }

    return multa;
  }

  public double devolverLivro(int qtdDias){
    double multa = 0;

    if(qtdDias > 7){
      multa = 0.5 * (qtdDias - 7);
    }

    livrosEmp.clear();
    return multa;
  }
}
