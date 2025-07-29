package payments.model;

public class PixPaymentDetailsDTO extends PaymentDetailsDTO {
    private String cpf;
    private boolean isConfirmed;

    public PixPaymentDetailsDTO(String cpf, boolean isConfirmed) {
        this.cpf = cpf;
        this.isConfirmed = isConfirmed;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
}
