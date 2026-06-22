package AdapterPatternExample;

public class CardAdaptor implements PaymentProcessor{
    private CardAdaptee cardpayment;
    public CardAdaptor(CardAdaptee card){
        cardpayment=card;
    }
    public void processPayment(){
        cardpayment.cardPayment();
    }
}
