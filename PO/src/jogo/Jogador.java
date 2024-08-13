package jogo;
import java.util.ArrayList;
import java.util.List;

public class Jogador {
	private final String nome;
	private int vida;
	private int armadura;
	private List<Jogavel> jogaveis;
	
	public Jogador(String nome, int vida, int armadura) {
		super();
		
		this.armadura = armadura;
		this.vida = vida;
		this.nome = nome;
		this.jogaveis = new ArrayList<>();
		
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	public String getNome() {
		return nome;
	}
	public void adicionarJogavel(Jogavel jogavel) {
		jogaveis.add(jogavel);
	}
	
	public void imprimirInformacoes() {
		System.out.println("Jogador{"+
					"nome='" + nome + '\'' +
					",vida" + vida +
					", armadura=" + armadura +
					'}');
		for(Jogavel jogavel : jogaveis) {
			jogavel.imprimirInformacoes();
		}
	}
	
}
