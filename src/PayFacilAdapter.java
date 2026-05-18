public class PayFacilAdapter implements ProcessadorPagamento {
    private PayFacilService payFacilService;

    PayFacilAdapter(PayFacilService payFacilService) {
        this.payFacilService = payFacilService;
    }

    @Override
    public void debitar(double valor, String numeroDoCartao) {
        double valorEmCentavos = valor * 100;
        String cvv = "999";

        payFacilService.executarTransacao(numeroDoCartao, cvv, valorEmCentavos);
    }
}
