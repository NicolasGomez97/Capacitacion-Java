public abstract class Propiedades {
    protected int id;
    protected String direccion;
    protected int habitacion;
    protected float precioBase;
    protected boolean comercial;
    protected int inquilinos;

    public Propiedades() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }

    public void setInquilinos(int inquilinos) {
        this.inquilinos = inquilinos;
    }

    public int getId() {
        return id;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public boolean isComercial() {
        return comercial;
    }

    public int getInquilinos() {
        return inquilinos;
    }

    public Propiedades(int id, String direccion, int habitacion, float precioBase, boolean comercial, int inquilinos) {
        this.id = id;
        this.direccion = direccion;
        this.habitacion = habitacion;
        this.precioBase = precioBase;
        this.comercial = comercial;
        this.inquilinos = inquilinos;
    }

    public abstract float calcularAlquiler();

    @Override
    public String toString() {
        return "Propiedades{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", habitacion=" + habitacion +
                ", precioBase=" + precioBase +
                ", comercial=" + comercial +
                ", inquilinos=" + inquilinos +
                '}';
    }
}
