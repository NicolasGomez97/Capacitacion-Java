import java.util.Scanner;

public class Eje2 {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese Titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Ingrese Autor: ");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
