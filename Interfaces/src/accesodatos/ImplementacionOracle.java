package accesodatos;

public class ImplementacionOracle implements AccesoDatos {

    @Override
    public void inserta() {
        System.out.println("insert desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actulizar() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");
    }
}
