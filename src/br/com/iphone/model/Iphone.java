package br.com.iphone.model;


public class Iphone implements Browser, Phone, MusicPlayer {

    @Override
    public void showPage(String url) {
        System.out.println("Exibindo página: " + url);

    }

    @Override
    public void newTab() {
        System.out.println("Nova aba adicionada.");

    }

    @Override
    public void refreshPage() {
        System.out.println("Página atualizada.");

    }

    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");

    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Música selecionada: " + music);

    }

    @Override
    public void call(String number) {
        System.out.println("Ligando para " + number + "...");

    }

    @Override
    public void meet() {
        System.out.println("Atendendo chamada...");

    }

    @Override
    public void playVoiceMessage() {
        System.out.println("Iniciando correio de voz...");

    }


}
