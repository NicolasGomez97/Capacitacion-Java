import java.util.Scanner;

public class Eje4 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese Alto: ");
        var alto = Double.parseDouble(consola.nextLine());
        System.out.println("Ingrese Ancho: ");
        var ancho = Double.parseDouble(consola.nextLine());
        var area = alto * ancho;
        var perimetro = (alto+ancho)*2;
        System.out.println("ancho = " + ancho);
        System.out.println("alto = " + alto);
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}
