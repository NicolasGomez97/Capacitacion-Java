package funcional.v6_lambda.interfaces;

@FunctionalInterface
public interface Funcion<T, R> {
    R aplicar(T valor);
}
