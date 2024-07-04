package at.swd;

public class TrafficLightContext {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        if (state != null) {
            state.handle();
        } else {
            System.out.println("State is not set.");
        }
    }
}
