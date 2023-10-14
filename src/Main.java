public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone("iPhone X");

        meuIPhone.tocarMusica();
        meuIPhone.selecionarMusica("Bonde do Tigrão");
        meuIPhone.pausarMusica();

        meuIPhone.ligar("99999-999");
        meuIPhone.atender();
        meuIPhone.iniciarConversaVoz();

        meuIPhone.exibirPagina("https://www.linkedin.com/in/bruno-gouveia-ab4b3b11a/");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
