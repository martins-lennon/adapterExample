public class PayPalService {
   public void fazerPagamento(String creditCard, float amountInUSD) {
        System.out.println("-> [Log PayPal] Comunicando com o banco central...");
        System.out.println("-> [Log PayFacil] Cartão: " + creditCard);
        System.out.println("-> [Log PayFacil] Valor Processado: R$ " + amountInUSD);
        System.out.println("-> [Log PayFacil] Transação realizada com sucesso!");
    }
}
