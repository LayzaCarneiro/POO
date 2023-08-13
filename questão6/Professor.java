package questão6;

public class Professor extends Pessoa {
  private String titulação;

  public Professor (String nome, int matricula, String titulação){
    super(nome, matricula);
    this.titulação = titulação;
  }

  public boolean emprestarLivro(Livro l){
    if(livrosEmp.size() > 3){
      return false;
    }
    else{
      livrosEmp.add(l);
      return true;
    }
  }

  public double devolverLivro(String l, int qtdDias){
    double multa = 0;
    if(qtdDias > 7){
      if(this.titulação == "mestre"){
        multa = 0.8 * (qtdDias - 7);
      }
      else{
        multa = 1 * (qtdDias - 7);
      }
    }

    livrosEmp.remove(l);
    return multa;
  }

  public double devolverLivro(int qtdDias){
    double multa = 0;
    if(qtdDias > 7){
      if(this.titulação == "mestre"){
        multa = 0.8 * (qtdDias - 7);
      }
      else{
        multa = 1 * (qtdDias - 7);
      }
    }
    livrosEmp.clear();
    return multa;
  }
}
