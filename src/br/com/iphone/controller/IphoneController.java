package br.com.iphone.controller;

import br.com.iphone.model.Iphone;
import br.com.iphone.view.IphoneView;

public class IphoneController {
    private Iphone model;
    private IphoneView view;

    public IphoneController(Iphone model, IphoneView view) {
        this.model = model;
        this.view = view;
    }

    public void executarAcaoReprodutorMusical() {
        model.play();
        view.exibirDetalhesSmartphone("Reproduzindo música no smartphone.");
    }

    public void executarAcaoTelefone(String number) {
        model.call(number);
        view.exibirDetalhesSmartphone("Ligando para " + number + "...");
    }

    public void executarAcaoNavegador(String url) {
        model.showPage(url);
        view.exibirDetalhesSmartphone("Exibindo página: " + url);
    }
}