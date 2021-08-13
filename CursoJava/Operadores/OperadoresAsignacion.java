public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 3, b=2;
        int c = a + 5 - b;
        System.out.println("c = " + c);

        a +=1;
        System.out.println("a = " + a);

        // *= /=
        a = 10;
        a *= 2;
        System.out.println("a = " + a);
        a /= 2;
        System.out.println("a = " + a);
    }
}
