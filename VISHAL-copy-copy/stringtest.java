// Practice program: demonstrates common String methods.
  class stringtest
{       
    public static void main (String args[])
    {
        String a="ankit";
        String b="Rahul";
        
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        
        System.out.println(b.concat(a));
        System.out.println(b.length());
        
        String c=" ankush  ";
        String d="";
        String e="rah";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());
        System.out.println(e.isEmpty());
        
        System.out.println( b.charAt(2));
        System.out.println( a.indexOf('i'));
        
        System.out.println(a.equals(b));
        System.out.println(b.replace('l','h'));


        
        
        

    }
}
