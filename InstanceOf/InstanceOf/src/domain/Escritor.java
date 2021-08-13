package domain;

public class Escritor extends Empleado1{

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }


    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipoEscritua"+ tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
