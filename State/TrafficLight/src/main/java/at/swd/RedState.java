package at.swd;

public class RedState implements State {
    @Override
    public void handle() {
        System.out.println("The traffic light is red. Stop!");
    }
}
