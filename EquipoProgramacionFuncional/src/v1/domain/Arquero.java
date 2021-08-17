package v1.domain;

import java.time.LocalDate;

public class Arquero extends Jugador{
    private int golesAtajados;
    private int penalesAtajados;

    public Arquero(String nombre, int DNI, LocalDate fechaNacimiento, String nacionalidad, float sueldo, int numero, int velocidad, String posicion, String prienaHabil, int tarjetaRoja, int tarjetaAmarilla, int goles, int asistencia, int tiempoJugado, float peso, float altura, int golesAtajados, int penalesAtajados) {
        super(nombre, DNI, fechaNacimiento, nacionalidad, sueldo, numero, velocidad, posicion, prienaHabil, tarjetaRoja, tarjetaAmarilla, goles, asistencia, tiempoJugado, peso, altura);
        this.golesAtajados = golesAtajados;
        this.penalesAtajados = penalesAtajados;
    }

    public int getGolesAtajados() {
        return golesAtajados;
    }

    public void setGolesAtajados(int golesAtajados) {
        this.golesAtajados = golesAtajados;
    }

    public int getPenalesAtajados() {
        return penalesAtajados;
    }

    public void setPenalesAtajados(int penalesAtajados) {
        this.penalesAtajados = penalesAtajados;
    }

    @Override
    public float calcularSueldo() {
        float a =0;
        if (penalesAtajados <= 5 && golesAtajados <= 10){
            a = this.sueldo + 1000;
        }
        else if (penalesAtajados <= 15 && golesAtajados <= 25){
            a = this.sueldo + 5000;
        }
        else if (penalesAtajados <= 45 && golesAtajados <= 70){
            a = this.sueldo + 10000;
        }
        else {
            a = this.sueldo + 15000;
        }
        return a;
    }

    @Override
    public String toString() {
        return "Arquero{" +
                "golesAtajados=" + golesAtajados +
                ", penalesAtajados=" + penalesAtajados +
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