package Day5Activity2;

public class Division extends Calculadora{
    double division;
    public Division(double primerOperando, double segundoOperando){
        super(primerOperando, segundoOperando, '/');
        if(segundoOperando==0) System.out.println("error");
        else  this.division = primerOperando/segundoOperando;
        this.setRes(this.division);
    }
}
