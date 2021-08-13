package domain;

import java.util.Objects;

public class Empleado1 {
    protected String nombre;
    protected double sueldo;

    public Empleado1(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles(){
        return "Nombre: "+ this.nombre + ", Sueldo" + this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado1)) return false;
        Empleado1 empleado1 = (Empleado1) o;
        return Double.compare(empleado1.getSueldo(), getSueldo()) == 0 && Objects.equals(getNombre(), empleado1.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getSueldo());
    }
}
