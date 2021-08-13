package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        edades[0]=16;
        edades[1]=82;
        edades[2]=20;
        //System.out.println("edades = " + edades[2]);

        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemento = " + i + " : " + edades[i]);
        }
    }
}
