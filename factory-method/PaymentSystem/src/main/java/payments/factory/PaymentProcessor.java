package payments.factory;

import payments.model.PaymentDetailsDTO;

import java.util.Map;

public abstract class PaymentProcessor {
    public abstract Payment createPayment(PaymentDetailsDTO paymentDetails);

    public String process (double amount, PaymentDetailsDTO paymentDetails) {
        Payment payment = createPayment(paymentDetails);
        payment.validate();
        payment.processPayment(amount);
        return payment.getPaymentConfirmation();
    }

}
