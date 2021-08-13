import java.util.Scanner;

public class Menu3 {
    public void mostrar1(Scanner sc,String []textos, Runnable [] op){
        int opcion = 0;
        do{
            System.out.println("Menu de opciones");
            for(int i = 0;i< textos.length;i++){
                System.out.println((i+1) + " - "+ textos[i]);
            }
            System.out.println("9 - salir");
            System.out.println("ingrese la opcion deseada");
            opcion = sc.nextInt();

            if(opcion <= op.length)
                op[opcion-1].run();
        }while(opcion != 9);
    }
}
