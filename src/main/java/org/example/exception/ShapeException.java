package org.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class ShapeException
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    int length;
    int breadth;
    int height;
    int radius;
    int side1;
    int side2;
    int base;
    ShapeException(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    ShapeException(int breadth,int height,int side1,int side2,int base)
    {
        this.breadth=breadth;
        this.height=height;
        this.side1=side1;
        this.side2=side2;
        this.base=base;
    }
    ShapeException(int radius)
    {
        this.radius=radius;
    }
    public int rectarea()
    {
        int result1;
        result1=this.length*this.breadth;
        return result1;

    }public float triarea()
{
    float result;
    result=(float)(this.breadth*this.height)/2;
    return result;
}
    public double cirarea()
    {
        double result;
        result=Math.PI*this.radius*this.radius;
        return result;
    }
    public int rectperimeter()
    {
        int result;
        result=2*(this.length+this.breadth);
        return result;
    }
    public int triperimeter()
    {
        int result;
        result=this.side1+this.side2+this.base;
        return result;
    }
    public  double circumference()
    {
        double result;
        result=2*(Math.PI)*this.radius;
        return result;
    }
    public static void execute()
    {
        int choice;
        int length;
        int breadth;
        int height;
        int radius;
        int side1;
        int side2;
        int base;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            try {
                LOGGER.log(Level.INFO, "\n1)Rectangle\n2)Triangle\n3)circle\n4)exit");
                LOGGER.log(Level.INFO, "Enter your choice: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    LOGGER.log(Level.INFO, "Enter the length: ");
                    length = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the breadth: ");
                    breadth = sc.nextInt();
                    ShapeException shape = new ShapeException(length, breadth);
                    LOGGER.log(Level.INFO, Integer.toString(shape.rectarea()), "Area of the Rectangle: " + shape.rectarea());
                    LOGGER.log(Level.INFO, Integer.toString(shape.rectperimeter()), "perimeter of the Rectangle: " + shape.rectperimeter());
                } else if (choice == 2) {
                    LOGGER.log(Level.INFO, "Enter the breadth: ");
                    breadth = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the height: ");
                    height = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the side1: ");
                    side1 = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the side2: ");
                    side2 = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the base: ");
                    base = sc.nextInt();
                    ShapeException shape = new ShapeException(breadth, height, side1, side2, base);
                    LOGGER.log(Level.INFO, Float.toString(shape.triarea()), "Area of the Triangle: " + shape.triarea());
                    LOGGER.log(Level.INFO, Integer.toString(shape.triperimeter()), "perimeter of the Triangle: " + shape.triperimeter());
                } else if (choice == 3) {
                    LOGGER.log(Level.INFO, "Enter the radius: ");
                    radius = sc.nextInt();
                    ShapeException shape = new ShapeException(radius);
                    LOGGER.log(Level.INFO, Double.toString(shape.cirarea()), "Area of the Circle: " + shape.cirarea());
                    LOGGER.log(Level.INFO, Double.toString(shape.circumference()), "Circumference of the Circle: " + shape.circumference());
                } else if (choice == 4) {
                    break;
                }
            }
            catch(InputMismatchException ex)
            {
                throw new InputMismatchException("please Enter the valid input");
            }
        }
    }
}
