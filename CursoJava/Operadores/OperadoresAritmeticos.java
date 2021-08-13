public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado Suma= " + resultado);

        resultado = a - b;
        System.out.println("resultado Resta= " + resultado);

        resultado= a * b;
        System.out.println("resultado Multiplicado= " + resultado);

        resultado = a / b;
        System.out.println("resultado Division= " + resultado);

        resultado = a % b;
        System.out.println("resultado Residuo= " + resultado);

        if (a % 2 == 0){
            System.out.println("Es un numero par");
        }
        else {
            System.out.println("Es un numero impar");
        }
    }
}
