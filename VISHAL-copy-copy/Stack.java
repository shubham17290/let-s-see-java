// Practice program: implements a basic integer stack.
class Stack
{
int st[];
int size;
int top;

Stack(int n)
{
    size = n;
    st = new int[size];
    top = -1;
}

void push(int n)
{
    if(top == size-1)
    {
        System.out.println("OVERFLOW");
    }
    else
    {
        top = top + 1;
        st[top] = n;
    }        
}

int pop()
{
    if(top == -1)
    {
        System.out.println("UNDERFLOW");
        return -999;
    }
    else
    {
        int val = st[top];
        top = top - 1;
        return val;
    }
}

void display()
{
    if(top == -1)
    {
        System.out.println("The stack is empty");
    }
    else
    {
        System.out.println("The elements in the stack are : ");
        for(int i = top; i>=0; i--)
        {
            System.out.println(st[i]);
        }
    }
}
}
