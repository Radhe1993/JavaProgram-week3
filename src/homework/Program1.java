package homework;

//Program-1 Input number is odd or even using ternary operator (? :)

import java.util.Scanner;

public class Program1
{
    public static void odd() {
        int number;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number = ");
        number = obj.nextInt();

        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("number "+" is " +result);
    }
       public static void main(String[] args)
       {
           odd();

       }

}