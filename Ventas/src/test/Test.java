package test;

import domain.Orden;
import domain.Producto;

public class Test {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa",50.00);
        Producto producto2 = new Producto("Pantalon", 60.00);
        Producto producto3 = new Producto("Bufanda", 25.23);
        Producto producto4 = new Producto("Gorra",12.64);

        Orden orden1= new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();
    }
}
