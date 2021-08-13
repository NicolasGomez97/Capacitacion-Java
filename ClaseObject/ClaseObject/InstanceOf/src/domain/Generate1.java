package domain;

public class Generate1 extends Empleado1 {
    private String departamento;

    public Generate1(String nombre, double sueldo, String departamento) {
        super(nombre,sueldo);
        this.departamento = departamento;
    }
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
