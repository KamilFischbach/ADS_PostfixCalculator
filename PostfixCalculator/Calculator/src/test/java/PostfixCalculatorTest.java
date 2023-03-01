import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PostfixCalculatorTest
{
    private PostfixCalculator calculator;
    @BeforeEach
    void setUp()
    {
        calculator = new PostfixCalculator();
    }

    //ZOMBE is used, Boundary not relevant, Exception tested.
    @Test
    void evaluateExpressionZENull()
    {
        assertThrows(IllegalArgumentException.class, ()->calculator.evaluateExpression(null));
    }
    @Test
    void evaluateExpressionZEEmpty()
    {
        assertThrows(IllegalArgumentException.class, ()->calculator.evaluateExpression(new ArrayList<Token>()));
    }

    @Test
    void evaluateExpressionOPlus()
    {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(15));
        tokens.add(new Operand(7));
        tokens.add(new Operator('+'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(22, result);
    }

    @Test
    void evaluateExpressionOMinus()
    {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(15));
        tokens.add(new Operand(7));
        tokens.add(new Operator('-'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(8, result);
    }

    @Test
    void evaluateExpressionOMultiply()
    {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(15));
        tokens.add(new Operand(7));
        tokens.add(new Operator('*'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(105, result);
    }

    @Test
    void evaluateExpressionODivide()
    {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(15));
        tokens.add(new Operand(7));
        tokens.add(new Operator('/'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(2, result);
    }

    @Test
    void evaluateExpressionOModulo()
    {
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand(15));
        tokens.add(new Operand(7));
        tokens.add(new Operator('%'));
        int result = calculator.evaluateExpression(tokens);
        assertEquals(1, result);
    }

    @Test
    void evaluateExpressionM()
    {
        ArrayList<Token> tokens = new ArrayList<>();
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
        int result = calculator.evaluateExpression(tokens);
        assertEquals(288, result);
    }




}