package L_Soloutions;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of line of diamond you want : ");
        int l=sc.nextInt();
        l=(l+1)/2;

        for(int i=1;i<=l;i++){
            for(int j=1;j<=l-i;j++){
                System.out.print(" ");
            }
            for(int k=1 ;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=l-1;i>=1;i--){
            for(int j=1;j<=l-i;j++){
                System.out.print(" ");
            }
            for(int k=1 ;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
