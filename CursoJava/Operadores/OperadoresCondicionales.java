public class OperadoresCondicionales {
    public static void main(String[] args) {
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >=0 && a<=10;
        if (resultado){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }

    }
}
