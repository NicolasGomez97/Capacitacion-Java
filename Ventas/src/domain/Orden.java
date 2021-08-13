package domain;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int maxProductos = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.maxProductos];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.maxProductos){
            this.productos[this.contadorProductos++] = producto;
        }
        else {
            System.out.println("se ha superado el maximo de productos" + Orden.maxProductos);
        }
    }

    public float calcularTotal(){
        float total =0;
        for (int i = 0; i < this.contadorProductos;i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("id orden"+this.idOrden);
        float totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $"+totalOrden);
        for (int i=0; i < this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}
