// Practice program: calculates sums of even and odd numbers from 1 to 50.
class test
{
    void print()
    {
        int i,evensum=0,oddsum=0;
        for(i=1;i<=50;i++)
        if(i%2==0)
        evensum=evensum+i;
       else
       oddsum=oddsum+i;
       System.out.println("even sum ="+evensum);
          System.out.println("odd sum ="+oddsum);
    }
    
}
