import java.util.EmptyStackException;
import java.util.StringTokenizer;

public class StackLinkedList implements StackADT
{
    private class Element
    {
        Token value;
        Element link;
    }

    private Element top;

    public StackLinkedList()
    {
        this.top=null;
    }
    public Token pop() throws EmptyStackException
    {
        if(top!=null)
        {
            Token temp = top.value;
            top=(top).link;
            return temp;
        }
        else
        {
            throw new EmptyStackException();
        }
    }

    public void push(Token token) throws IllegalArgumentException
    {
        if (token==null)
        {
            throw new IllegalArgumentException("Token cannot be null.");
        }
        Element element = new Element();
        element.value=token;
        element.link=top;
        top=element;
    }
}
