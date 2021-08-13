import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class Programa4 {
    public static void main(String[] args) {
        Random r = new Random();
        LinkedList<Integer> lista1 = new LinkedList<Integer>();
        LinkedList<Integer> lista2 = new LinkedList<Integer>();
        LinkedList<Integer> interseccion = new LinkedList<Integer>();

        for (int i = 0; i < 30000; i++) {
            lista1.add(r.nextInt(10000));
            lista2.add(r.nextInt(10000));
        }

        interseccion = new LinkedList<>(lista1);
        long inicio = System.currentTimeMillis();
        //for (Integer x: lista1){ if (lista2.contains(x)){ interseccion.add(x);}}
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
        System.out.println("Tiempo eliminado: "+ tiempo);
    }
}

/*
Tamaño: 28399
Tiempo: 1989

Tamaño: 28482
Tiempo: 1966

Tiempo eliminar:
Tiempo: 3505
 */