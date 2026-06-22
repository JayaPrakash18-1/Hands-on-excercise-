package ProxyPatternExample;

public class RealImage implements Image{
    public void display(){
        System.out.println("Displaying Real Image.RealImage has only access to server.");
    }
}
