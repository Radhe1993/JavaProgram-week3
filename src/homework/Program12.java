package homework;

//Program-12 Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Program12
{
   static char value;

           public static void valuetypes()
           {
               Scanner ob = new Scanner(System.in);
               System.out.print("Enter value  = ");
               value = ob.next().charAt(0);

               if(value>='0' && value<='9')
               {
                   System.out.println("Value is Number ");
               }
               else if(value>='A' && value<='Z' || value>='a'&& value<='z')
               {
                   System.out.println("Value is Alphabet ");
               }
               else if(value=='+' ||value=='-' || value=='*'||value=='/' || value=='%' || value=='='||value=='@'||value=='£'||value=='$')
               {
                   System.out.println("Value is Symbol ");
               }
               else
               {
                   System.out.println("Value is not valid");
               }

           }

    public static void main(String[] args)
    {
        valuetypes();

    }

}
