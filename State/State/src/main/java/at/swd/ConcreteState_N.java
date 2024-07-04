package at.swd;

public class ConcreteState_N implements State {
    @Override
    public void handle() {
        System.out.println("ConcreteState_N is handling the request.");
    }
}
