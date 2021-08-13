package test;

import accesodatos.AccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

public class TestInterfaces {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        datos.actulizar();
        datos = new ImplementacionOracle();
        datos.actulizar();
    }
}
