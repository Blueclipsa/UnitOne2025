package Module7Lab3;
/*
    James Quinn
    12/05/2025
 */

public class SupportTicket
{
    private String issue;
    private Priority priority;

    public enum Priority
    {
        HIGH,
        MEDIUM,
        LOW
    }

    public SupportTicket(String issue, Priority priority) throws SupportHandlerException
    {
        setIssue(issue);
        setPriority(priority);
    }

    public String getIssue()
    {
        return issue;
    }

    public Priority getPriority()
    {
        return priority;
    }

    public void setIssue(String issue) throws SupportHandlerException
    {
        if (issue == null || issue.isEmpty())
        {
            throw new  SupportHandlerException("Issue is null or empty");
        }
        else
        {
            this.issue = issue;
        }
    }

    public void setPriority(Priority priority)
    {
        this.priority = priority;
    }
}
