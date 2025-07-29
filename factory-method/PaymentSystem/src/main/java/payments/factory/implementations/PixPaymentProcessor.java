package payments.factory.implementations;

import payments.factory.Payment;
import payments.factory.PaymentProcessor;
import payments.implementations.PixPayment;
import payments.model.PaymentDetailsDTO;
import payments.model.PixPaymentDetailsDTO;

public class PixPaymentProcessor extends PaymentProcessor {

    @Override
    public Payment createPayment(PaymentDetailsDTO details) {
        PixPaymentDetailsDTO paymentDetails = (PixPaymentDetailsDTO) details;
        return new PixPayment(
                paymentDetails.getCpf(),
                paymentDetails.isConfirmed()
                );
    }
}
