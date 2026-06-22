package ObserverPatternExample;

public class Test {
    public static void main(String[] args) {
        StockMarket sm=new StockMarket();
        Observer mobileApp=new MobileApp();
        Observer webApp=new WebApp();
        sm.register(mobileApp);
        sm.register(webApp);
        sm.price=100;
        sm.notifyy();
        sm.deregister(mobileApp);
        sm.price=50;
        sm.notifyy();
    }
}
