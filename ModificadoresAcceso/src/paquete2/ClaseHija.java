package paquete2;

import paquete1.Clase2;

public class ClaseHija extends Clase2 {

    public ClaseHija(){
        super();
        this.atributoProtected = "Modificar atributo protected";
        System.out.println("atributoProtected = " + atributoProtected);
        this.metodoProtegido();
    }
}
