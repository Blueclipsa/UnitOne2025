package Module7Lab3;
/*
    James Quinn
    12/05/2025
    Technical support, is capable of handling basic issues if called but is focused on medium priority issues.
    Treats any request it cannot handle as high priority for the next handler
 */
public class TechnicalSupport implements SupportHandler
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
        if (ticket.getPriority() == SupportTicket.Priority.LOW ||
                ticket.getPriority() == SupportTicket.Priority.MEDIUM)
        {
            System.out.println("Technical support was able to assist you");
        }
        else if (nextHandler != null)
        {
            System.out.println("Technical support cannot assist with this issue. Escalating ticket");
            ticket.setPriority(SupportTicket.Priority.HIGH);
            nextHandler.handleRequest(ticket);
        }
        else
        {
            System.out.println("Ticket was not able to be handled.");
        }
    }
}
