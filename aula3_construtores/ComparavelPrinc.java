package aula3_construtores;

/* Escreva uma classe chamada “Comparavel” que tem como atributo um valor inteiro, um construtor para inicializar 
o atributo e os métodos “eMaiorOuIgual”, “eMenorOuIgual” e “eDiferenteDe” que recebem um valor do tipo int
como parâmetro e retornam true se o valor do atributo for, respectivamente, maior ou igual, menor ou igual ou 
diferente do passado como parâmetro. 

Crie uma classe executável para testar a classe acima. */

public class ComparavelPrinc {
  public static void main(String args[]){
    Comparavel teste = new Comparavel(12);
    teste.eDiferenteDe(12);
    teste.eMaiorOuIgual(33);
    teste.eMenorOuIgual(2);
  }
}
