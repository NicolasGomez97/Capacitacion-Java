package domain;

public class Vendedor extends Empleado {
    private float totalVentas;
    private static float sumarTotal;

    public Vendedor(int legajo, String nombre, float sueldoBasico, float totalVentas) {
        super(legajo, nombre, sueldoBasico);
        this.totalVentas = totalVentas;
    }

    public float calcularSueldo(){
        return sueldoBasico + (totalVentas*0.1f);
    }

    public void sumarSueldoTotal() { sumarTotal += calcularSueldo();}
    @Override
    public String toString() {
        return "Vendedor{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", totalVentas=" + totalVentas +
                ", CalcularSueldoVendedor="+ calcularSueldo()+
                ", Sumar sueldos vend= "+ sumarTotal+
                '}';
    }

    /*
    public String totalArea(){
        return "El sueldo a pagar en total del area de ventas es " + sumarSueldoTotal();
    }*/
}
