package Day5Activity2;

public class Multiplicacion extends Calculadora{

    double mult;

    public Multiplicacion(double primerOperando, double segundoOperando){
        super(primerOperando, segundoOperando, '*');
        this.mult = primerOperando * segundoOperando;
        this.setRes(this.mult);
    }
}
