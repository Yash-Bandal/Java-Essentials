package com.company;
import java.util.Scanner;

public class InputScanner_4 {
    public static void main(String[] args) {
        System.out.println("Java Class to take input from user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer");
        int a=sc.nextInt();
        System.out.println("Entered integer a="+a);

        System.out.println("Enter Float");
        float b=sc.nextFloat();
        System.out.println("Entered Float  b="+b);

//        System.out.println("Enter a");
//        int a=sc.nextInt();
//        System.out.println("Entered integer a="+a);
        System.out.println("Enter string");
        String abc=sc.nextLine();
        System.out.println(abc);
        //check if int or not
        System.out.println("Are you entering integer : CHECK");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);

    }
}
