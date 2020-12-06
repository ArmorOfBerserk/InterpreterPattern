package interpreter;

public class ExpNotSpecific implements Espressione {

    Espressione exp;

    public ExpNotSpecific(Espressione exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpreter(String s) {
        return !(exp.interpreter(s));
    }
}
