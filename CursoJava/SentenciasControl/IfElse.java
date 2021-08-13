public class IfElse {
    public static void main(String[] args) {
        var condicion = true;

        if(condicion){
            System.out.println("Es verdadera");
        }
        else{
                System.out.println("Es falsa");
            }


        //Else if - if anidado
        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1){
            numeroTexto= "Uno";
        }
        else if(numero ==2){
            numeroTexto = "Dos";
        }
        else if (numero == 3){
            numeroTexto = "Tres";
        }
        System.out.println(numeroTexto);

        //Calcular estacion del año
        var mes =6;
        if (mes == 1 || mes == 2 || mes==3 ){
            System.out.println("Verano");
        }
        else if(mes == 4 || mes == 5 || mes == 6){
            System.out.println("Primavera");
        }
        else if(mes == 7 || mes == 8 || mes == 9){
            System.out.println("Invierno");
        }
        else if(mes == 10 || mes == 11 || mes ==12){
            System.out.println("Otoño");
        }
        else {
            System.out.println("No existe el mes");
        }
    }
}
