package com.lfa.day1;

import java.util.Scanner;

public class Program{

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        System.out.println("Enter value of x:");

        int x=input.nextInt();

        System.out.println("Enter value of y:");

        int y=input.nextInt();

        System.out.printf("sum of  %d + %d = %d",x,y,(x+y));

    }
}