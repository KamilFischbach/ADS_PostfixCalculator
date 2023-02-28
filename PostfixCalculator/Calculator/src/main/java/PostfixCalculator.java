import java.util.ArrayList;

public class PostfixCalculator
{
    private StackADT stack;

    public PostfixCalculator()
    {
        stack=new StackLinkedList();
    }

    public int evaluateExpression(ArrayList<Token> tokens)
    {
        tokens.forEach(t->
        {
            if(t.getClassName().equals("operand"))
            {
                stack.push(t);
            }
            else
            {
                Token token1 = stack.pop();
                Token token2 = stack.pop();
                int num1;
                int num2;
                int result=Integer.MAX_VALUE;
                //Assuring the result is assigned to some value
                //so that it can be added to the stack
                char operator;
                try
                {
                    num1 = token1.getNumber();
                    num2 = token2.getNumber();
                    operator=t.getOperator();
                } catch (IllegalAccessException e)
                {
                    throw new RuntimeException(e);
                }

                switch(operator)
                {
                    case '+':
                    {
                        result=num2+num1;
                        break;
                    }
                    case '-':
                    {
                        result=num2-num1;
                        break;
                    }case '*':
                    {
                        result=num2*num1;
                        break;
                    }
                    case '/':
                    {
                        result=num2/num1;
                        break;
                    }
                    case '%':
                    {
                        result=num2%num1;
                        break;
                    }

                }
                stack.push(new Operand(result));
            }
        });
        int finalResult = Integer.MAX_VALUE;
        try
        {
            finalResult = stack.pop().getNumber();
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }
        return finalResult;
    }
}
