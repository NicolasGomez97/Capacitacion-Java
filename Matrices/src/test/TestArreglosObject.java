package test;

import domain.PersonaArray;

public class TestArreglosObject {
        public static void main(String[] args) {
            PersonaArray personas[] = new PersonaArray[2];

            personas[0]= new PersonaArray("Nicolas");
            personas[1]= new PersonaArray("Ignacio");

            System.out.println("personas[0] = " + personas[0]);
            System.out.println("personas[1] = " + personas[1]);

            for(int i = 0; i < personas.length; i++){
                System.out.println("persona " + personas[i]);
            }

            String frutas[] = {"Naranja","Banana", "Uva"};//sintaxi resumida
            for (int i=0;i< frutas.length;i++){
                System.out.println("frutas["+i+"] = " + frutas[i]);
            }


        }
}
