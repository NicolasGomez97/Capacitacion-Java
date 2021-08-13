package domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class CuerpoTecnico extends Persona {
    private String cargo;
    private int partidoGanados;
    private static int contadorCt;
    private static int sumaEdadCt;

    public CuerpoTecnico(String nombre, int DNI, LocalDate fechaNacimiento, String nacionalidad, float sueldo, String cargo, int partidoGanados) {
        super(nombre, DNI, fechaNacimiento, nacionalidad, sueldo);
        this.cargo = cargo;
        this.partidoGanados = partidoGanados;
        ++contadorCt;
        sumaEdadCt += calcularEdad();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getPartidoGanados() {
        return partidoGanados;
    }

    public void setPartidoGanados(int partidoGanados) {
        this.partidoGanados = partidoGanados;
    }

    public static int getContadorCt() {
        return contadorCt;
    }

    public static int getSumaEdadCt() {
        return sumaEdadCt;
    }

    @Override
    public float calcularSueldo() {
        float a =0;
        if (partidoGanados >= 10)
            a=sueldo + 1000;
        return a;
    }
    @Override
    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento,ahora);
        return periodo.getYears();
    }
    /*
    @Override
    public float calcularPromedioEdad() {
        return sumaEdadCt/contadorCt;
    }*/

    @Override
    public String toString() {
        return "CuerpoTecnico{" +
                "cargo='" + cargo + '\'' +
                ", partidoGanados=" + partidoGanados +
                ", nombre='" + nombre + '\'' +
                ", DNI=" + DNI +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", sueldo=" + sueldo +
                ", edad=" + edad +
                ", sueldo con beneficios= "+ calcularSueldo()+
                '}';
    }
}
