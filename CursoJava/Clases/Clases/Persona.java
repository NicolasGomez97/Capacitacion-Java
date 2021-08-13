package Clases;

public class Persona {
    //Atributos de la clase
    private String nombre;
    private String apellido;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void desplegarInformacion(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Apellido: "+ this.apellido);
    }

}
