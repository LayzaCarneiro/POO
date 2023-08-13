package aula3_construtores;

/* Escreva uma classe “Potência” que tem dois atributos inteiros: x, y. Crie um construtor que recebe esses valores 
e um método “elevar” que calcula e retorna o valor de x elevado a y (atenção: não vale usar classes matemáticas!).

Crie uma classe executável para testar a classe acima. */

public class Potencia {
  int x;
  int y;

  public Potencia(int x, int y){
    this.x = x;
    this.y = y;
  }
  double elevar(){
    double z = this.x;
    if(this.y == 0){z=1;}
    else if(this.y > 0){
      for(int i=1; i < this.y; i++){
        z = z*this.x;
      }
    }
    else if(this.y < 0){
      for(int i=-1; i > this.y; i--){
        z = z*this.x;
      }
      z = 1/z;
    }
    return z;
  }
}
