import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.function.DoubleBinaryOperator;

public class Calculadora {
    /*
    Map<String, DoubleBinaryOperator> operaciones;
    public Calculadora(){
        this.operaciones = new HashMap<>();
        operaciones.put("+",(a,b) -> (a+b));
        operaciones.put("-", (a,b) -> (a-b));
        operaciones.put("*", (a,b) -> (a*b));
        operaciones.put("/", (a,b) -> (a/b));
        operaciones.put("^", (a,b) -> Math.pow(a,b));
        operaciones.put("raiz", (a,b) -> Math.pow(b,1.0/a));
    }*/

    DoubleBinaryOperator [] operaciones;

    public Calculadora() {
        this.operaciones = new DoubleBinaryOperator[6];
        operaciones[0] = (a, b) -> a + b;
        operaciones[1] = (a, b) -> a - b;
        operaciones[2] = (a, b) -> a * b;
        operaciones[3] = (a, b) -> a / b;
        operaciones[4] = (a, b) -> Math.pow(a, b);
        operaciones[5] = (a, b) -> Math.pow(b, 1.0 / a);
    }

    public double calcular(double ope1, int operacion ,double ope2){
        return operaciones[operacion].applyAsDouble(ope1,ope2);
    }
}
