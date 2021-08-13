package domain;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadoOrdenes;
    private int contadorComputadoras;
    private static final int maxComputadoras =10;

    public Orden(){
        this.idOrden=++Orden.contadoOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < Orden.maxComputadoras){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("Has superado el limiete: "+Orden.maxComputadoras);
        }
    }

    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadoras de la ordem #: "+this.idOrden);
        for (int i = 0; i < this.contadorComputadoras;i++){
            System.out.println(this.computadoras[i]);
        }
    }
}
