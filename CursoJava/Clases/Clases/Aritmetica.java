package Clases;

public class Aritmetica {
    int a = 10;
    int b = 2;

    public int sumarConRetorno(){
        int a = 0;
        int b =0;
        return a+b;
    }

    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        return this.sumarConRetorno();
    }
    // Contructor vacio
    public Aritmetica() {
        System.out.println("Ejecutando...");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
