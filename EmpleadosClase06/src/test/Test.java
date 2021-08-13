package test;

import domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        ListaEmpleados lista = new ListaEmpleados();
        Scanner archivo = new Scanner(new File("empleados.txt"));
        archivo.useDelimiter("[;\\n]");
        float totalVenta = 0;
        float totalAdministrativo =0;
        float totalObrero =0;

        while(archivo.hasNextInt()){
            Empleado nuevo = null;
            int tipo = archivo.nextInt();
            int legajo = archivo.nextInt();
            String nombre = archivo.next();
            float sueldo = archivo.nextFloat();

            switch (tipo){
                case 1:
                    int dias = archivo.nextInt();
                    nuevo = new Obrero(legajo,nombre,sueldo,dias);
                    nuevo.sumarSueldoTotal();
                    //totalObrero += nuevo.calcularSueldo();
                    break;
                case 2:
                    boolean presentismo = archivo.nextBoolean();
                    nuevo = new Administrativo(legajo,nombre,sueldo,presentismo);
                    nuevo.sumarSueldoTotal();
                    //totalAdministrativo += nuevo.calcularSueldo();
                    break;
                case 3:
                    float ventas = archivo.nextFloat();
                    nuevo = new Vendedor(legajo,nombre,sueldo,ventas);
                    nuevo.sumarSueldoTotal();
                    //totalVenta += nuevo.calcularSueldo();
                    break;
            }
            lista.agregar(nuevo);
        }
        System.out.println(lista.getLista());
        System.out.println("El sueldo mas bajo es de " + lista.sueldoBajo());
        lista.empledadoQueMenosCobra();
        System.out.println(lista.toString());
    }
}
