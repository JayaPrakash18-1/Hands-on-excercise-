package StrategyPatternExample;
public class PaymentContext {
    private PaymentStrategy strategy;
    public PaymentContext(PaymentStrategy strategy){
        this.strategy=strategy;
    }
    public void pay(){
        strategy.pay();
    }
}
