public class Departamento extends Propiedades {
    public float expensa;

    public Departamento(int id, String direccion, int habitacion, float precioBase, boolean comercial, int inquilinos, float expensa) {
        super(id, direccion, habitacion, precioBase, comercial, inquilinos);
        this.expensa = expensa;
    }

    public float getExpensa() {
        return expensa;
    }

    public void setExpensa(float expensa) {
        this.expensa = expensa;
    }

    @Override
    public float calcularAlquiler() {
        if (comercial){
            return precioBase+expensa+500;
        }
        else
            return precioBase+expensa;
    }


}
