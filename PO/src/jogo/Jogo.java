package jogo;
import java.util.ArrayList;
import java.util.List;

public class Jogo {
	public List<Jogador> jogadores;
	public final String nome;
	
	public Jogo(String nome ) {
		super();
		this.nome = nome;
		this.jogadores = new ArrayList<>();
	}
	
	public String getNome () {
		return nome;
	}
	
	
}
