import Clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Nicolas");
        persona1.setApellido("Gomez");
        persona1.desplegarInformacion();
    }
}
