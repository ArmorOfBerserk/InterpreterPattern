package interpreter;

public class ExpOrSpecifica implements Espressione {
/*    Essendo specifica, si passa delle espressioni per controllarle*/

    Espressione exp1;
    Espressione exp2;

    //Essendo un'espressione specifica, si prende due exp come
    // parametro perche' l'operatore è binario
    public ExpOrSpecifica(Espressione exp1, Espressione exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpreter(String s) {
        return exp1.interpreter(s) || exp2.interpreter(s);
    }
}
