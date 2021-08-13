import java.util.Scanner;

public class Menu {
    public void mostrar(Scanner sc, String []texto1, Runnable  []op1){
        int opcion = 0;
        do {
            System.out.println("Menu de opciones: ");
            for (int i = 0; i < texto1.length; i++) {
                System.out.println((i+1)+"-"+texto1[i]);
            }
            System.out.println("9- Salir");
            System.out.println("Ingrese la opcion deseada: ");
            opcion = sc.nextInt();

            if (opcion <= op1.length){
                op1[opcion-1].run();
            }
        }while(opcion!=9);
    }
}
