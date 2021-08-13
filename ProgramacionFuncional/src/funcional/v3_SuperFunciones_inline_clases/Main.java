package funcional.v3_SuperFunciones_inline_clases;

import funcional.v2_superfunciones_clases.clases.*;
import funcional.v3_SuperFunciones_inline_clases.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //¿Que hacer?
        //1.- Crear lista de entero.
        List<Integer> numeros= SuperFunciones.proveer(10, new Proveedor() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                    return random.nextInt(100);
            }
        });
        System.out.println(numeros);
        //2.- Quedarme solo con los pares.
        //List<Integer> pares= filtrarPares(numeros);
        List<Integer> filtrados= SuperFunciones.filtrar(numeros, new Predicado() {
            @Override
            public Boolean test(Integer valor) {
                return valor % 2==0;
            }
        });
        System.out.println("pares = " + filtrados);
        //3.- Pasar cada numero al cuadrado.
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new Funcion() {
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println("cuadrados = " + transformados);
        //4a.- Mostrar cada cuadrado por pantalla y retornar lista.
        List<Integer> actuados = SuperFunciones.actuar(transformados, new Consumidor() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        });
        //4b.- Mostrar cada cuadrado por pantalla y no retornar nada.
        SuperFunciones.consumir(transformados, new Consumidor() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        });
        //5.- Contoner la suma de los cuadrados.
        int total = SuperFunciones.reducir(transformados, 0, new FuncionBinaria() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("Suma de cuadrados total = " + total);

    }
}
