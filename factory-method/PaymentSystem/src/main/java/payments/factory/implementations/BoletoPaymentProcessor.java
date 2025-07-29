package payments.factory.implementations;

import payments.factory.Payment;
import payments.factory.PaymentProcessor;
import payments.implementations.BoletoPayment;
import payments.implementations.PixPayment;
import payments.model.BoletoPaymentDetailsDTO;
import payments.model.PaymentDetailsDTO;
import payments.model.PixPaymentDetailsDTO;

public class BoletoPaymentProcessor extends PaymentProcessor {

    @Override
    public Payment createPayment(PaymentDetailsDTO details) {
        BoletoPaymentDetailsDTO paymentDetails = (BoletoPaymentDetailsDTO) details;
        return new BoletoPayment(
                paymentDetails.getNumber(),
                paymentDetails.isConfirmed()
                );
    }
}
