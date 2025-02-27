public class Main {

    public static void main(String[] args) {

        // high priority requests
        RequestCreator highPriorityCreator = new HighPriorityConcreteCreator();

        highPriorityCreator.processRequest("High", "2025-20-2", "Accept");

        System.out.println("\n--------------------------------------------------------------\n");

        // low priority requests
        RequestCreator lowPriorityCreator = new LowPriorityConcreteCreator();

        lowPriorityCreator.processRequest("Low", "2025-20-1", "Accept Denied");

        System.out.println("\n--------------------------------------------------------------\n");

        // medium priority requests
        RequestCreator midPriorityCreator = new MidPriorityConcreteCreator();

        midPriorityCreator.processRequest("Medium", "2025-10-1", "Accepted");

    }

}
