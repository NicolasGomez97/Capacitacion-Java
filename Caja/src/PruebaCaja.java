public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.setAncho(3);
        caja1.setAlto(2);
        caja1.setProfundo(6);
        System.out.println(caja1.volumen());
        Caja caja2 = new Caja(3,2,6);
        System.out.println(caja2.volumen());
    }
}
