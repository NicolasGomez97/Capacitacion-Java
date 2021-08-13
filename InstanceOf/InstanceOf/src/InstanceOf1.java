import domain.*;


public class InstanceOf1 {
    public static void main(String[] args) {
        Empleado1 empleado = new Empleado1("Nicolas", 50000);
        empleado = new Generate1("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
        empleado = new Escritor("Nicolas",50000,TipoEscritura.CLASICO);


        //downcasting
        //((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();

        Empleado1 empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());


    }

    public static void determinarTipo(Empleado1 empleado){
        if (empleado instanceof Generate1){
            System.out.println("Es de tipo Gerente");
            Generate1 generate1 = (Generate1) empleado;
            System.out.println(generate1.getDepartamento());
        }
        else if(empleado instanceof Empleado1){
            System.out.println("Es de tipo Empleado");
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
}
