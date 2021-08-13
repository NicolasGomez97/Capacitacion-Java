import java.util.HashSet;
import java.util.Random;

public class Programa2 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> lista1 = new HashSet<>();
        HashSet<Integer> lista2 = new HashSet<>();
        HashSet<Integer> interseccion = new HashSet<>();

        for (int i = 0; i < 30000; i++) {
            lista1.add(r.nextInt(10000));
            lista2.add(r.nextInt(10000));
        }
        interseccion = new HashSet<>(lista1);
        long inicio = System.currentTimeMillis();
        //for (Integer x: lista1) { if (lista2.contains(x)){ interseccion.add(x); } }
        interseccion.retainAll(lista2);

        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;
        System.out.println("Tamaño: " + interseccion.size());
        System.out.println("Tiempo: "+ tiempo);
        inicio = System.currentTimeMillis();
        for(Integer x: interseccion){
            if (lista2.contains(x)){
                lista1.remove(x);
                lista2.remove(x);
            }}
        fin = System.currentTimeMillis();
        tiempo = fin - inicio;
        System.out.println("Tiempo: "+ tiempo);
    }
}
/*
Tamaño: 8994
Tiempo: 5

Tamaño: 9037
Tiempo: 14

Tiempo Eliminar:
Tiempo: 12

 */