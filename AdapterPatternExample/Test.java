package AdapterPatternExample;

public class Test {
    public static void main(String[] args) {
        UpiAdaptee upiGateWay=new UpiAdaptee();
        CardAdaptee cardGateWay=new CardAdaptee();
        UpiAdaptor upi=new UpiAdaptor(upiGateWay);
        CardAdaptor card=new CardAdaptor(cardGateWay);
        upi.processPayment();
        card.processPayment();
    }
}
