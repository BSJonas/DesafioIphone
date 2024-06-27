public class Principal {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();

		System.out.println("Função reprodutor de musica");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();

		System.out.println("\nFunção Telefone");
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();

//		System.out.println("");
		System.out.println("\nFunção navegador");
		iphone.exibePagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
	}
}
