package homework;

// Program-15 Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.

public class ProgramWall15
{
    double w,h;
    public ProgramWall15()
    {
        System.out.println("Hello java");
    }
    public ProgramWall15(double w,double h )
    {
        if(w<0 && h>0)
        {
           this.w = 0.0;
           this.h = h;
        }
        else if (w>0 && h<0)
        {
            this.w = w;
            this.h = 0.0;
        }
        else if (w<0 && h<0)
        {
            this.w = 0.0;
            this.h = 0.0;
        }
        else
        {
            this.w = w;
            this.h = h;
        }
    }
    public double getWidth()
    {
        return w;
    }
    public double getHeight()
    {
        return h;
    }
    public void setWidth(double w)
    {
        if (w < 0)
        {
            this.w = 0;
        }
        else
        {
            this.w = w;
        }
    }

        public void setHeight ( double h)
        {
            if (h < 0)
            {
                this.h = 0;
            }
            else
            {
                this.h = h;
            }
        }
        public double getArea()
        {
            return getWidth() * getHeight();
        }

    public static void main(String[] args)
    {
        ProgramWall15 wall = new ProgramWall15(5,4);
        System.out.println("are = "+wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = "+wall.getWidth());
        System.out.println("height = "+wall.getHeight());
        System.out.println("area = "+wall.getArea());

    }
    }

