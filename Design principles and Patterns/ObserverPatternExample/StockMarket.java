package ObserverPatternExample;
import java.util.ArrayList;

public class StockMarket implements Stock{
    int price;
    ArrayList<Observer> arr=new ArrayList<>();
    public void register(Observer obs){
        arr.add(obs);
    }
    public void deregister(Observer obs){
        arr.remove(obs);
    }
    public void notifyy(){
        for(Observer obs:arr){
            obs.update(price);
        }
    }
}
