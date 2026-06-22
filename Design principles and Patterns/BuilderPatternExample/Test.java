package BuilderPatternExample;

public class Test {
    public static void main(String[] args) {
        // Computer.Builder com1=new Computer.Builder();
        // com1.setCpu("i7");
        // com1.setStorage(500);
        // com1.setRam(32);
        // Computer c=com1.build();
        Computer com=new Computer.Builder().setCpu("i5").setRam(32).setStorage(500).build();
        com.print();
    }
}
