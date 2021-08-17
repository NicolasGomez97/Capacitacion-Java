package funcional.v6_lambda;

import funcional.v2_superfunciones_clases.clases.Aleatorio;
import funcional.v6_lambda.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {

    public Main() {
        //Ejemplo
        Random random = new Random();
        Integer total =
                    Flujo.proveer(10, () ->random.nextInt(10))
                            .filtrar(valor -> valor % 2 ==0)
                            .transformar(valor -> valor * valor)
                            .actuar(valor -> System.out.println(valor))
                            .reducir(0, (valor1, valor2) -> valor1 + valor2);

        System.out.println("Suma de cuadrados total = " + total);
    }
    public static void main(String[] args) {
        new Main();
    }
}
