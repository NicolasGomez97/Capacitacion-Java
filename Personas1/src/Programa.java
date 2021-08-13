public class Programa {
    public static void main(String[] args) {
        Persona p,q;
        p = new Persona(40750182,"Nicolas Gomez",23);
        q = new Persona();
        
        q.setDocumento(40750182);
        q.setNombre("Nicolas Gomez");
        q.setEdad(23);

        System.out.println("p.getNombre() = " + p.getNombre());
        System.out.println("p.getDocumento() = " + p.getDocumento());
        System.out.println("p.getEdad() = " + p.getEdad());
        System.out.println("q.getNombre() = " + q.getNombre());
        System.out.println("q.getDocumento() = " + q.getDocumento());
        System.out.println("q.getEdad() = " + q.getEdad());
    }

}
