import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Inmobiliaria {
    //private TreeSet<Propiedades> lista;
    private HashSet<Propiedades> lista;


    public Inmobiliaria(){
        //this.lista = new TreeSet<>();
        this.lista = new HashSet<>();

    }

    public void agregar(Propiedades nuevo){
        lista.add(nuevo);
    }

    public void eliminar(Propiedades eliminar){
        lista.remove(eliminar);
    }

    public int cantidaCasaGaraje(int hab){
        int cantidad =0;
        for (Propiedades p: lista){
            if (p instanceof Casa){
                Casa ca = (Casa)p;
                if (ca.isGaraje() || ca.getHabitacion()==hab){
                    cantidad++;
                }
            }
        }
        return cantidad;
    }

    public float calcularPromedio(){
        float sumarMonto=0;
        int cont=0;
        float promedio=0;
        for (Propiedades p: lista){
            if (p.inquilinos==2){
                ++cont;
                sumarMonto+=p.calcularAlquiler();
            }
        }
        return promedio=sumarMonto/cont;
    }


}
