package controller;

import model.Imposto;
import view.TelaImposto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImpostoController implements ActionListener {

    private Imposto model;
    private TelaImposto tela;

    @Override
    public void actionPerformed(ActionEvent e) {
        model.calcTax(tela.getValue());
    }

    public ImpostoController(Imposto model, TelaImposto tela){
        this.model = model;
        this.tela = tela;
    }
}
