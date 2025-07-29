package payments.implementations;

import payments.factory.Payment;

public class BoletoPayment implements Payment {
    String number;
    boolean isConfirmed;

    public BoletoPayment(String number, boolean isConfirmed) {
        this.number = number;
        this.isConfirmed = isConfirmed;
    }

    @Override
    public void validate() {
        if ( !isConfirmed || number.matches("\\d{10}\\.\\d{10}\\.\\d{10}\\.\\d{10}\\.\\d{10}\\d{1}")) {
            System.out.println("Either the payment was not confirmed or number is invalid");
        }
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);

    }

    @Override
    public String getPaymentConfirmation() {
        return "Boleto payment processed";
    }
}
