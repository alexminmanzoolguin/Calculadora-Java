

public class Multipicacion extends Operacion{
double multi;
public Multipicacion(int valor1,int valor2){
    super(valor1,valor2,'*');
    this.multi=valor1*valor2;
    this.setRes(this.multi);
}
}
