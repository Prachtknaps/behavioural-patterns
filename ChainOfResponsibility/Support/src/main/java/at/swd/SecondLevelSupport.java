package at.swd;

public class SecondLevelSupport extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("intermediate")) {
            System.out.println("Second Level Support: Handling intermediate request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
