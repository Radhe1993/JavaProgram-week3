package homework;

//Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
// find addition, Subtraction, multiplication and division according to their symbol

import java.util.Scanner;

public class Program10


{
    int a,b,sum,sub,mul,div;
    String sym;

    public void symbol()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("a= ");
        a=ob.nextInt();
        System.out.print("b=");
        b=ob.nextInt();
        System.out.print("Enter symbol = ");
        sym= ob.next();


        if(sym.equals("+"))
        {
            sum=a+b;
            System.out.println("Addition = "+sum);
        }
        else if(sym.equals("-"))
        {
            sub=a-b;
            System.out.println("subtraction = "+sub);
        }
        else if(sym.equals("*"))
        {
            mul=a*b;
            System.out.println("multiplication = "+mul);
        }
        else if (sym.equals("/"))
        {
            div=a/b;
            System.out.println("division = "+div);
        }
        else
        {
            System.out.println("Not Accepted");
        }

    }

    public static void main(String[] args)
    {
        Program10 obj = new Program10();
        obj.symbol();
    }
}
