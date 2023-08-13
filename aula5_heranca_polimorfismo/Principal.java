package aula5_heranca_polimorfismo;

public class Principal {
  public static void main(String[] args) {
    Universidade uni = new Universidade("UECE");
    Funcionario P1 = new Professor(123, "Carlos", "mestre", 20, false);
    Funcionario P2 = new Professor(456, "Ana", "doutor", 40, true);
    Funcionario sec1 = new Secretario(555, "João", 30);
    Funcionario sec2 = new Secretario(777, "Ana", 40);
    Funcionario tec1 = new Tecnico(345, "Paulo", 35);
    Funcionario tec2 = new Tecnico(890, "Clara", 0);

    uni.adicionarFuncionario(P1);
    uni.adicionarFuncionario(P2);
    uni.adicionarFuncionario(sec1);
    uni.adicionarFuncionario(sec2);
    uni.adicionarFuncionario(tec1);
    uni.adicionarFuncionario(tec2);
    uni.gerarFolha();


  }
}
