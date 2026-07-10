// Practice program: prints the digits of a number separated by spaces.
public class Talukder

{

public static void Kutub ( int number)

{

String rep = "" + number;

int repLength = rep.length();

if (0 < repLength)

{ System.out.print( rep.charAt( 0));

int ix;

for (ix = 1; ix < repLength; ix++)

{ System.out.print( " " + rep.charAt( ix));

}


}

System.out.println();

}}
