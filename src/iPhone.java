public class iPhone {
    private String modelo;

    public iPhone(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void tocarMusica() {
        System.out.println("Tocando música...aguarde");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void pausarMusica() {
        System.out.println("Pausando a música.");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarConversaVoz() {
        System.out.println("Iniciando conversa de voz.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página da web.");
    }
}
