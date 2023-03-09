package A_Introduction;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name =sc.nextLine();
        System.out.println("Hello "+name +" ,Welcome Back.");
    }
}
