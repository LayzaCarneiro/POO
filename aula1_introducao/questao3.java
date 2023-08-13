/* Exercício 3
1) Faça um programa que peça ao usuário para entrar com 7 números inteiros e armazene-os em um vetor. 
Peça também para ele entrar com outro número inteiro X e determine se X está no vetor e em que posição.

2) Considerando o vetor da questão anterior, verifique se os números estão em ordem crescente. 
Caso contrário, ordene e imprima o vetor.*/

package aula1_introducao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class questao3 {
  public static void main(String args[]){
    List<Integer> numbers = new ArrayList<>();
    Scanner dados = new Scanner(System.in);

    for(int i=1; i<=7; i++){
      System.out.print(String.format("Digite o número %s: ", i));
      Integer number = dados.nextInt();
      numbers.add(number);
    }

    System.out.print("Digite X: ");
    Integer xValue = dados.nextInt();

    System.out.println();
    for(int i=0; i < 5; i++){
      if(xValue == numbers.get(i)){
        System.out.println(String.format("X (%s) encontrado na lista na posição %s", xValue, i));
      }
    }

    System.out.println("Lista: " + numbers);
    dados.close();
  }
}
