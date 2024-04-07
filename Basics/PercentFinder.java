package com.company;
import java.util.Scanner;

public class percentfinder {
    public static void main(String[] args) {
        double s1,s2,s3,s4,s5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1");
        s1=sc.nextDouble();
        System.out.println("Enter Marks of Subject 2");
        s2=sc.nextDouble();
        System.out.println("Enter Marks of Subject 3");
        s3=sc.nextDouble();
        System.out.println("Enter Marks of Subject 4");
        s4=sc.nextDouble();
        System.out.println("Enter Marks of Subject 5");
        s5=sc.nextDouble();

        double total=s1+s2+s3+s4+s5;
        double ans=(total/5);

        System.out.println("The overall percentage is "+ans+"%");

    }
}
