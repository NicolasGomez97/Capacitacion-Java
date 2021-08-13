public class OperadoresIgualdadyRelacionales {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a!=b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Adios";
        
        var resultado = (cadena == cadena2);// compara referencias de objetos
        System.out.println("resultado = " + resultado);

        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);
        
        cadena = "Hola";
        cadena2= "Hola";
        
        f = cadena.equals(cadena2);
        System.out.println("f = " + f);

        var g = a >= b;
        System.out.println("g = " + g);

        if (a%2 ==0){
            System.out.println("ES PAR");
        }
        else {
            System.out.println("ES IMPAR");
        }
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
    }
}
