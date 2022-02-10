

public class Division  extends Operacion{
    double div = 0;
    public Division(int valor1, int valor2) { 
        super(valor1,valor2,'/');
            if(valor2==0)
                System.out.println("no se puede division entre cero");
            else this.div = valor1 / valor2;
             this.setRes(this.div);
}
}
