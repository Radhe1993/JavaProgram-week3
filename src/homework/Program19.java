package homework;

//Program-19. Write a Java program to calculate the average value of array elements

import java.util.Scanner;

public class Program19
{
        int i,n,sum,avg;
        int a[] = new int[10];

        public  void avgArray()
        {
            Scanner ob = new Scanner(System.in);
            System.out.print("enter n= ");
            n = ob.nextInt();
            for (i = 0; i < n; i++)
            {
                System.out.print("a[" + i + "]=");
                a[i] = ob.nextInt();
            }
            for (i = 0; i < n; i++)
            {
                sum += a[i];
                avg = sum / n;

            }
            System.out.println("average= " + avg);
        }

    public static void main(String[] args)
    {
        Program19 obj = new Program19();
        obj.avgArray();
    }


}
