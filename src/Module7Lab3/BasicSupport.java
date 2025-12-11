package Module7Lab3;
/*
    James Quinn
    12/05/2025
    Basic Support, handles low priority issues and escalates if necessary.
 */
public class BasicSupport implements SupportHandler
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
        if (ticket.getPriority() == SupportTicket.Priority.LOW)
        {
            System.out.println("Basic support handled the issue");
        }
        else if (nextHandler != null)
        {
            System.out.println("Basic support escalated the ticket");
            nextHandler.handleRequest(ticket);
        }
        else
        {
            System.out.println("Ticket was not able to be handled.");
        }
    }
}
