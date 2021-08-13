package tes;

import paquete1.Clase1;
import paquete1.Clase2;
import paquete1.ClaseHijaDefault;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1);
        clase1.metodoPublico();
        /*
        Clase2 clase2 = new Clase2();
         */
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);

        ClaseHijaDefault claseHijaDefault = new ClaseHijaDefault();
        System.out.println("claseHijaDefault = " + claseHijaDefault);


    }
}
