package funcional.v6_lambda.interfaces;

public interface Predicado<T> {
    Boolean test(T valor);

    Boolean test(Integer valor);
}
