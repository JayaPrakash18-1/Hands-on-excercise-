package AdapterPatternExample;

public class UpiAdaptor implements PaymentProcessor {
    private UpiAdaptee upipayment;
    public UpiAdaptor(UpiAdaptee upi){
        upipayment=upi;
    }
    public void processPayment(){
        upipayment.upiPayment();
    }
}
