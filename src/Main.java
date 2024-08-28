import br.com.iphone.controller.IphoneController;
import br.com.iphone.model.Iphone;
import br.com.iphone.view.IphoneView;

public class Main {
    public static void main(String[] args) {
        Iphone model = new Iphone();
        IphoneView view = new IphoneView();
        IphoneController controlador = new IphoneController(model, view);

        controlador.executarAcaoReprodutorMusical();
        controlador.executarAcaoTelefone("+55 69 98147 7497");
        controlador.executarAcaoNavegador("www.rodrigotoledo.mat.br");
    }
}