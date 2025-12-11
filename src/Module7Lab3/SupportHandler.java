package Module7Lab3;
/*
    James Quinn
    12/05/2025
    Defines behavior for SupportHandlers and facilitates polymorphic behavior
 */
public interface SupportHandler
{
    void handleRequest(SupportTicket ticket);

    void setNextHandler(SupportHandler next);
}
