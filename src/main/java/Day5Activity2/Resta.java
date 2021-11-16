package Day5Activity2;

public class Resta extends Calculadora{
    double resta;

    public Resta(double primerOpernado, double segundoOperando){
        super(primerOpernado, segundoOperando, '-');
        this.resta = primerOpernado - segundoOperando;
        this.setRes(this.resta);
    }
}
