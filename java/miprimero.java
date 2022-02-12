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

                if(select == 0){
                    System.out.println("adios");
                    return;
                }
                pideNumeros();
                Operacion op;
                switch(select){
                    case 1:
                    op=new Suma(valor1,valor2);
                        break;
                    case 2:
                    op=new Resta(valor1,valor2);
                        break;
                    case 3:
                    op=new Multipicacion(valor1,valor2);
                        break;
                    case 4:
                    op =new Division(valor1,valor2);
                       
                        break;
                        default:
                        op=new Operacion(valor1,valor2,'n');
                }
                op.Resultado();
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