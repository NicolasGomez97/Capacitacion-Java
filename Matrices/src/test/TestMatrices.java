package test;

import domain.PersonaArray;

import java.util.Scanner;

public class TestMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edades[][] = new int[3][3];
        System.out.println("edades = " + edades);
        /*
        edades[0][1]=5;
        edades[0][2]=20;


        for(int i=0; i< edades.length;i++){
            for (int j=0; j< edades[i].length;j++){
                System.out.println("Ingrese su numero entero: ");
                edades[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i< edades.length;i++){
            for (int j=0; j< edades[i].length;j++){
                System.out.println("edades["+i+"]["+j+"] ="  + edades[i][j]);
            }
        }*/
        //String frutas[][] = new String[3][2];
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Frutilla"}, {"Nicolas", "Nacho", "Aylen"}};
        /*for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("frutas[" + i + "][" + j + "] =" + frutas[i][j]);
            }
        }*/
        imprimir(frutas);
        PersonaArray persona[][] = new PersonaArray[2][3];

    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "] =" + matriz[i][j]);
            }
        }
    }
}
