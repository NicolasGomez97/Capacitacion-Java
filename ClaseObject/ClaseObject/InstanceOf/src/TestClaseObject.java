import domain.*;


public class TestClaseObject {
    public static void main(String[] args) {
        Empleado1 empleado1 = new Empleado1("Nicolas", 5000);
        Empleado1 empleado2 = new Empleado1("Nicolas", 5000);

        if (empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else {
            System.out.println("Son distintas");
        }

        if (empleado1.equals(empleado2)){
            System.out.println("Son iguales en contenidos");
        }


    }
}
