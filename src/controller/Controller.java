package controller;

import interpreter.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {


    public TextField campoExp1;
    public TextField campoExp2;
    public Circle cerchioOr;
    public Circle cerchioAnd;
    public Circle cerchioNot;
    public Button valutaButton;
    Espressione exp1;
    Espressione exp2;
    Espressione expOr;
    Espressione expAnd;
    Espressione expNot;

    public void initialize(){

        exp1 = new ExpTerminaleGenerale(campoExp1.getText());
        exp2 = new ExpTerminaleGenerale(campoExp2.getText());

        expOr = new ExpOrSpecifica(exp1,exp2);
        expAnd =new ExpAndSpecifica(exp1,exp2);
        expNot = new ExpNotSpecific(exp1);

    }

    public void valuta(ActionEvent actionEvent) {
        cerchioAnd.setFill(Color.WHITE);
        cerchioOr.setFill (Color.WHITE);
        cerchioNot.setFill(Color.WHITE);

        if(expOr.interpreter(campoExp1.getText()))
            cerchioOr.setFill(Color.GREEN);

        else
            cerchioOr.setFill(Color.RED);

        if(expAnd.interpreter(campoExp1.getText() + campoExp2.getText()))
            cerchioAnd.setFill(Color.GREEN);

        else
            cerchioAnd.setFill(Color.RED);

        if(expNot.interpreter(campoExp1.getText()))
            cerchioNot.setFill(Color.GREEN);

        else
            cerchioNot.setFill(Color.RED);


    }
}
