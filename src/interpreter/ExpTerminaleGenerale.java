package interpreter;

public class ExpTerminaleGenerale implements Espressione {

    String exp;

    public ExpTerminaleGenerale(String exp) {
        this.exp = exp;
    }


    //Questo è il metodo che controlla se due espressioni (che in questo caso sono stringe),
    // sono uguali oppure no, con il metodo contains di String
    @Override
    public boolean interpreter(String s) {
        return s.contains(exp);
    }
}
