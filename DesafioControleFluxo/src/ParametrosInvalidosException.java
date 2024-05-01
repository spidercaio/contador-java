public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super("O primeiro valor deve ser menor que o segundo...");
    }
}
