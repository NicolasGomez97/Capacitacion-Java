import java.util.Scanner;

public class Eje6 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese la nota del 0 al 10: ");
        var nota = consola.nextInt();
        var letraNota = "No existe la nota";
        if(nota >= 0 && nota < 6){
            letraNota= "F";
        }
        else if (nota >=6 && nota < 7){
            letraNota= "D";
        }
        else if (nota >= 7 && nota < 8){
            letraNota="C";
        }
        else if (nota >= 8 && nota < 9){
            letraNota="B";
        }
        else if (nota >= 9 && nota <= 10){
            letraNota="A";
        }
        System.out.println("Calificacion = " + letraNota);
    }
}
