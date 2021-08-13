package funcional.v4_superfunciones_genericas;

import funcional.v4_superfunciones_genericas.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //¿Que hacer?
        //1.- Crear lista de entero.
        List<Integer> numeros= SuperFunciones.proveer(10, new Proveedor<>() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                    return random.nextInt(100);
            }
        });
        System.out.println(numeros);
        //2.- Quedarme solo con los pares.
        //List<Integer> pares= filtrarPares(numeros);
        List<Integer> filtrados= SuperFunciones.filtrar(numeros, new Predicado<>() {
            @Override
            public Boolean test(Integer valor) {
                return valor % 2==0;
            }
        });
        System.out.println("pares = " + filtrados);
        //3a.- Pasar cada numero al cuadrado.
        List<Integer> transformados = SuperFunciones.transformar(filtrados, new OperarioUnario<Integer>(){
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println("cuadrados = " + transformados);
        //3b.- Obtener cada numero convertido en cadena
        List<String> convertidoEnCadena = SuperFunciones.transformar(filtrados, new Funcion<Integer, String>() {
            @Override
            public String aplicar(Integer valor) {
                return "Valor: " + valor;
            }
        });
        System.out.println(convertidoEnCadena);
        Consumidor<Integer> impresor = new Consumidor<>() {
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };
        //4a.- Mostrar cada cuadrado por pantalla y retornar lista.
        List<Integer> actuados = SuperFunciones.actuar(transformados, impresor);
        //4b.- Mostrar cada cuadrado por pantalla y no retornar nada.
        SuperFunciones.consumir(transformados, impresor);
        //5.- Contoner la suma de los cuadrados.
        Integer total = SuperFunciones.reducir(transformados, 0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
        System.out.println("Suma de cuadrados total = " + total);

    }
}
