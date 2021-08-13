public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumero(3,4,5);
        imprimirNumero(2,9);

        variosParametros("Nicolas",20,60,70,60,80);
        variosParametros("Nacho",2,4,6);

    }

    private static void variosParametros(String nombre,int... numerso){
        System.out.println("Nombre= "+ nombre);
        imprimirNumero(numerso);
    }

    private static void imprimirNumero(int... numeros){
        for (int i=0;i< numeros.length;i++){
            System.out.println("Elemento: "+numeros[i]);
        }

    }
}
