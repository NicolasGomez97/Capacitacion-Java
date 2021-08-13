public class Concatenacion {
    public static void main(String args[]){
        var usuario = "Juan";
        var titulo = "Ingeniero";
        // concatenamos
        var union = titulo + " " + usuario;

        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i+j);// Se realiza la suma de numeros
        System.out.println(i + j + usuario);// se reliza la suma y concatena el nombre usuario
        System.out.println(usuario + i + j);// se concatena sin suma
        System.out.println(usuario + (i + j));// se concatena con suma

    }
}
