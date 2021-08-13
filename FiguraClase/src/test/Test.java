package test;

import domain.Circulo;
import domain.Triangulo;

public class Test {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circuleo",10);
        Triangulo triangulo = new Triangulo("Triangulo",10,10,10);
        System.out.println(circulo.superficie());
        System.out.println(triangulo.superficie());
    }
}
