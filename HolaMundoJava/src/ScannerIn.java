import java.util.Scanner;

public class ScannerIn {
    public static void main(String args[]){
        System.out.println("Ingrese tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Ingrese Su Titulo:");
        var titulo = consola.nextLine();
        System.out.println("titulo = " + titulo);
        System.out.println(titulo + " " + usuario);
    }
}
