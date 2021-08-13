package Clases;

public class ProbarAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a=3;
        aritmetica.b=2;
        System.out.println(aritmetica.sumarConRetorno());

        var resultado = aritmetica.sumarConArgumentos(5,10);
        System.out.println("resultado = " + resultado);
    }
}
