package questão6;

public class Principal {
  public static void main(String args[]){
    Livro livro1 = new Livro("Paulo Coelho", "O Alquimista");
    Livro livro2 = new Livro("Marco Aurélio", "Meditações");

    Aluno aluno1 = new Aluno("Layza", 1631378, "Computação");
    Professor prof1 = new Professor("Paulo Henrique", 12345, "doutor");

    aluno1.emprestarLivro(livro1);
    aluno1.emprestarLivro(livro2);
    prof1.emprestarLivro(livro2);
    prof1.devolverLivro(livro2.getTitulo(), 10);

    System.out.println("Multa do aluno1: " + aluno1.devolverLivro(livro1.getTitulo(), 10));
    System.out.println("Multa do professor: " + prof1.devolverLivro(livro2.getTitulo(), 10));
  }
}
