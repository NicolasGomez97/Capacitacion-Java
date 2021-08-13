import java.util.Scanner;

public class Menu {
    public void mostrar(Scanner sc, String texto1, String texto2, Opcion op1, Opcion op2){
        int opcion = 0;
        do {
            System.out.println("Menu de opciones");
            System.out.println("1-Bienvenida");
            System.out.println("2-Despedida");
            System.out.println("3-Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    op1.ejecutar();
                    break;
                case 2:
                    op2.ejecutar();
                    break;
            }
        }while(opcion!=3);
    }
}
