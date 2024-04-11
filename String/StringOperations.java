package com.company;

public class StringOperations {
    public static void main(String[] args) {
        String name = "Yash";

        //1
        int value=name.length();
        System.out.println(value);

        //2
     //   String str=new String(); no need of this to declae string
        String lstr=name.toLowerCase();
        System.out.println(lstr);

        //3
        String ustr=name.toUpperCase();
        System.out.println(ustr);

        //4
        String Slogan="    Jai Shri Ram    ";
        System.out.println(Slogan);
        String trimmedSlogan=Slogan.trim();
        System.out.println(trimmedSlogan);

        //5
        System.out.println(name.substring(1));  //beginindex is autotyped

        //6
        System.out.println(name.substring(0,2));

        //7
        System.out.println(name.replace('h', 's'));

        //name is not affected after this..
       // System.out.println(name);
        System.out.println(name.replace("s", "sss"));

        //8
        System.out.println(name.startsWith("Ya"));

        //9
        System.out.println(name.endsWith("dd"));

        //10
        System.out.println(name.charAt(3));

        //11
        ///////////////////////01234567
        String modifiedName = "YashYash";
        ///////////////////////76543210  //not this

        //12
        System.out.println(modifiedName.indexOf("h"));  //return first occurance only not further
        System.out.println(modifiedName.indexOf("Y", 4));
        System.out.println(modifiedName.indexOf("asdfsa", 4));  //-1 return false

        //13
        System.out.println(modifiedName.lastIndexOf("Ya", 7));

        //14
        System.out.println(name.equals("yash"));

        //15
        System.out.println(name.equalsIgnoreCase("yASH"));

        //Space giving
        System.out.println("I am escape sequence\tdouble quote");
        System.out.println("I am escape sequence to add  double qoute\"double quote");// to add double quote in between " "
        System.out.println("I am escape sequence to add  Slash \\double quote");// to add \ in between " "
      //  System.out.println("I am escape sequence to add  Slash \/double quote");// to add /  not possoble



















        // System.out.println(name);
      //  int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

//        String nonTrimmedString = "     Harry     ";
//        System.out.println(nonTrimmedString);
//
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));

        //System.out.println(name.replace('r', 'p'));
        //System.out.println(name.replace("r", "ier"));

        //System.out.println(name.startsWith("Har"));
        //System.out.println(name.endsWith("dd"));

        //System.out.println(name.charAt(4));

        //String modifiedName = "Harryrryrry";
        //System.out.println(modifiedName.indexOf("rry"));
        //System.out.println(modifiedName.indexOf("rry", 4));
        //System.out.println(modifiedName.lastIndexOf("rry", 7));

//        //System.out.println(name.equals("Harry"));
//        System.out.println(name.equalsIgnoreCase("HarRY"));
//
//        System.out.println("I am escape sequence\tdouble quote");




    }
}
