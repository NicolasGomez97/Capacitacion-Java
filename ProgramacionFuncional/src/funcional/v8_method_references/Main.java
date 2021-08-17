package funcional.v8_method_references;

import java.util.Random;

public class Main {

    public Main() {
        //Ejemplo
        Random random = new Random();
        Integer total =
                    Flujo.proveer(10, this::get)
                            .filtrar(valor -> valor % 2 ==0)
                            .transformar(valor -> valor * valor)
                            .actuar(valor -> System.out.println(valor))
                            .reducir(0, (valor1, valor2) -> Integer.sum(valor1, valor2));

        System.out.println("Suma de cuadrados total = " + total);
    }

    private int randomInt(Integer numero){
        Random random = new Random();
        return random.nextInt(numero);
    }
    public static void main(String[] args) {
        new Main();
    }

    private Integer get() {
        return randomInt(10);
    }
}
