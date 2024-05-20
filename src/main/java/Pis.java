import java.util.Observable;

public class Pis extends Observable implements Imposto{

    private float aliquota = 0.6f;

    private float valuePis;

    @Override
    public void calcTax(float value) {
        setChanged();
        valuePis = value * aliquota;
        notifyObservers(valuePis);
    }

    public float getValuePis() {
        return valuePis;
    }
}
