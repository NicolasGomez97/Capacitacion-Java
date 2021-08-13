package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[]={5,2,9,7,6,3};
        for (int edad: edades){
            System.out.println("edad = " + edad);
        }
        Persona personas[] = {new Persona("Nicolas"), new Persona("Aylen"),new Persona("Nacho")};
        for (Persona p: personas){
            System.out.println("p.getNombre() = " + p.getNombre());
        }
    }
}
