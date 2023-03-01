import org.junit.jupiter.api.*;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;


class StackADTTest
{
    private StackADT stack;

    @BeforeEach
    void setUp()
    {
        stack = new StackLinkedList();
    }

    //pop() tested using ZOMBE - when stack is empty, popping one element, popping multiple elements
    //Exception already tested, boundary doesn't apply.
    @Test
    void popZ()
    {
        assertThrows(EmptyStackException.class, ()->stack.pop());
    }
    @Test
    void popO()
    {
        stack.push(new Operand(5));
        int num1 =0;

        try
        {
            num1 = stack.pop().getNumber();
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }

        assertEquals(5, num1);

    }
    @Test
    void popM()
    {
        stack.push(new Operand(5));
        stack.push(new Operand(6));
        int num1 =0;
        int num2 =0;
        try
        {
            num1 = stack.pop().getNumber();
            num2 = stack.pop().getNumber();
        } catch (IllegalAccessException e)
        {
            throw new RuntimeException(e);
        }

        assertEquals(5, num2);
        assertEquals(6, num1);
    }


    //push tested with ZOMBE, boundary doesn't apply, exception already tested.
    @Test
    void pushZ()
    {
        Token token = null;
        assertThrows(IllegalArgumentException.class, ()->stack.push(token));
    }

    @Test
    void pushO()
    {
        Token token = new Operand(5);
        assertDoesNotThrow(()->stack.push(token));
    }

    @Test
    void pushM()
    {
        Token token = new Operand(5);
        assertDoesNotThrow(()->stack.push(token));
        assertDoesNotThrow(()->stack.push(token));
    }

}