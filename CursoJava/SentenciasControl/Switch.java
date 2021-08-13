import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese el numero: 1 al 4");
        var numero =  consola.nextInt();
        var numeroTexto = "Valor desconocido";
        switch (numero){
            case 1:
                numeroTexto= "Numero Uno";
                break;
            case 2:
                numeroTexto="Numero Dos";
                break;

            case 3:
                numeroTexto = "Numero Tres";
                break;
            case 4:
                numeroTexto="Numero Cuatro";
                break;
            default:
                numeroTexto="Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);


    }
}
