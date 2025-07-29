package payments.implementations;

import payments.factory.Payment;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void validate() {
        if (cardNumber == null || !cardNumber.matches("\\d{16}")) {
            System.out.println("Invalid card number");
        }
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);

    }

    @Override
    public String getPaymentConfirmation() {
        return "Credit card payment processed";
    }
}
