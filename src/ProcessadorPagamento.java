public interface ProcessadorPagamento {
    void debitar(double valor, String numeroDoCartao);
}
