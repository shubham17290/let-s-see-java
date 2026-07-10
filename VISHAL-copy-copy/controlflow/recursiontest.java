
// Practice program: provides a reusable recursive factorial method.
public class recursiontest
{
    
    public static long factorial (int number)
    {
        if(number<=1)
        {
            return 1;
        }
        return number * factorial(number-1);
    }

}
