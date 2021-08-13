import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();
        Opcione1 a = new Opcione1();
        Opcion2 b = new Opcion2();

        m.mostrar(sc,"bienvenida","despedida",a,b);
    }
}
