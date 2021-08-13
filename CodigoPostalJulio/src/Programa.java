import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File("cp.txt"));
        Scanner teclado = new Scanner(System.in);

        archivo.useDelimiter("[;\\n]");
        System.out.println("Ingrese una localidad: ");
        String local = teclado.nextLine();

        while(archivo.hasNext()){
            String prov = archivo.next();
            int cod = archivo.nextInt();
            String loc = archivo.next();

            CodigoPostal cp = new CodigoPostal(prov,cod,loc);

            if(cp.getLocalidad().contains(local)){
                System.out.println(cp.getCodigo()+" "+cp.getProvincia()+" "+cp.getLocalidad());
            }
        }
        archivo.close();
    }
}
