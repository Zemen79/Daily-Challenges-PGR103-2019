package com.example.daily_challenges;

public class Circle
{
// public:
    // constructers
    public Circle(){}

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color)
    {
        this(radius);
        this.color = color;
    }

    // getters
    public double GetRadius()
    {
        return this.radius;
    }

    public String GetColor()
    {
        return this.color;
    }

    public double GetArea()
    {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // setters
    public void SetRadius(double radius)
    {
        this.radius = radius;
    }

    public void SetColor(String color)
    {
        this.color = color;
    }

    public String toString()
    {
        return "Radius = " + this.radius  + "  " + "Color = " + this.color;
    }

// private:
    private double radius = 1.0;
    private String color = "red";
}
