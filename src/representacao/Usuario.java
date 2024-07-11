package representacao;

import representacao.multifuncional.Iphone;

public class Usuario {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.exibirPagina("github.com");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("Never Gonna Give You Up");
		
		iphone.ligar("(99)99999-9999");
		iphone.atender();
		iphone.iniciarCorreioVoz();
	}
}
