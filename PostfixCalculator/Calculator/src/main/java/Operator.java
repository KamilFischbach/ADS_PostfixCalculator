public class Operator implements Token
{
    private char operator;

    public Operator(char c)
    {
        if(c =='+' || c=='-' || c=='*'  || c=='/' || c=='%')
        {
            operator=c;
        }
    }

    public char getOperator()
    {
        return operator;
    }

    @Override
    public String getClassName()
    {
        return "operator";
    }

    @Override
    public int getNumber() throws IllegalAccessException
    {
        throw new IllegalAccessException("Impossible to get number from operator.");
    }
}
