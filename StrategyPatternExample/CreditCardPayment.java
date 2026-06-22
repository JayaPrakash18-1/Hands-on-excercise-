package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy{
    public void pay(){
        System.out.println("Logic from creditcard.");
    }
}
