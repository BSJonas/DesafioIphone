import internet.Navegador;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, Navegador, AparelhoTelefonico {

	@Override public void tocar() {
		System.out.println("Tocando música");
	}

	@Override public void pausar() {
		System.out.println("Musica pausada");
	}

	@Override public void selecionarMusica() {
		System.out.println("Selecionado músicas");
	}
	@Override public void exibePagina() {
		System.out.println("Pagina sendo exibida");
	}

	@Override public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	@Override public void ligar() {
		System.out.println("Fazendo ligação");
	}

	@Override public void atender() {
		System.out.println("Atendendo ligação");
	}

	@Override public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
}
