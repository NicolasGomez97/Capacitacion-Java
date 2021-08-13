import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        var singno =  "\u0024";
        System.out.println("Proporciona el nombre: ");
        var nombre = console.nextLine();
        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt(console.nextLine());
        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble(console.nextLine());
        System.out.println("Proporciona el envio gratuito");
        boolean envioGratuito = Boolean.parseBoolean(console.nextLine());

        System.out.println(nombre + " #"+id);
        System.out.println("Precio: " +singno+precio);
        System.out.println("Envio Gratuito: "+envioGratuito);
    }
}
