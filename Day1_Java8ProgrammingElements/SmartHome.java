import java.util.*;

interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Motion detected: Lights ON!");
        LightAction nightTimeTrigger = () -> System.out.println("Night time: Dim lights!");
        LightAction voiceCommandTrigger = () -> System.out.println("Voice command received: Lights change color!");

        List<LightAction> triggers = Arrays.asList(motionTrigger, nightTimeTrigger, voiceCommandTrigger);

        triggers.forEach(LightAction::execute);
    }
}
