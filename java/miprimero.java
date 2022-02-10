import java.util.Scanner;
public class miprimero{
    
    static Scanner scanner= new Scanner(System.in);
    static int select=-1;
    static int valor1;
    static int valor2;
     public static void main(String[] args) {
         System.out.println("Manzo Olguin Alex Yamin");
         System.out.println("Bienvenidos a la calculadora");


        while(select !=0){
            try{
                System.out.println("Elige la opcion");
                System.out.println("1.Sumar");
                System.out.println("2.Restar");
                System.out.println("3.Multiplicar");
                System.out.println("4.Dividir");
                System.out.println("0.Salir");
                select=Integer.parseInt(scanner.nextLine());

          

                switch(select){
                    case 1:
                    pideNumeros();
                    Suma sum=new Suma(valor1,valor2);
                    sum.Resultado();
                        break;
                    case 2:
                    pideNumeros();
                    Resta res=new Resta(valor1,valor2);
                    res.Resultado();
                        break;
                    case 3:
                    pideNumeros();
                    Multipicacion mul=new Multipicacion(valor1,valor2);
                    mul.Resultado();
                        break;
                    case 4:
                    pideNumeros();
                    Division div =new Division(valor1,valor2);
                    div.Resultado();   
                        break;
                    case 0:
                    System.out.println("adios");
                        break;
                }

            }catch(NumberFormatException e){
                System.out.println("ocurrio un error");

            }
        }
    }
    private static void pideNumeros() {
        System.out.println("introduce el valor 1");
       valor1 = Integer.parseInt(scanner.nextLine());
        System.out.println("introduce el valor 2");
       valor2 = Integer.parseInt(scanner.nextLine());
    }


 
}