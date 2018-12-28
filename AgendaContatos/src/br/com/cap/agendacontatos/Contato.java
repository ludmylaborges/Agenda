package br.com.cap.agendacontatos;

public class Contato {

	private String nome;
	private String telefone;
	private String email;
	
	
	public Contato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 != null && arg0 instanceof Contato) {
			Contato contatoComparado = (Contato) arg0;
			if(this.nome.equals(contatoComparado.getNome())){
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
