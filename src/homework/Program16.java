package homework;

//Program-16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Program16
{
    int number;
    public void typeOfNumber()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("enter number = ");
        number = ob.nextInt();
        if(number>0)
        {
            System.out.println("POSITIVE");
        }
        else if (number<0)
        {
            System.out.println("NEGATIVE");
        }
        else if(number==0)
        {
            System.out.println("ZERO");
        }
        else
        {
            System.out.println("number is not valid");
        }
    }

    public static void main(String[] args)
    {
        Program16 obj = new Program16();
        obj.typeOfNumber();

    }
}
