package aula3_construtores;

/* Escreva uma classe chamada “Comparavel” que tem como atributo um valor inteiro, um construtor para inicializar 
o atributo e os métodos “eMaiorOuIgual”, “eMenorOuIgual” e “eDiferenteDe” que recebem um valor do tipo int
como parâmetro e retornam true se o valor do atributo for, respectivamente, maior ou igual, menor ou igual ou 
diferente do passado como parâmetro. 

Crie uma classe executável para testar a classe acima. */

public class Comparavel {
  int valor;

  public Comparavel(int valor){
    this.valor = valor;
  }

  boolean eMaiorOuIgual(int value){
    if(this.valor >= value){
      System.out.println("true");
      return true;
    }
    else{
      System.out.println("false");
      return false;
    }
  }
  
  boolean eMenorOuIgual(int value){
    if(this.valor <= value){
      System.out.println("true");
      return true;
    }
    else{
      System.out.println("false");
      return false;
    }
  }

  boolean eDiferenteDe(int value){
    if(this.valor != value){
      System.out.println("true");
      return true;
    }
    else{
      System.out.println("false");
      return false;
    }
  }
}
