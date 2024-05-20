import controller.ImpostoController;
import model.Pis;
import view.TelaPis;

public class TestCalc {

    public static void main(String[] args) {
        Pis model = new Pis();
        TelaPis tela = new TelaPis();

        model.addObserver(tela);

        ImpostoController controller = new ImpostoController(model, tela);

        tela.addController(controller);
    }
}
