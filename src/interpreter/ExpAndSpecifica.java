package interpreter;

public class ExpAndSpecifica implements Espressione {

    Espressione exp1;
    Espressione exp2;

    public ExpAndSpecifica(Espressione exp1, Espressione exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpreter(String s) {
        return exp1.interpreter(s) && exp2.interpreter(s);
    }
}
