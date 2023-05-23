package homework;

//Program-9 Same as above program-8 using switch statement.

import java.util.Scanner;

public class Program9
{
    char alphabet;


    public void condition()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("alphabet = ");
        alphabet = ob.next().charAt(0);

         switch(alphabet)
         {
             case 'A':
                 System.out.println("Aberdeen");
                 break;
             case 'B':
                 System.out.println("Bradford");
                 break;
             case 'C':
                 System.out.println("Cambridge");
                 break;
             case 'D':
                 System.out.println("Durham");
                 break;
             case 'E':
                 System.out.println("Ely");
                 break;
             case 'F':
                 System.out.println("Fukushima");
                 break;
             default:
                 System.out.println("invalid alphabet");
         }

    }

    public static void main(String[] args)
    {
        Program9 obj = new Program9();
        obj.condition();
    }

}
