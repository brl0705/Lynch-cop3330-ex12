package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("What is the principal?");
        int p = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the rate of interest?");
        float r = input2.nextFloat();

        Scanner input3 = new Scanner(System.in);
        System.out.println("How many years?");
        int t = input3.nextInt();


        float r1=r/100;
        float x=1+r1*t;
        float a=x*p;

        System.out.println("After "+ t + " years at " + r + "%, the investment will be worth $" + a);
    }
}
