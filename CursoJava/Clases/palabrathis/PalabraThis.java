package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona1 persona = new Persona1("Nicolas","Gomez");
        System.out.println("persona = " + persona);

    }
}

class Persona1{
    //super();
    String nombre;
    String apellido;

    Persona1(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("this = " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona1 persona){
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresion del objeto actual (this)" + this);
    }
}