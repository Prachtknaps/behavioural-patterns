package at.swd;

public class YellowState implements State {
    @Override
    public void handle() {
        System.out.println("The traffic light is yellow. Get ready to go!");
    }
}
