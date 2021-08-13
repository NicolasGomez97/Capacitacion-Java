package funcional.v6_lambda;

import funcional.v6_lambda.interfaces.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //Ejemplo
        Integer total =
                    Flujo.proveer(10, new Proveedor<Integer>() {
                    Random random = new Random();
                    @Override
                    public Integer obtener() {
                        return random.nextInt(10);
                    }
                }).filtrar(new Predicado<Integer>() {
                    @Override
                    public Boolean test(Integer valor) {
                        return valor % 2 ==0;
                    }
                }).transformar(new OperarioUnario<Integer>(){
                    @Override
                    public Integer aplicar(Integer valor) {
                        return valor * valor;
                    }
                }).actuar(new Consumidor<>(){
                    @Override
                    public void aceptar(Integer valor){
                        System.out.println(valor);}
                }).reducir(0, new OperadorBinario<>() {
                    @Override
                    public Integer aplicar(Integer valor1, Integer valor2) {
                        return valor1 + valor2;
                    }
                });
/*
        //¿Que hacer?
        //1.- Crear lista de entero.
        Flujo<Integer> numeros= Flujo.proveer(10, new Proveedor<>() {
            Random random = new Random();
            @Override
            public Integer obtener() {
                    return random.nextInt(10);
            }
        });
        System.out.println(numeros);
        //2.- Quedarme solo con los pares.
        //List<Integer> pares= filtrarPares(numeros);
        Flujo<Integer> filtrados = numeros.filtrar(new Predicado<Integer>() {
            @Override
            public Boolean test(Integer valor) {
                return valor % 2 ==0;
            }
        });
        System.out.println(filtrados);
        //3a.- Pasar cada numero al cuadrado.
        Flujo<Integer> transformados = filtrados.transformar(new OperarioUnario<Integer>(){
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println(transformados);
        //3b.- Obtener cada numero convertido en cadena
        Flujo<String> convertidoEnCadena = filtrados.transformar(new Funcion<Integer, String>() {
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
        Flujo<Integer> actuados = transformados.actuar(impresor);
        //4b.- Mostrar cada cuadrado por pantalla y no retornar nada.
        transformados.consumir(impresor);
        //5.- Contoner la suma de los cuadrados.
        Integer total = actuados.reducir(0, new OperadorBinario<>() {
            @Override
            public Integer aplicar(Integer valor1, Integer valor2) {
                return valor1 + valor2;
            }
        });
 */
        System.out.println("Suma de cuadrados total = " + total);

    }
}
