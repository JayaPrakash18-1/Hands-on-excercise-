package BuilderPatternExample;

public class Computer{
    private String cpu;
    private int storage;
    private int ram;
    private Computer(Builder builder){
        cpu=builder.cpu;
        storage=builder.storage;
        ram=builder.ram;
    }
    public void print(){
        System.out.println("CPU :"+cpu);
        System.out.println("Ram :"+ram);
        System.out.println("Storage :"+storage);
    }
    static class Builder{
        private String cpu;
        private int storage;
        private int ram;
        public Builder setCpu(String value){
            this.cpu=value;
            return this;
        }
        public Builder setStorage(int value){
            this.storage=value;
            return this;
        }
        public Builder setRam(int value){
            this.ram=value;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}