package homework;

//Program-8 Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
// if any other alphabet should be invalid entry

import java.util.Scanner;

public class Program8
{
    char alphabet;

    public void condition()
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter alphabet = ");
        alphabet = ob.next().charAt(0);
        ob.close();
    }

        public  void city()
        {

            if (alphabet == 'A')
            {
                System.out.println("Aberdeen");
            }
            else if (alphabet == 'B')
            {
                System.out.println("Bradford");
            }
            else if (alphabet == 'C')
            {
                System.out.println("Cambridge");
            }
            else if (alphabet == 'D')
            {
                System.out.println("Durham");
            }
            else if (alphabet == 'E')
            {
                System.out.println("Ely");
            }
            else if (alphabet == 'F')
            {
                System.out.println("Fukushima");
            }
            else
            {
                System.out.println("Invalid alphabet");
            }
        }


    public static void main(String[] args)
    {
        Program8 obj = new Program8();
        obj.condition();
        obj.city();

    }
}
