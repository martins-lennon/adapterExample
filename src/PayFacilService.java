public class PayFacilService {

    public void executarTransacao(String numero, String cvv, double quantiaCentavos) {
        System.out.println("-> [Log PayFacil] Comunicando com o banco central...");
        System.out.println("-> [Log PayFacil] Cartão: " + numero + " (CVV: " + cvv + ")");
        System.out.println("-> [Log PayFacil] Valor Processado: R$ " + (quantiaCentavos / 100));
        System.out.println("-> [Log PayFacil] Transação realizada com sucesso!");
    }

}
