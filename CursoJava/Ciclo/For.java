public class For {
    public static void main(String[] args) {
        for (var contador = 0; contador <= 10;contador++){
            System.out.println("contador = " + contador);
            if (contador == 6 ){
                break;
            }
        }
        for (var contador = 0; contador <= 10;contador++){
            if (contador % 2 != 0){
                continue;
            }
            System.out.println("contador = " + contador);
        }
    }
}
