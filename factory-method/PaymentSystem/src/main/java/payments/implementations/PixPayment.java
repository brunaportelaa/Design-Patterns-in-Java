package payments.implementations;

import payments.factory.Payment;

public class PixPayment implements Payment {
    String cpf;
    boolean isConfirmed;

    public PixPayment(String cpf, boolean isConfirmed) {
        this.cpf = cpf;
        this.isConfirmed = isConfirmed;
    }

    @Override
    public void validate() {
        if ( !isConfirmed || cpf.matches("/^(([0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2})|([0-9]{11}))$/")) {
            System.out.println("Either the payment was not confirmed or CPF is invalid");
        }
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);

    }

    @Override
    public String getPaymentConfirmation() {
        return "Pix payment processed";
    }
}
