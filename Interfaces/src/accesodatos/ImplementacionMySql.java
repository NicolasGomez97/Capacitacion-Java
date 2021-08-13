package accesodatos;

public class ImplementacionMySql implements AccesoDatos {

    @Override
    public void inserta() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actulizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");
    }
}
