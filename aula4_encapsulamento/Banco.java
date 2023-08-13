package aula4_encapsulamento;

/* Crie uma classe Banco que possui como atributos um nome e um vetor de contas. Faça um construtor que recebe o 
nome do banco e a quantidade de elementos no vetor, e inicialize os atributos. Faça também métodos de procurar uma
conta (passando como parâmetro o número da conta), cadastrar uma nova conta e transferir entre contas.

Crie uma classe Principal que instancie um banco e forneça ao usuário um menu para ele criar contas, sacar e depositar.
*/

public class Banco {
	private String nome;
	private Conta[] contas;
	private int qtdeContas=0;
	private int totalContas;

	public Banco(String nome, int totalContas) {
		this.nome = nome;
		this.totalContas = totalContas;
		contas = new Conta[totalContas];
	}

	public boolean adicionar(Conta c) {
		if (qtdeContas < totalContas){
			contas[qtdeContas] = c;
			qtdeContas++;
		}
		else
			return false;

		return true;
	}

	public Conta procurar(int numero) {
		for (int i=0; i<qtdeContas; i++) {
			if (contas[i].getNumero() == numero)
				return contas[i];
		}
		return null;
	}

    public int posConta(int numero) {
		for (int i=0; i<qtdeContas; i++) {
			if (contas[i].getNumero() == numero)
				return i;
		}
        return 6;
	}
}
