package paquete1;

public class ClaseHijaDefault extends Clase3 {

    public ClaseHijaDefault(){
        super();
        this.atributoDefault = "Modificar atributo protected";
        System.out.println("atributoDefault = " + atributoDefault);
        this.metodoDefault();
    }
}
