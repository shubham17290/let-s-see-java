// Practice program: demonstrates a while loop that prints positive integers.
class newf 
{
    static int a=1;
    public static void main (String agrs[])
       {
        int num=4;
        newf ob=new newf();
        ob.sum(num);
        System.out.print (a);
        }
        
        int sum(int num)
        {
            if (num>=1)
            {
                a=a*num;
                sum(num-1);
            }
          return 1;
            
    }
    }

                
                
            
            
            
