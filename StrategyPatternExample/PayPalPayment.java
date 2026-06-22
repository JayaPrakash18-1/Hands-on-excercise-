package StrategyPatternExample;

public class PayPalPayment implements PaymentStrategy{
    public void pay(){
        System.out.println("Logic from paypal.");
    }
}
