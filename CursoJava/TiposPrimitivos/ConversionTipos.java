import java.util.Scanner;

public class ConversionTipos {
    public static void main(String[] args) {
        // Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("(edad = " + (edad+2));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("Su edad es " + edad);

        var edadTexto = String.valueOf(edad);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);

        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);




    }
}
