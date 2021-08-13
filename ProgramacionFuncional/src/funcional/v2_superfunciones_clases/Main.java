package funcional.v2_superfunciones_clases;

import funcional.v2_superfunciones_clases.clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //¿Que hacer?
        //1.- Crear lista de entero.
        List<Integer> numeros= SuperFunciones.proveer(10, new Naturales());
        System.out.println(numeros);
        //2.- Quedarme solo con los pares.
        //List<Integer> pares= filtrarPares(numeros);
        List<Integer> filtrados= SuperFunciones.filtrar(numeros, new SoloPares());
        System.out.println("pares = " + filtrados);
        //3.- Pasar cada numero al cuadrado.
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new AlCuadrado());
        System.out.println("cuadrados = " + transformados);
        //4a.- Mostrar cada cuadrado por pantalla y retornar lista.
        List<Integer> actuados = SuperFunciones.actuar(transformados,new Impresor());
        //4b.- Mostrar cada cuadrado por pantalla y no retornar nada.
        SuperFunciones.consumir(transformados,new Impresor());
        //5.- Contoner la suma de los cuadrados.
        int total = SuperFunciones.reducir(transformados,0, new Sumar());
        System.out.println("Suma de cuadrados total = " + total);

    }
}
