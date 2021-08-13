import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        Inmobiliaria lsinmobiliaria = new Inmobiliaria();
        Scanner archivo = new Scanner(new File("Propiedades.txt"));
        archivo.useDelimiter("[;\\n]");

        while (archivo.hasNextInt()){
            Propiedades nuevo = null;
            int tipo = archivo.nextInt();
            int id = archivo.nextInt();
            String direccion = archivo.next();
            int habitacion = archivo.nextInt();
            float precioBase = archivo.nextFloat();
            boolean comercial=archivo.nextBoolean();
            int inquilinos = archivo.nextInt();
            switch (tipo){
                case 1:
                    boolean garage = archivo.nextBoolean();
                    nuevo = new Casa(id,direccion,habitacion,precioBase,comercial,inquilinos,garage);
                    break;
                case 2:
                    float expensa = archivo.nextFloat();
                    nuevo = new Departamento(id,direccion,habitacion,precioBase,comercial,inquilinos,expensa);
                    break;
            }
            lsinmobiliaria.agregar(nuevo);
        }
        System.out.println("El monto promedio de alquileres de las propiedades con 2 inquilinos es: "+lsinmobiliaria.calcularPromedio());
        System.out.println("Cantidad de casas de 3 habitaciones o que posean garaje: " + lsinmobiliaria.cantidaCasaGaraje(3));
    }
}
