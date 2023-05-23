package homework;

//Program-3 Student Mark Sheet

import java.util.Scanner;

public class Program3
{
    int rno, math, science, english,total,per,gd;
    String name;
    String result;

    public void getdata()
    {

        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Student name = ");
        name = ob.nextLine();
        System.out.print("Roll no =");
        rno = ob.nextInt();
        System.out.print("math = ");
        math = ob.nextInt();
        System.out.print("science = ");
        science = ob.nextInt();
        System.out.print("english = ");
        english = ob.nextInt();
    }

    public void putdata() {
        System.out.println("________________________________________");
        System.out.println("|                                      |");
        System.out.println("|               Mark Sheet             |");
        System.out.println("|______________________________________|");
        System.out.println("|      Name            :      "+name+ "      |");
        System.out.println("|      Roll No         :      "+rno+"        |");
        System.out.println("|______________________________________|");
        System.out.println("|      Subject         :     Marks     |");
        System.out.println("|______________________________________|");
        System.out.println("|      Math            :       "+math+"      |");
        System.out.println("|      Science         :       "+ science+"      |");
        System.out.println("|      English         :       "+ english+"      |");
        System.out.println("|______________________________________|");


    }
    public void totals()
    {
        total = math + science + english;
              System.out.println("|      Total            :      "+total+"     |");
              System.out.println("|______________________________________|");
        per = total /3;
        System.out.println("|      Percentage       :    "+per+   "        |");

        if (per>=35)
        {
            System.out.println("|     Result           :   Pass        |");

        }
        else
        {
            System.out.println("|     Result           :   Fail        |");
        }

    }

    public void Grade()
    {
        if(per>=80)
        {
            System.out.println("|      Grade            :    A+        |");
        }
        else if(per>=60)
        {
            System.out.println("|      Grade           :     A         |");
        }
        else if(per>=50)
        {
            System.out.println("|      Grade           :     B         |");
        }
        else if (per>=35)
        {
            System.out.println("|      Grade           :     C         |");
        }
            System.out.println("|______________________________________|");

    }

    public static void main(String[] args)
    {
        Program3 obj = new Program3();
        obj.getdata();
        obj.putdata();
        obj.totals();
        obj.Grade();

    }

}
