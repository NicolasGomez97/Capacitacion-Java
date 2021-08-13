import java.util.Random;
import java.util.TreeSet;

public class Programa3 {
    public static void main(String[] args) {
        Random r = new Random();
        TreeSet<Integer> lista1 = new TreeSet<Integer>();
        TreeSet<Integer> lista2 = new TreeSet<Integer>();
        TreeSet<Integer> interseccion = new TreeSet<Integer>();

        for (int i = 0; i < 30000; i++) {
            lista1.add(r.nextInt(10000));
            lista2.add(r.nextInt(10000));
        }

        interseccion = new TreeSet<>(lista1);
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
        System.out.println("Tiempo: "+ tiempo);
    }
}
/*
Tamaño: 9029
Tiempo: 15

Tamaño: 9039
Tiempo: 10

Tiempo eliminar:
Tiempo: 12
 */