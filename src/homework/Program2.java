package homework;

//Program-2 Input any year like and find out if it is leap year or not

import java.util.Scanner;

public class Program2
{
    public void leapYear()
    {
        int year;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Year = ");
        year = ob.nextInt();

        if( year % 4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not leap year");
        }
    }

    public static void main(String[] args)
    {
        Program2 obj = new Program2();
        obj.leapYear();

    }
}
