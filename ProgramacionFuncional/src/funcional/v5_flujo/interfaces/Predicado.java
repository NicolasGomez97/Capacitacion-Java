package funcional.v5_flujo.interfaces;

public interface Predicado<T> {
    Boolean test(T valor);

    Boolean test(Integer valor);
}
