package funcional.v6_lambda.interfaces;

@FunctionalInterface
public interface Consumidor<T> {
    void aceptar(T valor);
}
