package StrategyPatternExample;

public class Test {
    public static void main(String[] args) {
        PaymentContext contextPaypal=new PaymentContext(new PayPalPayment());
        contextPaypal.pay();
        PaymentContext contextCredit=new PaymentContext(new CreditCardPayment());
        contextCredit.pay();
    }
}
