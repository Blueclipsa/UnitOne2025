package Module7Lab3;
/*
    James Quinn
    12/05/2025
    Managerial support, only handles pressing high priority issues.
 */
public class ManagerialSupport implements SupportHandler
{
    private SupportHandler nextHandler;


    @Override
    public void setNextHandler(SupportHandler next)
    {
        this.nextHandler = next;
    }

    @Override
    public void handleRequest(SupportTicket ticket)
    {
        if (ticket.getPriority() == SupportTicket.Priority.HIGH) // Managerial support only handles high priority issues
        {
            System.out.println("Managerial support handled the issue");
        }
        else if (nextHandler != null)
        {
            System.out.println("Managerial support escalated the ticket");
            nextHandler.handleRequest(ticket);
        }
        else
        {
            System.out.println("Ticket was not able to be handled.");
        }
    }
}
