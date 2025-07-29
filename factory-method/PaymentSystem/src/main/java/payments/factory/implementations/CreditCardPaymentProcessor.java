package payments.factory.implementations;

import payments.factory.Payment;
import payments.factory.PaymentProcessor;
import payments.implementations.CreditCardPayment;
import payments.model.CreditCardPaymentDetailsDTO;
import payments.model.PaymentDetailsDTO;

import java.util.Map;

public class CreditCardPaymentProcessor extends PaymentProcessor {

    @Override
    public Payment createPayment(PaymentDetailsDTO details) {
        CreditCardPaymentDetailsDTO paymentDetails = (CreditCardPaymentDetailsDTO) details;
        return new CreditCardPayment(
                paymentDetails.getCardNumber(),
                paymentDetails.getExpiryDate(),
                paymentDetails.getCvv());
    }
}
