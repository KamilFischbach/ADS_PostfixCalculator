import java.util.StringTokenizer;

public interface StackADT
{
    Token pop();
    void push(Token token);
    Token peek();
}
