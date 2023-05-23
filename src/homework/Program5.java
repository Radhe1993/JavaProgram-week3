package homework;

//Program-5 WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary

import java.util.Scanner;

public class Program5
{
    int empId,bsalary;
    double HRA,DA,TA,PF,GS;
    String name;

    public void getdata() {
        Scanner ob = new Scanner(System.in);
        System.out.print("Name = ");
        name = ob.nextLine();
        System.out.print("empId = ");
        empId = ob.nextInt();
        System.out.print("bsalary = ");
        bsalary = ob.nextInt();
        HRA = bsalary * 0.10;
        DA = bsalary * 0.08;
        TA = bsalary * 0.09;
        PF = bsalary * 0.20;
        GS = bsalary + HRA + TA + DA - PF;
    }
    public void salarySlip()
    {
        System.out.println("________________________________________________________");
        System.out.println("|                   Salary Slip                        |");
        System.out.println("|______________________________________________________|");
        System.out.println("| Employee Id           :  "+empId+"                         |");
        System.out.println("| Employee Name         :  "+name+"                         |");
        System.out.println("|______________________________________________________|");
        System.out.println("| Basic Salary         :   "+bsalary+"                       |");
        System.out.println("| HRA 10%              :   "+HRA+"                       |");
        System.out.println("| TA 8%                :   "+TA+"                       |");
        System.out.println("| DA 9%                :   "+DA+"                       |");
        System.out.println("| PF - 20&             : "  +PF+ "                       " + " |");
        System.out.println("|______________________________________________________|");
        System.out.println("Gross Salary           : "  +GS+                       "|");
        System.out.println("|=======================================================|");

    }

    public static void main(String[] args)
    {
        Program5 obj = new Program5();
        obj.getdata();
        obj.salarySlip();

    }

}
