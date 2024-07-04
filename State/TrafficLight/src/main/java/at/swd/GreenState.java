package at.swd;

public class GreenState implements State {
    @Override
    public void handle() {
        System.out.println("The traffic light is green. Go!");
    }
}
