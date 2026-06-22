package DecoratorPatternExample;

public class Test {
    public static void main(String[] args) {
        Notifier sms=new SMSNotifierDecorator();
        Notifier slack=new SlackNotifierDecorator();
        Notifier email=new EmailNotifier();
        sms.send();
        slack.send();
        email.send();
    }
}
