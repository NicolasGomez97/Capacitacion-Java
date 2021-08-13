package test;

import domain.*;

public class Test {
    public static void main(String[] args) {
        Raton raton1 = new Raton("USB","Dragon");
        Teclado teclado1 = new Teclado("USB","Dragon");
        Monitor monitor1 = new Monitor("CX",16);
        Computadora computadora1 = new Computadora("Fullpower",monitor1,teclado1,raton1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);

        orden1.mostrarOrden();
    }
}
