package domain;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado=+contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                ", idTeclado=" + idTeclado +
                '}';
    }
}
