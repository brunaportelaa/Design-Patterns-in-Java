package payments;


import payments.factory.PaymentProcessor;
import payments.factory.implementations.BoletoPaymentProcessor;
import payments.factory.implementations.CreditCardPaymentProcessor;
import payments.factory.implementations.PixPaymentProcessor;
import payments.model.BoletoPaymentDetailsDTO;
import payments.model.CreditCardPaymentDetailsDTO;
import payments.model.PixPaymentDetailsDTO;

public class MainApplication {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PaymentProcessor pixProcessor = new PixPaymentProcessor();
        PaymentProcessor boletoProcessor = new BoletoPaymentProcessor();

        CreditCardPaymentDetailsDTO creditCardDetails = new CreditCardPaymentDetailsDTO(
        "192830918321",
                "12/31",
                "321"
        );

        PixPaymentDetailsDTO pixDetails = new PixPaymentDetailsDTO(
                "54862589632",
                true
        );

        BoletoPaymentDetailsDTO boletoPaymentDetailsDTO = new BoletoPaymentDetailsDTO(
                "238712937182371",
                false
        );

        System.out.println(creditCardProcessor.process(12000, creditCardDetails));
        System.out.println(pixProcessor.process(20000, pixDetails));
        System.out.println(boletoProcessor.process(30000, boletoPaymentDetailsDTO));
    }
}
