package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Nicolas",50000,"Sistemas");
        System.out.println("gerente1.obtenerDetalles() = " + gerente1.obtenerDetalles());

        //Polimorfismo
        Empleado empleado = new Empleado("Aylen",20000);
        System.out.println("empleado = " + empleado.obtenerDetalles());

        Gerente gerente = new Gerente("Nicolas", 500000, "Sistemas");
        System.out.println("gerente.obtenerDetalles() = " + gerente.obtenerDetalles());

        imprimir(empleado);
        imprimir(gerente);
    }

    public static void imprimir(Empleado empleado){
        System.out.println("empleado.obtenerDetalles() = " + empleado.obtenerDetalles());
    }
}
