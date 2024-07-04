package at.swd;

public class Main {
    public static void main(String[] args) {
        SupportHandler firstLevelSupport = new FirstLevelSupport();
        SupportHandler secondLevelSupport = new SecondLevelSupport();
        SupportHandler managerLevelSupport = new ManagerLevelSupport();

        firstLevelSupport.setNextHandler(secondLevelSupport);
        secondLevelSupport.setNextHandler(managerLevelSupport);

        firstLevelSupport.handleRequest("basic");
        firstLevelSupport.handleRequest("intermediate");
        firstLevelSupport.handleRequest("complex");
        firstLevelSupport.handleRequest("unknown");
    }
}