import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        PostfixCalculator calculator = new PostfixCalculator();
        ArrayList<Token> tokens = new ArrayList<>();
        //Operators available: + - * / %
        //Operands as integers

        //6 5 2 3 + 8 ∗ + 3 + ∗
        expressionNo1(calculator, tokens);

        tokens.clear();
        //3 4 * 2 5 * +
        expressionNo2(calculator, tokens);

        tokens.clear();
        //2 9 * 8 + 25 5 / - 2 -
        expressionNo3(calculator, tokens);

        tokens.clear();
        // 15 7 % 4 3 % +
        expressionNo4(calculator, tokens);
    }

    private static void expressionNo4(PostfixCalculator calculator, ArrayList<Token> tokens)
    {
        tokens.add(new Operand(15));
        tokens.add(new Operand(7));
        tokens.add(new Operator('%'));
        tokens.add(new Operand(4));
        tokens.add(new Operand(3));
        tokens.add(new Operator('%'));
        tokens.add(new Operator('+'));
        System.out.println(calculator.evaluateExpression(tokens)+" =\t 15 7 % 4 3 % +");
    }

    private static void expressionNo3(PostfixCalculator calculator, ArrayList<Token> tokens)
    {
        tokens.add(new Operand(2));
        tokens.add(new Operand(9));
        tokens.add(new Operator('*'));
        tokens.add(new Operand(8));
        tokens.add(new Operator('+'));
        tokens.add(new Operand(25));
        tokens.add(new Operand(5));
        tokens.add(new Operator('/'));
        tokens.add(new Operator('-'));
        tokens.add(new Operand(2));
        tokens.add(new Operator('-'));
        System.out.println(calculator.evaluateExpression(tokens)+" =\t 2 9 * 8 + 25 5 / - 2 -");
    }

    private static void expressionNo2(PostfixCalculator calculator, ArrayList<Token> tokens)
    {
        tokens.add(new Operand(3));
        tokens.add(new Operand(4));
        tokens.add(new Operator('*'));
        tokens.add(new Operand(2));
        tokens.add(new Operand(5));
        tokens.add(new Operator('*'));
        tokens.add(new Operator('+'));
        System.out.println(calculator.evaluateExpression(tokens)+" =\t 3 4 * 2 5 * +");
    }

    private static void expressionNo1(PostfixCalculator calculator, ArrayList<Token> tokens)
    {
        tokens.add(new Operand(6));
        tokens.add(new Operand(5));
        tokens.add(new Operand(2));
        tokens.add(new Operand(3));
        tokens.add(new Operator('+'));
        tokens.add(new Operand(8));
        tokens.add(new Operator('*'));
        tokens.add(new Operator('+'));
        tokens.add(new Operand(3));
        tokens.add(new Operator('+'));
        tokens.add(new Operator('*'));
        System.out.println(calculator.evaluateExpression(tokens)+" =\t 6 5 2 3 + 8 ∗ + 3 + *");
    }
}
