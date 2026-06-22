package CommandPatternExample;

public class Test {
    public static void main(String[] args) {
        Light light=new Light();
        Command on=new LightOnCommand(light);
        Command off=new LightOffCommand(light);
        RemoteControl rc=new RemoteControl();
        rc.setCommand(off);
        rc.run();
        rc.setCommand(on);
        rc.run();
    }
}
