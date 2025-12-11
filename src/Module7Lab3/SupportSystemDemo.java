package Module7Lab3;
/*
    James Quinn
    12/05/2025
    Demonstrates the chain of responsibility pattern
 */
public class SupportSystemDemo
{
    public static void main(String[] args) throws SupportHandlerException
    {
        SupportHandler basicSupport = new BasicSupport();
        SupportHandler techSupport = new TechnicalSupport();
        SupportHandler manager = new ManagerialSupport();

        // Chain of responsibility (Basic -> Tech -> Manager)
        basicSupport.setNextHandler(techSupport);
        techSupport.setNextHandler(manager);

        SupportTicket lowPriority = new SupportTicket("Grandma forgot her password", SupportTicket.Priority.LOW);
        SupportTicket mediumPriority = new SupportTicket("Display is showing a black screen",
                SupportTicket.Priority.MEDIUM);
        SupportTicket highPriority = new SupportTicket("Technical support office is not responding to calls",
                SupportTicket.Priority.HIGH);

        // Basic support demonstration
        System.out.println("Basic support, low priority ticket: ");
        basicSupport.handleRequest(lowPriority);
        System.out.println();
        System.out.println("Basic support, medium priority ticket: ");
        basicSupport.handleRequest(mediumPriority);
        System.out.println();
        // Tech support demonstration
        System.out.println("Technical support, low priority ticket: ");
        techSupport.handleRequest(lowPriority);
        System.out.println();
        System.out.println("Technical support, medium priority ticket: ");
        techSupport.handleRequest(mediumPriority);
        System.out.println();
        System.out.println("Technical support, high priority ticket: ");
        techSupport.handleRequest(highPriority);
        System.out.println();
        // Manager demonstration
        System.out.println("Managerial support, low priority ticket: ");
        manager.handleRequest(lowPriority);
        System.out.println();
        System.out.println("Managerial support, high priority ticket: ");
        manager.handleRequest(highPriority);
        System.out.println();
    }
}
