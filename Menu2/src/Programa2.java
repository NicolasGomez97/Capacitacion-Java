import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {


    }
}Scanner sc = new Scanner(System.in);
    Menu m = new Menu();

        /*Opcion a = new Opcion() {
            @Override
            public void ejecutar() {
                System.out.println("Hola!!");
            }
        };*/

    //Opcion a = () -> {System.out.println("hola Nico!");};
    Opcion a =new Opcion() {
        @Override
        public void ejecutar() {
            System.out.println("Hola Nico");
        }
    };
    Opcion b = new Opcion() {
        @Override
        public void ejecutar() {
            System.out.println("CHAU tincho!!");
        }
    };
        m.mostrar(sc,"bienvenida","despedida",a,b);
