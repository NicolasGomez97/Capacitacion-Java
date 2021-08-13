package domain;

public class Obrero extends Empleado{
    private int diasTrabajados;
    private static float sumarTotal;
    private static int contadorObrero ;

    public Obrero(int legajo, String nombre, float sueldoBasico, int diasTrabajados) {
        super(legajo, nombre, sueldoBasico);
        this.diasTrabajados = diasTrabajados;
        contadorObrero++;
    }



    public float calcularSueldo(){
        return sueldoBasico/22*diasTrabajados;
    }

    @Override
    public void sumarSueldoTotal() {
        sumarTotal += calcularSueldo();
    }

    public float promedioSueldo(){
        return sumarTotal/contadorObrero;
    }



    @Override
    public String toString() {
        return "Obrero{" +
                "legajo=" + legajo +
                ", nombre=" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", diasTrabajados=" + diasTrabajados +
                ", CalcularSueldoObrero="+ calcularSueldo()+
                ", Sumar sueldos obre= "+ sumarTotal+
                ", Promedio Sueldo obrero= "+ promedioSueldo()+
                '}';
    }
    /*
    public String totalArea() {
        return "El sueldo a pagar en total del area de Obreros es " + sumarSueldoTotal();
    }*/
}
