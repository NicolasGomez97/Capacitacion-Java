package domain;

public class Computadora {
    //Atribustos
    private int idComputador;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputador;

    //Metodos
    private Computadora(){
        this.idComputador = ++contadorComputador;
    }

    public Computadora(String nombre, Monitor monitor,Teclado teclado ,Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputador=" + idComputador +
                ", nombre='" + nombre + '\'' +
                ", monitor=" + monitor +
                ", teclado=" + teclado +
                ", raton=" + raton +
                '}';
    }
}
