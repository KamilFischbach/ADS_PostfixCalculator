public interface Token
{
    String getClassName();
    int getNumber() throws IllegalAccessException;
    char getOperator() throws IllegalAccessException;
}
