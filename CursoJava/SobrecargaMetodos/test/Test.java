package test;

import operaciones.Operaciones;

public class Test {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(10,20);
        System.out.println("resultado = " + resultado);
        var resultado2 =  Operaciones.sumar(10.5d,30.3d);
        System.out.println("resultado2 = " + resultado2);
    }
}
