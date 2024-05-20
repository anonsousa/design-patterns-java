package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

public class TelaPis implements TelaImposto, Observer {

    private TextField txtValue;
    private Button btnCalc;

    public TelaPis() {
        Frame frame = new Frame("Calc Pis Tax");
        frame.add("North", new Label("Value to calc"));
        txtValue = new TextField();
        frame.add("Center", txtValue);

        Panel panel = new Panel();
        btnCalc = new Button("Calc");
        panel.add(btnCalc);
        frame.add("South", panel);

        frame.addWindowListener(new CloseListener());
        frame.setSize(200, 150);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }

    public void addController(ActionListener controller){
        btnCalc.addActionListener(controller);
    }

    @Override
    public float getValue() {
        return Float.parseFloat(txtValue.getText());
    }

    @Override
    public void update(Observable model, Object state) {
        String msg = model.getClass() + " " + state;
        JOptionPane.showMessageDialog(null, msg);
    }

    public static  class CloseListener extends WindowAdapter{
        public void windowClosing(WindowEvent event){
            event.getWindow().setVisible(false);
            System.exit(0);
        }
    }

}
