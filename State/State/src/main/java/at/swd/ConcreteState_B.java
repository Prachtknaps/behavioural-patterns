package at.swd;

public class ConcreteState_B implements State {
    @Override
    public void handle() {
        System.out.println("ConcreteState_B is handling the request.");
    }
}
