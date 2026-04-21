class iPhone {
    void tocar() {}
    void selecionarMusica(String musica) {}
    void ligar(String numero) {}
    void exibirPagina(String url) {}
}

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.tocar();
        iphone.selecionarMusica("Imagine - John Lennon");

        iphone.ligar("31999999999");

        iphone.exibirPagina("https://www.google.com");
    }
}