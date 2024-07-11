package representacao.navegador;

public class Chrome implements Navegador{

	public void exibirPagina(String url) {
		System.out.println("Exibindo " + url + " no Chrome");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando aba no Chrome");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página no Chrome");
	}

}
