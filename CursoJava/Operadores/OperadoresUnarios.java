public class OperadoresUnarios {
    public static void main(String[] args) {
        var a =3;
        var b =-a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // invremento
        //1. preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; //Primero se incrementa la variable y despues se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2. posincremento (simbolo despues)
        var g = 5;
        var h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

    }
}
