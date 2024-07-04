package at.swd;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        State stateA = new ConcreteState_A();
        State stateB = new ConcreteState_B();
        State stateN = new ConcreteState_N();

        context.setState(stateA);
        context.request();

        context.setState(stateB);
        context.request();

        context.setState(stateN);
        context.request();
    }
}