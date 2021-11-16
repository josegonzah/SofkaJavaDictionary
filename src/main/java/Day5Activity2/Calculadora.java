package Day5Activity2;

public class Calculadora {
    double primerOperando;
    double segundoOperando;
    double ans;
    char operador;

    public Calculadora(double primerOperando, double segundoOperando, char operador){
        this.primerOperando = primerOperando;
        this.segundoOperando = segundoOperando;
        this.operador = operador;
    }

    public void calcular(){
        System.out.println(this.primerOperando+" "+this.operador+" "+this.segundoOperando + " = "+this.ans);
    }

    protected void setRes(double ans) {
        this.ans = ans;
    }
}
