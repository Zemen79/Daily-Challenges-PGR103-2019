package com.example.helloworld;
import java.util.*;

public class HelloWorld
{
    public static void main(String args[])
    {
        System.out.println(ReplaceWith("is This is a test is.", "is", "is not"));
        System.out.println(ReplaceWith("Hello, World.", "Hello", "Goodbye"));
    }

    public static String ReplaceWith(String text, String word, String replacement)
    {
        String newText = "";
        String tmp = "";
        int pos = 0; // this will set the position each time we find the word, so we know from where to subString from the original text

        // word should be searched from 0 to text's length minus the word's length,
        // so we don't go out of range
        for(int i = 0; i < text.length() - word.length(); i++)
        {
            // store a temporary word
            tmp = text.substring(i, i + word.length());

            // check if the above is equal to the word being searched
            if (tmp.equals(word))
            {
                // if we are at the start of the string, we should only check letters past the word
                if(i == 0)
                {
                    // Check if the word to be replaced is not part of another word
                    if(!Character.isLetter(text.charAt((i + word.length()))))
                    {
                        newText = replacement;
                        pos = word.length() + i;
                    }
                }
                else // check both front and back of word
                {
                    // Check if the word to be replaced is not part of another word
                    if (!Character.isLetter(text.charAt((i) - 1)) && !Character.isLetter(text.charAt((i + word.length()))))
                    {
                        newText += text.substring(pos, i) + replacement;
                        pos = word.length() + i;
                    }
                }
            }
        }

        // push back the rest of the string from text
        newText += text.substring(pos);

        return newText;
    }
}
