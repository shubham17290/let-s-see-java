// Practice program: finds the largest value among three integers.
class larger

{
int larger(int a , int b , int c)
{
    
int max= (a>b)?a:b;
int maxx=(max>c)?max:c;
return maxx;
}
void show()
{
System.out.println(larger(5, 69, 8));
}
}
