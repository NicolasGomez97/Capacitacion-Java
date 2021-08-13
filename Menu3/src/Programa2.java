import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu3 m = new Menu3();
        String ll[] = new String[2];

        /*Opcion a = new Opcion() {
            @Override
            public void ejecutar() {
                System.out.println("Hola!!");
            }
        };*/

        Opcion a = () -> {System.out.println("hola Nico!");};
        Opcion b = new Opcion() {
            @Override
            public void ejecutar() {
                System.out.println("Chau Nico!!");
            }
        };
        m.mostrar1(sc, new String[]{ "Sumar", "Restar", "Multiplicar"} ,
                new Runnable[]{
                        () -> System.out.println(x + y),
                        () -> System.out.println(x - y),
                        () -> System.out.println(x * y));
    }
}
