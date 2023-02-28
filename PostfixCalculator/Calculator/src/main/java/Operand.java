import java.util.ArrayList;

public class Operand implements Token
{
    private int number;

    public Operand(int newNumber)
    {
            number=newNumber;
    }
    @Override
    public String getClassName()
    {
        return "operand";
    }

    @Override
    public int getNumber() throws IllegalAccessException
    {
        return number;
    }


    @Override
    public char getOperator() throws IllegalAccessException
    {
        throw new IllegalAccessException("Impossible to get operator from number.");
    }
}
