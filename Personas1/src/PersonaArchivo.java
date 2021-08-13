import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonaArchivo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("personas.txt"));
        sc.useDelimiter("[,\\n]");
        Persona mayor = null;

        while (sc.hasNextInt()){
            int documento = sc.nextInt();
            String nombre = sc.next();
            int edad = sc.nextInt();

            Persona p = new Persona(documento,nombre,edad);

            if(mayor == null || p.getEdad() > mayor.getEdad()){
                mayor = p;
            }

            System.out.println("mayor.getEdad() = " + mayor.getEdad());
            System.out.println("mayor.getDocumento() = " + mayor.getDocumento());
            System.out.println("mayor.getNombre() = " + mayor.getNombre());

            System.out.println("mayor.toString() = " + mayor.toString());
        }

    }
}
