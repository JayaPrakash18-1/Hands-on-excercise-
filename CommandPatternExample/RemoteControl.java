package CommandPatternExample;

public class RemoteControl {
    private Command cmd;
    public void setCommand(Command cmd){
        this.cmd=cmd;
    }
    public void run(){
        cmd.execute();
    }
}
