package DecoratorPatternExample;

public abstract class NotifierDecorator implements Notifier {
    public void send(){
        System.out.println("Decoter");
    }
}
