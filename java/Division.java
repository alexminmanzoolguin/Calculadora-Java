

public class Division  extends Operacion{
    public Division(int valor1, int valor2) { 
        super(valor1,valor2,'/');
            if(valor2==0)
                System.out.println("no se puede division entre cero");
            else super.res = valor1 / valor2;
           
}
}
