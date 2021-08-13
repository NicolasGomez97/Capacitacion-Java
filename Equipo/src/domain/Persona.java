package domain;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Persona {
    protected String nombre;
    protected int DNI;
    protected LocalDate fechaNacimiento;
    protected String nacionalidad;
    protected float sueldo;
    protected int edad;

    public Persona(String nombre, int DNI, LocalDate fechaNacimiento, String nacionalidad, float sueldo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.edad = calcularEdad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    //public abstract float calcularPromedioEdad();

    public abstract float calcularSueldo();

    public abstract int calcularEdad();

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", sueldo=" + sueldo +
                ", edad=" + edad +
                '}';
    }
}
