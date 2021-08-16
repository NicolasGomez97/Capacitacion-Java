package funcional.v6_lambda.interfaces;

@FunctionalInterface
public interface FuncionBinaria<T, U, R> {
     T aplicar(U valor1, R valor2);
}
