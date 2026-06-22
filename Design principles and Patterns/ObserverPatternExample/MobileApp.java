package ObserverPatternExample;

public class MobileApp implements Observer{
    public void update(int views){
        System.out.println("Mobile :: No.of views:"+views);
    }
}
