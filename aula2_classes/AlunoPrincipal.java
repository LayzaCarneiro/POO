package aula2_classes;
// import java.util.Scanner;

public class AlunoPrincipal {
  public static void main(String args[]){
    /*Aluno a1 = new Aluno();
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o nome: ");
    a1.nome = teclado.next();
    System.out.print("Digite o curso: ");
    a1.curso = teclado.next();
    System.out.print("Digite a matrícula: ");
    a1.matricula = teclado.nextInt();
    System.out.print("Digite o ano do nascimento: ");
    a1.ano = teclado.nextInt();
    System.out.print("Digite o ano atual: ");
    int anoAtual1 = teclado.nextInt();
    int idade1 = a1.calcularIdade(anoAtual1);
    System.out.println("Idade = " + idade1);

    Aluno a2 = new Aluno();
    System.out.print("Digite o nome: ");
    a2.nome = teclado.next();
    System.out.print("Digite o curso: ");
    a2.curso = teclado.next();
    System.out.print("Digite a matrícula: ");
    a2.matricula = teclado.nextInt();
    System.out.print("Digite o ano do nascimento: ");
    a2.ano = teclado.nextInt();
    System.out.print("Digite o ano atual: ");
    int anoAtual2 = teclado.nextInt();
    int idade2 = a2.calcularIdade(anoAtual2);
    System.out.println("Idade = " + idade2);

    teclado.close();*/

    /*Aluno a1 = new Aluno();
    a1.nome = "André";
    a1.curso = "Medicina";
    a1.matricula = 1234;
    a1.ano = 1990;
    a1.mostrarDados();
    int idade1 = a1.calcularIdade(2022);
    System.out.println("Idade = " + idade1);

    System.out.println();

    Aluno a2 = new Aluno();
    a2.nome = "Erica";
    a2.curso = "Psicologia";
    a2.matricula = 5678;
    a2.ano = 1992;
    a2.mostrarDados();
    int idade2 = a2.calcularIdade(2022);
    System.out.println("Idade = " + idade2);*/


    //CONSTRUTOR
    Aluno a1 = new Aluno("André", "Medicina", 1234, 1997);
    a1.mostrarDados();
    int idade1 = a1.calcularIdade(2022);
    System.out.println("Idade = " + idade1);
    System.out.println();

    Aluno a2 = new Aluno("Erika", 8675);
    a2.mostrarDados();
    int idade2 = a2.calcularIdade(2022);
    System.out.println("Idade = " + idade2);
  }

}
