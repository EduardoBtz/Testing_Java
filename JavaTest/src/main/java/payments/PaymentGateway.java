package payments;

public interface PaymentGateway {
    PaymmentResponse requestPayment(PaymentRequest request);
}
