package br.com.cap.agendacontatos;

public class Main {

	public static void main(String[] args) {
		
		Contato contato = new Contato("Ludy", "98777777", "lud@hotmail.com");
		Agenda agenda = new Agenda();
		agenda.inserirContato(contato);
		
		Contato contato1 = new Contato("Michel", "99444444", "michel@outlook.com"); 
		agenda.inserirContato(contato1);
		
		Contato contato2 = new Contato("Carol", "98888585", "carol@gmail.com");
		agenda.inserirContato(contato2);
		
		agenda.removerContato(contato2);
		
		
		

		
		

	}

}
