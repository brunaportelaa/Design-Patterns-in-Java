package payments.factory;

public interface Payment {
    void validate();
    void processPayment(double amount);
    String getPaymentConfirmation();
}
