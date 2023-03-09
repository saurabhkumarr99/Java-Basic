package K_OOPS_Programs;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        boolean check=true;
        do{
            System.out.println("****************************************************************************************");
            System.out.print("Enter first number : ");
            int num1=sc.nextInt();
            System.out.print("Enter second number : ");
            int num2=sc.nextInt();
            System.out.println("Press \n1-Addition \n2-Subtraction \n3-Multiplication \n4-Division \n5-Exit from program");
            int opt=sc.nextInt();
            float res;
            switch(opt){
                case 1:
                    res =add(num1,num2);
                    System.out.println("Addition of "+num1+" and "+num2+" is "+res);
                    break;

                case 2:
                    res =substract(num1,num2);
                    System.out.println("Subtraction of "+num1+" and "+num2+" is "+res);
                    break;

                case 3:
                    res =mul(num1,num2);
                    System.out.println("Multiplication of "+num1+" and "+num2+" is "+res);
                    break;

                case 4:
                    res =divide(num1,num2);
                    System.out.println("Division of "+num1+" and "+num2+" is "+res);
                    break;

                case 5:
                    check=false;
                    System.out.println("Thanks for using calculator.");
                    System.out.println("********************************************************************************");
                    break;

                default:
                    System.out.println("You have enter wrong options");
                    System.out.println("Thanks for using calculator.");
                    System.out.println("********************************************************************************");
            }

        }while(check);


    }

    public static float add(float num1,float num2){
        float res =num1+num2;
        return res;
    }

    public static float substract(float num1,float num2){
        float res =num1-num2;
        return res;
    }

    public static float mul(float num1,float num2){
        float res =num1*num2;
        return res;
    }

    public static float divide(float num1,float num2){
        float res =num1/num2;
        return res;
    }

}
