package com.company;
import java.util.Scanner;
public class PractiseSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Problem 1
        String cap="CAPITAL";
        String small=cap.toLowerCase();
        System.out.println(small);

        //Problem 2=replace spaace with underscore
        //note string is immutable..but when we create a new var that modifies prev strings its allowd
        String space="This is 6 in morning";
        space=space.replace(" ","_");
        System.out.println(space);

        //Problem 3
        String letter="Dear <|name|> ,Thanks a Lot";
        //letter.replace("<|name|>","Lala"); //only this not works..create a new var or use same var as new var
        letter=letter.replace("<|name|>","Lala");  //like this
        System.out.println(letter);

        //Problem 4=Detect double and triple spaces
        String myString="This  string has double and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));


        //Problem 5=Format string using esccape sequence
        String escLetter="Jai Shri Ram !\n\t Jai Hanuman ! \n\t Jai BajrangBali !";
        System.out.println(escLetter);

    }
}
