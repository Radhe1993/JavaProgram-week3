package homework;

//Program-18. Write a Java program to sum values of an array.

import java.util.Scanner;

public class Program18
{
    int i,n;
    int a[] = new int[10];
    int b[] = new int[10];
    int c[] = new int[10];

    public  void sumArray()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("enter n= ");
        n = ob.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("a["+i+"]=");
            a[i] = ob.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print("b["+i+"]=");
            b[i] = ob.nextInt();
        }
        for (i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
            System.out.println("c["+i+"]="+c[i]);
        }

    }

    public static void main(String[] args)
    {
        Program18 obj = new Program18();
        obj.sumArray();

    }

}
