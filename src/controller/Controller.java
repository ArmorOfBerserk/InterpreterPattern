package controller;

import interpreter.Espressione;
import interpreter.ExpAndSpecifica;
import interpreter.ExpOrSpecifica;
import interpreter.ExpTerminaleGenerale;

public class Controller {



    public void initialize(){
        Espressione simone = new ExpTerminaleGenerale("simone");
        Espressione virgin = new ExpTerminaleGenerale("virgin");

        Espressione isVirgin = new ExpOrSpecifica(simone, virgin);
        Espressione absVirgin = new ExpAndSpecifica(simone, virgin);

        System.out.println(isVirgin.interpreter("simone"));

        //E' giusto se la stringa contiene entrambi i valori
        System.out.println(absVirgin.interpreter("simone, virgin"));

    }
}
