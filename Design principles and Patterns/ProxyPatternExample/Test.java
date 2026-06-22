package ProxyPatternExample;

public class Test {
    public static void main(String[] args) {
        RealImage real=new RealImage();
        ProxyImage proxy=new ProxyImage();
        real.display();
        proxy.diplay();
    }
}
