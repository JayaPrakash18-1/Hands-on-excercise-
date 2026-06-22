package ObserverPatternExample;

public class WebApp implements Observer{
    public void update(int views){
        System.out.println("Web :: No.of views:"+views);
    }
}
