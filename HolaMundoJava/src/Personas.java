import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Personas {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("personas.txt"));
        int c = 0;
        int cp =0;
        int ci =0;
        int sumatoria = 0;
        double promedio = 0;
        int mayor = 0;
        int menor = 9999;
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            c++;
            sumatoria += n;

            if(n%2==0){
                cp++;
            }
            else{
                ci++;
            }
            //mayor de los numero
            if(n > mayor){
                mayor = n;
            }
            if(n < menor){
                menor =n;

            }

        }
        //promedio
        promedio = (double) sumatoria / c;

        System.out.println("Sumatoria "+sumatoria);
        System.out.println("Cantidad de casos " + c);
        System.out.println("Cantidad de pares " + cp);
        System.out.println("Cantidad de impares = " + ci);
        System.out.println("Mayor = " + mayor);
        System.out.println("Menor = " + menor);
        System.out.println("Promedio = " + promedio);

    }
}
