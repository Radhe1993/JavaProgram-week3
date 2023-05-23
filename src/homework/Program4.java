package homework;
// Program-4 Write a method isLeapYear with a parameter of type int named year.
// The parameter needs to be greater than or equal to 1 and less than or equal

public class Program4
{

    public static  boolean leapYear(int year)
    {
        boolean result = false;

        if (year >= 1 && year <= 9999)
        {


            if ((year % 4 == 0 && year % 100 == 0) || year % 100 == 0 && year % 400 == 0) {
                result = true;
                System.out.println(result + "   " +   year + " is a leap year");

            } else {
                System.out.println(result + "   " +  year + " is not leap year");

            }
        }
        else
        {
            System.out.println(result+"   The parameter not in the range");

        }
      return result;
    }
    public static void getDaysInMonth(int month,int year) {
        int day = 0;
        String monthName="un";
        if (month < 1 || month > 12 && year < 1 || year > 9999) {
            System.out.println("-1");
        } else {
            switch (month) {
                case 1:
                    monthName = "January";
                    day = 31;
                    break;
                case 2:
                    monthName = "February";
                    if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
                    {
                        day = 29;

                    } else {
                        day = 28;

                    }
                    break;
                case 3:
                    monthName = "March";
                    day = 31;
                    break;
                case 4:
                    monthName = "April";
                    day = 30;
                    break;
                case 5:
                    monthName = "May";
                    day = 31;
                    break;
                case 6:
                    monthName = "Jun";
                    day = 30;
                    break;
                case 7:
                    monthName = "July";
                    day = 31;
                    break;
                case 8:
                    monthName = "August";
                    day = 31;
                    break;
                case 9:
                    monthName = "September";
                    day = 30;
                    break;
                case 10:
                    monthName = "October";
                    day = 31;
                    break;
                case 11:
                    monthName = "November";
                    day = 30;
                    break;
                case 12:
                    monthName = "December";
                    day = 31;
            }

            System.out.println(monthName+ "  " + year + " has " + day + " days");


        }
    }

            public static void main(String[] args)
        {

            leapYear(-1600);
            leapYear(1600);
            leapYear(2017);
            leapYear(2000);
            System.out.println("                  ");

            getDaysInMonth(1, 2020);
            getDaysInMonth(2, 2020);
            System.out.println("leap year");
            getDaysInMonth(2, 2018);
            System.out.println("not leap year");
            getDaysInMonth(-1, 2020);
            getDaysInMonth(1, -2020);

        }

    }
