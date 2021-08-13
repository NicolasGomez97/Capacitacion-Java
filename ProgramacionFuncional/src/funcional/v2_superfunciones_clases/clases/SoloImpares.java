package funcional.v2_superfunciones_clases.clases;

import funcional.v2_superfunciones_clases.interfaces.Predicado;

public class SoloImpares implements Predicado {


    @Override
    public Boolean test(Integer valor) {
        return valor % 2!=0;
    }
}
