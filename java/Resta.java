

public class Resta extends Operacion {
double resta;
    public Resta(int valor1, int valor2) {
     super(valor1, valor2, '-');
     this.resta=valor1-valor2;
     this.setRes(this.resta);
    }

}
