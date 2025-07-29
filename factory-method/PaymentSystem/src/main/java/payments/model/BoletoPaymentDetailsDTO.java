package payments.model;

public class BoletoPaymentDetailsDTO extends PaymentDetailsDTO {
    private String number;
    private boolean isConfirmed;

    public BoletoPaymentDetailsDTO(String number, boolean isConfirmed) {
        this.number = number;
        this.isConfirmed = isConfirmed;
    }

    public String getNumber() {
        return number;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
}
