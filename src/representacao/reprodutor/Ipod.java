package representacao.reprodutor;


public class Ipod implements ReprodutorMusical{

	public void tocar() {
		System.out.println("Tocando música no Ipod");
	}

	public void pausar() {
		System.out.println("Pausando música no Ipod");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música " + musica + " no Ipod");
	}

}
