package com.example.daily_challenges;
import com.example.daily_challenges.Cylinder;

public class TestCylinder
{
    public static void main(String[] args)
    {
        // Start Test
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(7.0);
        Cylinder cylinder3 = new Cylinder(5.0, 7.0);
        cylinder3.SetColor("Brown");

        Circle circle1 = new Circle(1.0, "Blue");

        System.out.println(circle1);
        System.out.println("Area called from Circle with default radius and color: " + circle1.GetArea() + "\n");

        System.out.println(cylinder1);
        System.out.println("Area called from Cylinder with default radius, height and color: " + cylinder1.GetArea());
        System.out.println("Volume called from Cylinder with default radius, height and color: " + cylinder1.GetVolume() + "\n");

        System.out.println(cylinder2);
        System.out.println("Volume called from Cylinder2 with (h) + default radius and color: " + cylinder2.GetVolume() + "\n");

        System.out.println(cylinder3);
        System.out.println("Volume called from Cylinder3 with (r, h) + color: " + cylinder3.GetVolume() + "\n");
        // End Test
    }
}