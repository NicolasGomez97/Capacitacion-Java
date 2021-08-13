public class Casa extends Propiedades{
    public boolean garaje;

    public Casa(int id, String direccion, int habitacion, float precioBase, boolean comercial, int inquilinos, boolean garaje) {
        super(id, direccion, habitacion, precioBase, comercial, inquilinos);
        this.garaje = garaje;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    @Override
    public float calcularAlquiler() {
        if (comercial){
            return precioBase +1000;
        }
        else {
            return precioBase;
        }
    }
}
