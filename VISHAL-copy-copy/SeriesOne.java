// Practice program: calculates a numeric series using powers and factorials.
import java.util.*;
class SeriesOne
    {
         int x,n;
         double sum;
           
            SeriesOne(int xx, int nn)
            {
                x=xx;
                n=nn;
            }
          
        double findfact(int m)
        {
            int fact=1;
            for(int i=1;i <=m; i++)
            fact=fact*i;
            return fact;
        }
        
        double findpower(int x, int y)
        {
          double res;
           res= Math.pow(x,y);
           return res;
        }
         void cal()
         {
          
             double term=0;
             for(int i=2; i <=n; i=i+2)
             {
                // Add x^i / (i - 1)! for every even value of i.
                term= findpower(x,i) / findfact( i-1);
                sum+=term;
            }
         }
        void display()
        {
            System.out.println("Sum of the series:"+sum);
        }
        public static void main(String[] args){
            SeriesOne  so =  new SeriesOne(2, 10);
          
            so.cal();
            so.display();
          
        }
    }
