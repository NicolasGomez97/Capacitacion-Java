package test;


import domain3.PersonaArray;

public class TestArreglosObject {
    public static void main(String[] args) {
        PersonaArray personas2[] = new PersonaArray[2];

        personas2[0]= new PersonaArray("Nicolas");
        personas2[1]= new PersonaArray("Ignacio");

        System.out.println("personas[0] = " + personas2[0]);
        System.out.println("personas[1] = " + personas2[1]);
        
    }
}
