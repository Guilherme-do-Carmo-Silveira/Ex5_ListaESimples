package model;

public class music {

	public String nome;
	public String artista;
	public int duracao;
	
	
	@Override
	public String toString() {
		return "Nome = " + nome + " | Artista = " + artista + " | Duração = " + duracao/1000 + " segundos";
	} 
}
