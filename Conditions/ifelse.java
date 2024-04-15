package company.com;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=scanner.nextInt();
        if(age>=18)   //use different logical operators <= !=etc
        {
            System.out.println("You can drive");
        }
        else {
            System.out.println("You cannot Drive");
        }

    }
}
