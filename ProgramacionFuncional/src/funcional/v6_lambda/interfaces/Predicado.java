package funcional.v6_lambda.interfaces;

@FunctionalInterface
public interface Predicado<T> {
    Boolean test(T valor);
}
