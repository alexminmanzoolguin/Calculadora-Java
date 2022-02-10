public class Operacion{
    int valor1;
    int valor2;
    double res;
    char operacion;
    public Operacion(int valor1,int valor2,char operacion){
        this.valor1= valor1;
        this.valor2=valor2;
        this.operacion=operacion;
    } 
    public void Resultado(){
            System.out.println(this.valor1+""+this.operacion+""+this.valor2+"="+this.res);
    }
    public int getValor1(){
        return valor1;
    }
    public void setValor1(int valor1){
        this.valor1=valor1;
    }
    
    public int getValor2(){
        return valor2;
    }
    public void setValor2(int valor2){
        this.valor2=valor2;
    }
    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}

