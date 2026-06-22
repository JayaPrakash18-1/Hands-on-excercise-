package DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator {
    public void send(){
        System.out.println("SMS sent");
    }
}
