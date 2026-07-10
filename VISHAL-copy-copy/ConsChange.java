
// Practice program: shifts consonants before vowels and capitalizes consonants.
 import java.util.*;
 public class ConsChange
  {
    // instance variables 
    String word;
    int len;
   
     public ConsChange()
    {
        word="";
        len=0;
    }

     void readword()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter word");
        word=ob.next().toLowerCase();
        len=word.length();
    }
    
    void shifticons()
    {
        String s=""; char c;
        for(int i=0 ;i<len;i++)
        {
            c=word.charAt(i);
            if(c!='a' && c!='i' && c!='e' && c!='o' &&c!='u' )  
            s=s+c;
            
        }
        
           for(int i=0 ;i<len;i++)
           {
            c=word.charAt(i);
            if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u' )  
            s=s+c;
          }
           word=s;
           System.out.println("SHIFTED WORD = "+s);
        
      }
      
      void changeword()
      {
           String s=""; char c;
        for(int i=0 ;i<len;i++)
        {
            c=word.charAt(i);
            if(c!='a' && c!='i' && c!='e' && c!='o' &&c!='u' )  
                s=s+Character.toUpperCase(c);
            else
                s=s+c;
        }
        word=s;
        System.out.println("CHANGE WORD = "+s);
          
        }
            
     void show()
      {
            System.out.println("original word = "+word);
            shifticons();
            changeword();
       }
       
            public static void main (String args[])
            {
                ConsChange obj= new ConsChange();
                obj.readword();
                obj.show();
     }
  }  
    
     
        
 
