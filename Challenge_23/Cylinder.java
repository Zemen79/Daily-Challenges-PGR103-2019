package com.example.daily_challenges;
import com.example.daily_challenges.Cylinder;

public class Cylinder extends Circle
{
// public:
    // constructors
    public Cylinder(){}

    public Cylinder(double height)
    {
        this.height = height;
    }

    public Cylinder(double radius, double height)
    {
        this(height);
        SetRadius(radius);
    }

    public Cylinder(double radius, double height, String color)
    {
        this(radius, height);
        SetColor(color);
    }

    // getters
    public double GetHeight()
    {
        return this.height;
    }

    @Override
    public double GetArea()
    {
        return (2 * Math.PI * GetRadius() * this.height) +
               (2 * super.GetArea());
    }

    public double GetVolume()
    {
        return super.GetArea() * this.height;
    }

    // setters
    public void SetHeight(double height)
    {
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Radius = " + GetRadius() + " height = " + this.height + "  " + " Color = " + GetColor();
    }

    // private:
    private double height = 1.0;
}
