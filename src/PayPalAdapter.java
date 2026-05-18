public class PayPalAdapter implements ProcessadorPagamento {
    PayPalService payPalService = new PayPalService();

    PayPalAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void debitar(double valor, String numeroDoCartao) {
        float valorEmDolar = (float) ((float) valor/0.5);
        payPalService.fazerPagamento(numeroDoCartao, valorEmDolar);
    }
}
