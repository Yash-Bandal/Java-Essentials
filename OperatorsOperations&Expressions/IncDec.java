package com.company;

public class IncDec {
    public static void main(String[] args) {
        int i=56;
        System.out.println(i++);  //56//first use i then increment
        System.out.println(i);    //57  change as i has increment last
        System.out.println(++i);  //58//first increment then use i
        System.out.println(i);    //no change as i at last has no increment

        System.out.println("\n");

        int j=56;
        System.out.println(j--);  //56
        System.out.println(j);    //55
        System.out.println(--j);  //54
        System.out.println(j);    //54

        char ch='a';
        System.out.println(ch++);
        System.out.println(ch);
        System.out.println(++ch);
        System.out.println(ch);
        System.out.println(ch--);
        System.out.println(ch);
        System.out.println(--ch);
        System.out.println(ch);

    }
}
