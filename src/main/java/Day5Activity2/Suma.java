package Day5Activity2;

public class Suma extends Calculadora {
    double suma;

    public Suma(double primerOperando, double segundoOperando){
        super(primerOperando, segundoOperando, '+');
        this.suma = primerOperando + segundoOperando;
        this.setRes(this.suma);
    }
}
