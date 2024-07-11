package representacao.multifuncional;

import representacao.navegador.Navegador;
import representacao.reprodutor.ReprodutorMusical;
import representacao.telefone.AparelhoTelefonico;

public class Iphone implements Navegador, ReprodutorMusical, AparelhoTelefonico{

	public void exibirPagina(String url) {
		System.out.println("Exibindo " + url + " no Iphone");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando aba no Iphone");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página no Iphone");
	}
	
	public void tocar() {
		System.out.println("Tocando música no Iphone");
	}

	public void pausar() {
		System.out.println("Pausando música no Iphone");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música \"" + musica + "\" no Iphone");
	}
	
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + " pelo Iphone");		
	}
	
	public void atender() {
		System.out.println("Atendendo pelo Iphone");		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz pelo Iphone");		
	}
}
