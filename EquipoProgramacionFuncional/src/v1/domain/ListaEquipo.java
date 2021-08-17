package v1.domain;

import java.util.ArrayList;

public class ListaEquipo {

    private ArrayList<Persona>lista;
    private int sumaVelocidad=0;
    private String jugadorRapido = new String();
    private String jugadorLento = new String();
    private String sueldoBajoNombre = new String();
    private int veloMax = 0;
    private int veloMin = 0;

    public ListaEquipo() {
        this.lista = new ArrayList<>();
    }

    public void agregar(Persona nuevo){
        lista.add(nuevo);
    }

    public void eliminar(Persona eliminar){
        lista.remove(eliminar);
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }

    //agregar los metodos lista
    public float calcularMontoTotalSueldo(){
        float totalSueldo=0;
        for (Persona p: lista){
            totalSueldo += p.calcularSueldo();
        }
        return totalSueldo;
    }

    public String getJugadorRapido() {
        return jugadorRapido;
    }

    public String getJugadorLento() {
        return jugadorLento;
    }

    public float calcularPromedioSueldo(){
        float promedioSueldo=0;
        for(Persona p: lista){
            promedioSueldo=calcularMontoTotalSueldo()/Jugador.getContadorJugador();
        }
        return promedioSueldo;
    }

    public float calcularPromedioEdad(){
        float promedioEdad=0;
        for(Persona p: lista){
            promedioEdad=Jugador.getSumaEdadJugador()/Jugador.getContadorJugador();
        }
        return promedioEdad;
    }

    public float sueldoBajo(){
        float sueledoBajo=0;
        for(Persona p: lista){
            if (sueledoBajo == 0 || p.calcularSueldo()<sueledoBajo){
                sueledoBajo=p.calcularSueldo();
                sueldoBajoNombre=p.getNombre();
            }
        }
        return sueledoBajo;
    }

    public float promedioVelocidad(){
        float proVelocidad = 0;
        for (Persona p: lista){
            if (p instanceof Jugador){
                Jugador j = (Jugador)p;
                sumaVelocidad += j.getVelocidad();
                proVelocidad = sumaVelocidad / j.getContadorJugador();
            }
        }
        return proVelocidad;
    }

    public void velocidadMax(){
        for (Persona p: lista){
            if (p instanceof Jugador){
                Jugador j = (Jugador)p;
                if (veloMax == 0 || veloMax < j.getVelocidad()){
                    veloMax=j.getVelocidad();
                    this.jugadorRapido=j.getNombre();
                }
            }

        }
    }

    public void velocidadMin(){
        for (Persona p: lista){
            if (p instanceof Jugador){
                Jugador j = (Jugador)p;
                if (veloMin == 0 || veloMin > j.getVelocidad()){
                    veloMin=j.getVelocidad();
                    this.jugadorLento=j.getNombre();
                }
            }

        }
    }

    public void imprimirCalcularMontoSuelo(){
        System.out.println("El monto total de sueldos es "+calcularMontoTotalSueldo());
    }

    public void imprimirPromedioSueldo(){
        System.out.println("El promedio sueldo del equipo es: "+calcularPromedioSueldo());
    }

    public void imprimirPromedioEdad(){
        System.out.println("El promedio de edad de jugadores es: "+calcularPromedioEdad());
    }

    public void imprimirSueldoBajo(){
        System.out.println("El sueldo mas bajo es de "+sueldoBajoNombre+" Su sueldo es de "+sueldoBajo());
    }

    public void imprimirPromedioVelocidad(){
        System.out.println("El promedio de velocidad es "+ promedioVelocidad());
    }

    public void imprimirVelocidadMaxima(){
        velocidadMax();
        System.out.println("El jugador mas rapido es "+getJugadorRapido()+" Con una velocidad de "+veloMax);
    }

    public void imprimirVelocidadMinimo(){
        velocidadMin();
        System.out.println("El jugador mas lento es "+getJugadorLento()+" con una velocidad de "+veloMin);
    }

}
