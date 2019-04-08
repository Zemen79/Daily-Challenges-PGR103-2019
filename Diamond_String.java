package com.example.helloworld;
import java.util.*;

public class HelloWorld
{
    public static void main(String args[])
    {
        DimondString("SAMPLE");
        DimondString("Hello World");
        DimondString("0123456789");
    }

    public static void DimondString(String str)
    {
        // Set length to MAX 10, or the length of the given string
        int length = 0;

        if (str.length() <= 10)
            length = str.length();
        else
            length = 10;

        // first half of diamond
        for (int i = 0; i < length; i++)
        {
            // spacing
            for(int l = 0; l < length - i; l++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
            {
                System.out.print(str.charAt(j));
            }
            for (int k = i - 1; k >= 0; k--)
            {
                System.out.print(str.charAt(k));
            }

            System.out.println();
        }

        // second half of diamond
        for (int i = length - 2; i >= 0; i--) // it was easier to reverse it here than all three for loops inside this
        {
            // spacing
            for(int l = 0; l < length - i; l++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++)
            {
                System.out.print(str.charAt(j));
            }
            for (int k = i - 1; k >= 0; k--)
            {
                System.out.print(str.charAt(k));
            }

            System.out.println();
        }
    }
}

