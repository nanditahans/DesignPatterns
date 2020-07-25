package BehaviourialPattern.Command;

public class Demo {

    public static void main(String[] args) {
        RemoteControl remote=new RemoteControl();
        Light light=new Light();
        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        remote.setCommand(new LightOffCommand(light));
        remote.buttonWasPressed();
    }
}
