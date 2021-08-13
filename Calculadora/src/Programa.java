import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA");
        System.out.println("Ingrese operacion con dos numeros");
        double ope1, ope2;
        int operacion;
        Calculadora c = new Calculadora();

        do{
            ope1 = sc.nextDouble();
            operacion = sc.nextInt();
            ope2 = sc.nextDouble();
            if(operacion!=7)
                System.out.println(c.calcular(ope1,operacion,ope2));
        }while(operacion!=7);
    }
}