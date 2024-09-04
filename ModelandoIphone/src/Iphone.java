public abstract class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void tocarMusica() {
        ReprodutorMusical.super.tocarMusica();
    }

    @Override
    public void pausarMusica() {
        ReprodutorMusical.super.pausarMusica();
    }

    @Override
    public void pararMusica() {
        ReprodutorMusical.super.pararMusica();
    }

    public void adicionarMusica(String musica) {
        ReprodutorMusical.super.adicionarMusica(musica);
    }

    public void removerMusica(String musica) {
        ReprodutorMusical.super.removerMusica(musica);
    }

    @Override
    public void fazerLigacao() {
        AparelhoTelefonico.super.fazerLigacao();
    }

    @Override
    public void receberLigacao() {
        AparelhoTelefonico.super.receberLigacao();
    }

    @Override
    public void rejeitarLigacao() {
        AparelhoTelefonico.super.rejeitarLigacao();
    }

    @Override
    public void abrirPagina() {
        NavegadorInternet.super.abrirPagina();
    }

    @Override
    public void fecharPagina() {
        NavegadorInternet.super.fecharPagina();
    }

    @Override
    public void navegarPagina() {
        NavegadorInternet.super.navegarPagina();
    }

    @Override
    public void atualizarPagina() {
        NavegadorInternet.super.atualizarPagina();
    }

    public static void main(String[] args) {

        Iphone iphone = new Funcionalidade();

        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.pararMusica();
        iphone.adicionarMusica("Esperando Aviões");
        iphone.removerMusica("Romênticos");
        iphone.fazerLigacao();
        iphone.receberLigacao();
        iphone.rejeitarLigacao();
        iphone.abrirPagina();
        iphone.fecharPagina();
        iphone.atualizarPagina();

    }
}