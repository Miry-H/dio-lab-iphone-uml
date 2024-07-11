package representacao.telefone;

public class Telefone implements AparelhoTelefonico{

	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "  pelo Telefone");		
	}
	
	public void atender() {
		System.out.println("Atendendo pelo Telefone");		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz pelo Telefone");		
	}
}
