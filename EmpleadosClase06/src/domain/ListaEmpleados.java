package domain;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEmpleados {

    private ArrayList<Empleado>lista;
    static int legajo = 0;
    static String nombre;
    static float sueldoBasico = 0;
    static float sueldoCom=0;

    public ListaEmpleados() {
        this.lista = new ArrayList<>();
    }
    public void agregar(Empleado nuevo){
        lista.add(nuevo);
    }

    public ArrayList<Empleado> getLista() {
        return lista;
    }


    public float sueldoBajo(){
        float sueldoBa = 0;
        for (Empleado e: lista){
            if (sueldoBa == 0 || e.calcularSueldo()<sueldoBa){
                sueldoBa = e.calcularSueldo();
            }
        }
        return sueldoBa;
    }

    public void empledadoQueMenosCobra(){
        float sueldoBa = 0;
        for(Empleado e: lista){
            if (sueldoBa == 0 || e.calcularSueldo()<sueldoBa){
                sueldoBa = e.calcularSueldo();
                this.legajo = e.legajo;
                this.nombre = e.nombre;
                this.sueldoBasico = e.sueldoBasico;
                this.sueldoCom = e.calcularSueldo();
            }
        }
    }

    @Override
    public String toString() {
        return "El empleado que menos cobra es{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", sueldoCom=" + sueldoCom +
                '}';
    }
}
