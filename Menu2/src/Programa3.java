import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 12;
        int y = 18;
        Menu3 m = new Menu3();
        m.mostrar1(sc,
                new String[]{"sumar","restar","multiplicar"},
                new Runnable[]{()-> System.out.println(x+y),
                               ()-> System.out.println(x-y),
                               ()-> System.out.println(x*y)});
    }
}
