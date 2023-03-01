import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TokenTest
{
    private Token operator;
    private Token operand;
    @BeforeEach
    void setUp()
    {
        operator = new Operator('+');
        operand = new Operand(6);
    }

    @Test
    void constructorOperator()
    {
        operator=null;
        operator = new Operator('-');
        assertNotNull(operator);
    }
    @Test
    void constructorOperatorException()
    {
        operator=null;
        assertThrows(IllegalArgumentException.class,()->operator = new Operator('x'));
    }

    @Test
    void constructorOperand()
    {
        operand=null;
        operand = new Operand(5);
        assertNotNull(operand);
    }


    @Test
    void getClassNameOperator()
    {
        assertDoesNotThrow(()->operator.getClassName());
    }

    @Test
    void getClassNameOperand()
    {
        assertDoesNotThrow(()->operand.getClassName());
    }

    @Test
    void getNumberOperatorException()
    {
        assertThrows(IllegalAccessException.class, ()->operator.getNumber());
    }

    @Test
    void getNumberOperand()
    {
        assertDoesNotThrow(()->operand.getNumber());
    }

    @Test
    void getOperator()
    {
        assertDoesNotThrow(()->operator.getOperator());
    }

    @Test
    void getOperatorException()
    {
        assertThrows(IllegalAccessException.class, ()->operand.getOperator());

    }
}