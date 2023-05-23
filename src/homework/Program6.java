package homework;

//Program-6 Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program6
{
    int number;

    public void oddEven()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number = ");
        number = ob.nextInt();

        if(number%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args)
    {
        Program6 obj = new Program6();
        obj.oddEven();

    }
}
