package domain;

public class Administrativo extends Empleado{
    private boolean presentismo;
    private static float sumarTotal;

    public Administrativo(int legajo, String nombre, float sueldoBasico, boolean presentismo) {
        super(legajo, nombre, sueldoBasico);
        this.presentismo = presentismo;
    }


    public float calcularSueldo(){
        return sueldoBasico*((presentismo)?1.13f:1);
    }

    @Override
    public void sumarSueldoTotal() {
       sumarTotal += calcularSueldo();
    }
    /*
    public String totalArea() {
        return "El sueldo a pagar en total del area de Administrativos es " + sumarSueldoTotal();
    }*/

    @Override
    public String toString() {
        return "Administrativo{" +
                "presentismo=" + presentismo +
                ", legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", sueldoBasico=" + sueldoBasico +
                ", CalcularSueldoAdm="+ calcularSueldo()+
                ", Sumar sueldos Admi = "+ sumarTotal+
                '}';
    }


}
