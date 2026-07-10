// Practice program: demonstrates a recursive factorial helper.
class testkr
{
  void display ()
 {
     testkr sc= new testkr();
     int fact =1;
     fact = sc.factorial(5);
     
    }
 int factorial(int x)
    {
        if(x==0)
        return 1;
        else
        return x*factorial(x-1);
    }
  }
