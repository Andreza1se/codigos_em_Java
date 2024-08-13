package universidade;
import java.util.ArrayList;
import java.util.List;

public class Universidade {
	public String nome;
	public String endereco;
	public List<Funcionario> funcionarios; 
	public List<Departamento> departamentos;
	
	
	
	public Universidade(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.funcionarios = new ArrayList<>();
		this.departamentos = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
