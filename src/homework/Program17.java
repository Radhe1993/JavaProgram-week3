package homework;

//Program-17. Write a Java program to sort a numeric array and a string array

import java.util.Arrays;

public class Program17
{

    public  void array()
        {

            int[] number = {
                    1789, 2035, 1899, 1456, 2013,
                    1458, 2458, 1254, 1472, 2365,
                    1456, 2165, 1457, 2456};

            String[] str = {"Java","c","c++","Python","c#"};

            System.out.println("numeric = "+Arrays.toString(number));
            System.out.println("string = "+Arrays.toString(str));
        }

    public static void main(String[] args)
    {
        Program17 ob = new Program17();
        ob.array();

    }
    }


