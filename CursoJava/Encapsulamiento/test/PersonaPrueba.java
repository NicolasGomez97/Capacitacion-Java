package test;

import dominio.*;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona2 persona1 = new Persona2();
        persona1.setNombre("Nicolas");
        persona1.setSueldo(5000.00);
        persona1.setEliminado(false);

        System.out.println(persona1);


    }
}
