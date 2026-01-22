public class Stack
{
    int s[], top;

    Stack()
    {
        s = new int[10];
        top = -1;
    }

    void push(int x)
    {
        if(top == 9)
        {
            System.out.println("Stack OverFlow!");
        }
        else
        {
            s[++top] = x;
        }
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack UnderFlow!");
        }
        else
        {
            top--;
        }
    }

    void display()
    {
        System.out.println("Stack:");

        for(int i=top; i>=0; i--)
        {
            System.out.println(s[i]);
        }
    }

    public static void main(String[]args)
    {
        Stack s1 = new Stack();

        s1.push(1); s1.push(2); s1.push(3); s1.push(4);

        s1.display();

        s1.pop();

        s1.display();

        Stack s2 = new Stack();

        s2.push(1); s2.push(2); s2.push(3); s2.push(4);

        s2.display();

        s2.pop();

        s2.display();
    }
}
