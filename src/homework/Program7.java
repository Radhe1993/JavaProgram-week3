package homework;

// Program-7 Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales

import java.util.Scanner;

public class Program7
{

        int sId,amount,basicSalary,sale;
        String name;
        double c;

        public void sales()
        {
                Scanner ob = new Scanner(System.in);
                System.out.print("Sales Name = ");
                name = ob.nextLine();
                System.out.print("Sales Id = ");
                sId = ob.nextInt();
                System.out.print("Sales amount = ");
                amount = ob.nextInt();
                System.out.print("Basic salary = ");
                basicSalary = ob.nextInt();
                System.out.print("Sales = ");
                sale = ob.nextInt();
        }
        public void commission()
        {


                if(amount>=50000)
                {
                         c=amount*0.35;
                         System.out.println("Commission = "+c);
                }
                else if (amount>=30000)
                {
                        c=amount*0.20;
                        System.out.println("Commission = "+c);
                }
                else if (amount>=20000)
                {
                        c=amount*0.10;
                        System.out.println("Commission = "+c);
                }
                else if (amount>=10000)
                {
                        c=amount*0.05;
                        System.out.println("Commission = "+c);
                }
                else if (amount<10000)
                {
                        c=amount*0.02;
                        System.out.println("Commission = "+c);
                }
                else
                {
                        System.out.println("No Commission ");
                }
        }

        public static void main(String[] args)
        {
                Program7 obj = new Program7();
                obj.sales();
                obj.commission();

        }
}
