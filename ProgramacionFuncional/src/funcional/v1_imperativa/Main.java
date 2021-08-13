package funcional.v1_imperativa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //¿Que hacer?
        //1.- Crear lista de entero.
        List<Integer> numeros= crearLista();
        System.out.println(numeros);
        //2.- Quedarme solo con los pares.
        List<Integer> pares= filtrarPares(numeros);
        System.out.println("pares = " + pares);
        //3.- Pasar cada numero al cuadrado.
        List<Integer> cuadrados = elevarAlCuadrado(pares);
        System.out.println("cuadrados = " + cuadrados);
        //4.- Mostrar cada cuadrado por pantalla.
        List<Integer> mostrados = mostrarLista(cuadrados);
        //5.- Contoner la suma de los cuadrados.
        int total = sumarLista(mostrados);
        System.out.println("Suma de cuadrados total = " + total);

    }

    private int sumarLista(List<Integer> numeros) {
        int total = 0;
        for (Integer numero: numeros) {
            total += numero;
        }
        return total;
    }

    private List<Integer> mostrarLista(List<Integer> numeros) {
        for (Integer numero: numeros) {
            System.out.println("numero = " + numero);
        }
        return numeros;
    }

    private List<Integer> elevarAlCuadrado(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        //Se recorre la lista y se agrega resultado, el cuadrado de los numeros originales
        for (Integer numero: numeros) {
            resultado.add(numero*numero);
        }
        return resultado;
    }

    private List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        //Se recorre la lista y se agrega resultado solo los numero de la lista que sean pares
        for (Integer numero: numeros) {
            if (numero%2==0){
               resultado.add(numero);
            }
        }
        return resultado;
    }

    private List<Integer> crearLista() {
        //return Arrays.asList(0,1,2,3,5,8,13,21,34,55,99,144);
        return List.of(0,1,2,3,5,8,13,21,34,55,99,144);
    }
}
