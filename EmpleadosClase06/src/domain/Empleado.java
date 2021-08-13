package domain;

public abstract class Empleado {
    protected int legajo;
    protected  String nombre;
    protected  float sueldoBasico;
    protected static float sumarTotal;

    public Empleado(int legajo, String nombre, float sueldoBasico) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
    }

    public abstract float calcularSueldo();

    public abstract void sumarSueldoTotal();


    @Override
    public String toString() {
        return "Empleado{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", CalcularSueldo="+ calcularSueldo()+
                '}';
    }
    /*
    public String totalArea() {
        return "El sueldo a pagar en total del area de Administrativos es " + sumarSueldoTotal();
    }*/
}
