import java.util.Scanner;

public class Eje5 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2: ");
        var numero2 = Integer.parseInt(consola.nextLine());
        var mayor = (numero1>numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es: " + mayor);
    }
}
