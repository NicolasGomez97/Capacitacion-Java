public class InferenciaTipos {
    public static void main(String args[]){
        int miVatiableEntera = 10; // Variable primitivos
        System.out.println(miVatiableEntera);

        // no se puede volver a definir una variable.Te tira Error
        //Modificamos el valor de la variable
        miVatiableEntera = 5;
        System.out.println(miVatiableEntera);

        // Definimos una variable String(Cadena)
        String  miVaribleCadena = "Saludos";
        System.out.println(miVaribleCadena);

        // Modificamos el valor de la variable String
        miVaribleCadena = "Adios";
        System.out.println(miVaribleCadena);

        // Utilizar Var - Inferencia de tipo Java
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);


        // Var variable String
        var miVariableString2 = "Mi Variable cadena 2";
        System.out.println(miVariableString2);

        System.out.println("miVariableString2 = " + miVariableString2); // + concatenacion

        // Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áMiVariable = 10; no se recomienda utilizar
        // var #MiVariable = 10; no se permite utilizar caracteres especiales

    }
}
