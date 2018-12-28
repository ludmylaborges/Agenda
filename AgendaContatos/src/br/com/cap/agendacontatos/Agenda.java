package br.com.cap.agendacontatos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List<Contato> contatos = new ArrayList<Contato>(); 

	public void inserirContato(Contato contato){
		contatos.add(contato); 
	}
	
	public void removerContato(Contato contato){
//		Contato contatoASerRemovido = this.buscarPorTelefone(contato.getTelefone());
//		contatos.remove(contatoASerRemovido);
	
		
		for(int i=0;i<contatos.size();i++) {
			if(contato.getNome().equals(contatos.get(i).getNome())) {
				contatos.remove(i);
				break;
			}
		}
	}
	
	public int quantidadeDeContatos(){ 
	  return contatos.size(); 
	}
	
	public Contato buscarPorTelefone(String telefone){
	
		for(Contato contato: contatos){
			if(contato.getTelefone().equals(telefone)) {
				return contato;
			} 
		}	
		return null;	
	}

	public Contato buscarContato(String nome) {
		
		for(Contato contato: contatos){
			if(contato.getNome().equals(nome)) {
				return contato;
			}
		}
		return null;
	}
		}



/*inserirContato
buscarContato (*OBS: Pode ser possível que retorne um array de contatos também*)
removerContato
quantidadeDeContatos
buscarPorTelefone*/
	
