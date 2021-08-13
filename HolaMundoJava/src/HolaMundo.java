import java.util.Scanner;

// Mi clase Java
public class HolaMundo {
    // Metodo Main
    public static void main(String args[]){
        System.out.println("Hola Mundo desde Java");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int numero1= teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int numero3= teclado.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        int numero4 = teclado.nextInt();
        System.out.println("Ingrese el quinto numero: ");
        int numero5 = teclado.nextInt();
        
        int resultado = numero1 + numero2 + numero3 + numero4 + numero5;
        System.out.println("resultado = " + resultado);

    }
}
