/* Exercício 1
1) Faça um programa que receba dois números reais (double), calcule e mostre a média entre eles.
2) Caso a média seja maior que 7, mostrar a mensagem “Aprovado”, senão mostrar “Reprovado”
*/

package aula1_introducao;
import java.util.Scanner;

public class questao1 {
  public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Primeiro número: ");
    double N1 = teclado.nextDouble();
    System.out.print("Segundo número: ");
    double N2 = teclado.nextDouble();
    double media = (N1+N2)/2;
    System.out.println(String.format("Sua nota foi %s", media));
    if(media > 7){
      System.out.println("APROVADO!");
    } else{
      System.out.println("REPROVADO!");
    }
    teclado.close();
  }
}
