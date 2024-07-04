package at.swd;

public class FirstLevelSupport extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("basic")) {
            System.out.println("First Level Support: Handling basic request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}
