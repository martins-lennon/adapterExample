//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cliente {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE E-COMMERCE ===");

        PayFacilService payFacilService = new PayFacilService();
        PayPalService payPalService = new PayPalService();

        //ProcessadorPagamanto payFacilAdapter = new PayFacilAdapter(payFacilService);
        ProcessadorPagamento processador = new PayPalAdapter(payPalService);
        double valor = 100.0;
        String numeroDoCartao = "1234567890123456";

        System.out.println("Fechando carrinho de compras...");
        //payFacilAdapter.debitar(valor, numeroDoCartao);
        processador.debitar(valor, numeroDoCartao);

        System.out.println("Transação realizada com sucesso!");

        System.out.println("=== FIM DO SISTEMA ===");

    }
}