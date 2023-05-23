package homework;

//Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately

public class Program11
{
        int i,j,k;

        public void numbers()
        {
            System.out.println("Divided by/3 : numbers");

            for(i=1;i<100;i++)
            {
                if(i%3==0)
                {
                    System.out.print(i +", ");
                }

            }
            System.out.println("\n");
            System.out.println("Divided by/5 : numbers");
           for(j=1;j<100;j++)
           {
               if(j%5==0)
               {
                   System.out.print(j+", ");
               }
           }
            System.out.println("\n");
            System.out.println("Divided by /3 or /5 : numbers ");
            for(k=1;k<100;k++)
            {
                if(k%3==0 && k%5==0)
                {
                    System.out.print( k +", ");
                }
            }

        }

    public static void main(String[] args)
    {
        Program11 obj = new Program11();
        obj.numbers();

    }
}
