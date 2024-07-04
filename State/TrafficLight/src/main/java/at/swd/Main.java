package at.swd;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        State redState = new RedState();
        State yellowState = new YellowState();
        State greenState = new GreenState();

        context.setState(redState);
        context.request();

        context.setState(yellowState);
        context.request();

        context.setState(greenState);
        context.request();
    }
}