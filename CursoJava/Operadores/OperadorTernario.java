public class OperadorTernario {
    public static void main(String[] args) {
        var resultado = (3 > 2) ? "Verdadero": "Falso";
        System.out.println("resultado = " + resultado);

        var numero = 8;
        resultado = (numero % 2 == 0)? "Es Par":"Es impar";
        System.out.println("resultado = " + resultado);
    }
}
