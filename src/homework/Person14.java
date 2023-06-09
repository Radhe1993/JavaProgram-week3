package homework;

//Program-14 fullName= teen= false fullName= John teen= true
// fullName= John Smith NOTE: All methods should be defined as public NOT public static. NOTE: In total, you have t
//Program-14 Write a class with the name Person. The class needs three fields (instance variables)
// with the names firstName, lastName of type String and age of type int.

public class Person14
{

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public void setAge(int age)
    {
        if (age > 0 && age <= 100)
        {
            this.age = age;
        }else
        {
            this.age = 0;
        }
    }

    public boolean isTeen ()
    {
        if (age > 12 && age < 20)
        {
            return true;
        }
        return false;
    }

    public String getFullName ()
    {
        if (firstName.isEmpty())
        {
            return lastName;
        }
        if (lastName.isEmpty())
        {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty())
        {
            return " ";
        }
        else
        {
            return firstName + " " + lastName;
        }
    }


    public static void main(String[] args)
    {
        Person14 person = new Person14();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname = "+person.getFullName());
        System.out.println("teen = "+person.isTeen());
        person.setFirstName("Johan");
        person.setAge(18);
        System.out.println("fullname = "+person.getFullName());
        System.out.println("teen="+person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullname = "+person.getFullName());
    }





}
