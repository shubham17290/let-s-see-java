// Practice program: sorts a fixed integer array in ascending order.
 class sortting
 {
     void print()
     {
         int i[]={25,19,56,3,5};
         int temp;
         
         for(int j =0;j<i.length;j++)
         
        { 
            
          for(int num=0;num<i.length-1;num++)
         {

            if(i[num]>i[num+1])
             {
                 temp=i[num];
                 i[num]=i[num+1];
                 i[num+1]=temp;
                }
            }
        }
        for(int j =0;j<i.length;j++)
        {

        System.out.print(i[j]+" ");
        }
       }
    }
    
