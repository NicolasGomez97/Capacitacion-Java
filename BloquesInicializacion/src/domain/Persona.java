package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;

    static {
        System.out.println("Ejecuta bloque estatico");
        ++Persona.contadorPersona;
    }

    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersona++;
    }

    public Persona(){
        System.out.println("Ejecucion del contructo");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
