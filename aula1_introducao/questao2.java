/* Exercício 2
Faça um programa que receba o nome e a idade de um 5 pessoas e mostre o nome e a idade da pessoa mais nova e 
da pessoas mais velha 
*/

package aula1_introducao;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class questao2 {
  public static void main(String args[]){
    List<String> nomes = new ArrayList<>();
    List<Integer> idades = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    for(int i=1; i <= 5; i++){
      System.out.print(String.format("Digite o nome %s: ", i));
      String nome = scanner.next();
      System.out.print(String.format("Digite a idade %s: ", i));
      Integer idade = scanner.nextInt();
      nomes.add(nome);
      idades.add(idade);
      //idades.add(Integer.parseInt(idade)); --> para transfomar string em int
    }

    Integer idadeMax = Integer.MIN_VALUE;
    Integer idadeMin = Integer.MAX_VALUE;

    for(Integer idade : idades){
      if (idade < idadeMin){idadeMin = idade;}
      if (idade > idadeMax){idadeMax = idade;}
    }

    for(int i=0; i < 5; i++){
      if(idadeMin == idades.get(i)){
        System.out.println("Nome da pessoa mais nova: " + nomes.get(i));
        System.out.println("Idade da pessoa mais nova: " + idades.get(i));
      }
      if(idadeMax == idades.get(i)){
        System.out.println("Nome da pessoa mais velha: " + nomes.get(i));
        System.out.println("Idade da pessoa mais velha: " + idades.get(i));
        break;
      }
    }
    scanner.close();
  }
}
