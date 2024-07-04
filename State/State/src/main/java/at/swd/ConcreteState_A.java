package at.swd;

public class ConcreteState_A implements State {
    @Override
    public void handle() {
        System.out.println("ConcreteState_A is handling the request.");
    }
}
