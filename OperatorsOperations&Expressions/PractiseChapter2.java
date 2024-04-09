package com.company;
import java.util.Scanner;

public class PractiseChapter2 {
    public static void main(String[] args) {
        //1.0
//        float a=7/4.0f*9/2.0f;
//       // float a=7/4*9/2;  this will give 4 answer thats wrong..so usenum.0f
//        System.out.println(a);

        //2.0 encrypt decrypt
//        /*Note: char+integer =integer..so typecast it*/
//        char grade='B';
//        //Encrypt
//        grade=(char)(grade+8);
//        //grade=(grade+8); not possible
//        System.out.println("Your secret grade is:");
//        System.out.println(grade);
//
//        //Decrypt
//        grade=(char)(grade-8);
//        System.out.println("Heres your encrypted grade");
//        System.out.println(grade);

        //3.0 geater than
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Number");
//        int a=scanner.nextInt();
//        //let
//        int b=8;
//        System.out.println(a>b);
//        // System.out.println(7*49/7+35/7);

        //4.0
        float v,u,a,s;


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter v,u,a,s");
        v=sc.nextFloat();
        u=sc.nextFloat();
        a=sc.nextFloat();
        s=sc.nextFloat();

        double res=((v*v -u*u))/(2*a*s);
        System.out.println("Your result is:");
        System.out.println(res);


    }
}
