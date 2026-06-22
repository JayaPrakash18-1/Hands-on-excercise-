package DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator {
    public void send(){
        System.out.println("Slack Mail sent");
    }
}
