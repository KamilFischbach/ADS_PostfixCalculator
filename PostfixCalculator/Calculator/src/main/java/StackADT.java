import java.util.EmptyStackException;
import java.util.StringTokenizer;

public interface StackADT
{
    Token pop() throws EmptyStackException;
    void push(Token token) throws IllegalArgumentException;
}
