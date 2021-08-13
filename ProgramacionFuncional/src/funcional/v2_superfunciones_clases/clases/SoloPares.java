package funcional.v2_superfunciones_clases.clases;

import funcional.v2_superfunciones_clases.interfaces.Predicado;

import java.util.ArrayList;
import java.util.List;

public class SoloPares implements Predicado {


    @Override
    public Boolean test(Integer valor) {
        return valor % 2==0;
    }
}
