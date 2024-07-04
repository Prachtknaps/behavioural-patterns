package at.swd;

public class ManagerLevelSupport extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equalsIgnoreCase("complex")) {
            System.out.println("Manager Level Support: Handling complex request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(requestType);
        } else {
            System.out.println("Request type not supported.");
        }
    }
}
