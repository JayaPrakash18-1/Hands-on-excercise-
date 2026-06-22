package ProxyPatternExample;

public class ProxyImage {
    private RealImage realImage;
    public void diplay(){
        if(realImage==null) realImage=new RealImage();
        System.out.println("Displaying from Proxy");
        realImage.display();
    }
}
