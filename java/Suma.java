

public class Suma extends Operacion{
    double suma;
    public Suma(int valor1,int valor2){
        super(valor1,valor2,'+');
        this.suma=valor1+valor2;
        this.setRes(this.suma);
    }
   
}
