package v1.test;

import domain.*;
import v1.domain.ListaEquipo;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        ListaEquipo lsjugador = new ListaEquipo();
        Scanner archivo = new Scanner(new File("Plantel.txt"));
        archivo.useDelimiter("[;\\n]");

        while (archivo.hasNextInt()){
            Persona nuevo = null;
            int tipo = archivo.nextInt();
            String nombre = archivo.next();
            int dni = archivo.nextInt();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNac = LocalDate.parse(archivo.next(), fmt);
            String nacionalidad = archivo.next();
            float sueldo = archivo.nextFloat();
            switch (tipo){
                case 1:
                    int numero= archivo.nextInt();
                    int velocidad = archivo.nextInt();
                    String posicion = archivo.next();
                    String pierHabil = archivo.next();
                    int tarjetaRoja = archivo.nextInt();
                    int tarjetaAmarilla = archivo.nextInt();
                    int goles = archivo.nextInt();
                    int asistencia = archivo.nextInt();
                    int tiempoJugado = archivo.nextInt();
                    float peso = archivo.nextFloat();
                    float altura = archivo.nextFloat();
                    nuevo = new Jugador(nombre,dni,fechaNac,nacionalidad,sueldo,numero,velocidad,posicion,pierHabil,tarjetaRoja,tarjetaAmarilla,goles,asistencia,tiempoJugado,peso,altura);
                    break;
                case 2:
                    String cargo = archivo.next();
                    int partidoGanado = archivo.nextInt();
                    nuevo = new CuerpoTecnico(nombre,dni,fechaNac,nacionalidad,sueldo,cargo,partidoGanado);
                    break;
                case 3:
                    numero= archivo.nextInt();
                    velocidad = archivo.nextInt();
                    posicion = archivo.next();
                    pierHabil = archivo.next();
                    tarjetaRoja = archivo.nextInt();
                    tarjetaAmarilla = archivo.nextInt();
                    goles = archivo.nextInt();
                    asistencia = archivo.nextInt();
                    tiempoJugado = archivo.nextInt();
                    peso = archivo.nextFloat();
                    altura = archivo.nextFloat();
                    int golesAtajados = archivo.nextInt();
                    int penalesAtajados = archivo.nextInt();
                    nuevo = new Arquero(nombre,dni,fechaNac,nacionalidad,sueldo,numero,velocidad,posicion,pierHabil,tarjetaRoja,tarjetaAmarilla,goles,asistencia,tiempoJugado,peso,altura,golesAtajados,penalesAtajados);
                    break;
            }
            lsjugador.agregar(nuevo);
            System.out.println(lsjugador.getLista());
        }
        lsjugador.imprimirCalcularMontoSuelo();
        lsjugador.imprimirPromedioSueldo();
        lsjugador.imprimirPromedioEdad();
        lsjugador.imprimirPromedioVelocidad();
        lsjugador.imprimirVelocidadMaxima();
        lsjugador.imprimirVelocidadMinimo();
    }
}
