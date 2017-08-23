package edu.berliner.fizzbuzzwithsplash.models;

import java.util.ArrayList;

public class Fizzbuzz
{

    private ArrayList<String> fizzArray = new ArrayList<String>();

    public ArrayList fizzBuzzCopyCat(int goal)
    {
        for(int counter=1; counter<=goal; counter++)
        {
            String textToAdd="";

            if(counter%3==0) //number is divisible by 3
            {
                //textToAdd.concat("Fizz");
                textToAdd +="Fizz";
            }
            if(counter%5==0) //number is divisible by 5
            {
                textToAdd +="Buzz";
            }
            if(counter%2==0) //number is divisible by 2
            {
                textToAdd +="Copy";
            }
            if(counter%10==0) //number is divisible by 10
            {
                textToAdd +="Cat";
            }
            if(textToAdd.isEmpty())
            {
                textToAdd +=Integer.toString(counter);  //better practice
            }
            fizzArray.add(textToAdd);
        }
        return fizzArray;
    }
}
