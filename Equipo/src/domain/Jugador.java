package domain;

import java.util.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jugador extends Persona {
    private int numero;
    private int velocidad;
    private String posicion;
    private String prienaHabil;
    private int tarjetaRoja;
    private int tarjetaAmarilla;
    private int goles;
    private int asistencia;
    private int tiempoJugado;
    private float peso;
    private float altura;
    private static int contadorJugador;
    private static int sumaEdadJugador;

    public Jugador(String nombre, int DNI, LocalDate fechaNacimiento, String nacionalidad, float sueldo, int numero, int velocidad, String posicion, String prienaHabil, int tarjetaRoja, int tarjetaAmarilla, int goles, int asistencia, int tiempoJugado, float peso, float altura) {
        super(nombre, DNI, fechaNacimiento, nacionalidad, sueldo);
        this.numero = numero;
        this.velocidad = velocidad;
        this.posicion = posicion;
        this.prienaHabil = prienaHabil;
        this.tarjetaRoja = tarjetaRoja;
        this.tarjetaAmarilla = tarjetaAmarilla;
        this.goles = goles;
        this.asistencia = asistencia;
        this.tiempoJugado = tiempoJugado;
        this.peso = peso;
        this.altura = altura;
        ++contadorJugador;
        sumaEdadJugador+=calcularEdad();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPrienaHabil() {
        return prienaHabil;
    }

    public void setPrienaHabil(String prienaHabil) {
        this.prienaHabil = prienaHabil;
    }

    public int getTarjetaRoja() {
        return tarjetaRoja;
    }

    public void setTarjetaRoja(int tarjetaRoja) {
        this.tarjetaRoja = tarjetaRoja;
    }

    public int getTarjetaAmarilla() {
        return tarjetaAmarilla;
    }

    public void setTarjetaAmarilla(int tarjetaAmarilla) {
        this.tarjetaAmarilla = tarjetaAmarilla;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getTiempoJugado() {
        return tiempoJugado;
    }

    public void setTiempoJugado(int tiempoJugado) {
        this.tiempoJugado = tiempoJugado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public static int getContadorJugador() {
        return contadorJugador;
    }

    public static int getSumaEdadJugador() {
        return sumaEdadJugador;
    }



    @Override
    public float calcularSueldo() {
        float a=0;
        if (goles >=10)
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
        return sumaEdadJugador/contadorJugador;
    }
    */

    @Override
    public String toString() {
        return "Jugador{" +
                "numero=" + numero +
                ", velocidad=" + velocidad +
                ", posicion='" + posicion + '\'' +
                ", prienaHabil='" + prienaHabil + '\'' +
                ", tarjetaRoja=" + tarjetaRoja +
                ", tarjetaAmarilla=" + tarjetaAmarilla +
                ", goles=" + goles +
                ", asistencia=" + asistencia +
                ", tiempoJugado=" + tiempoJugado +
                ", peso=" + peso +
                ", altura=" + altura +
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
