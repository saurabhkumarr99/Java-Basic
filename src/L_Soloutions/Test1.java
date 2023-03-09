package L_Soloutions;

import java.util.*;

public class Test1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Total test case");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            System.out.println("Size of array ");
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                System.out.println("Enter "+(j+1)+" element");
                int x1=sc.nextInt();
               sum = sum + x1;
            }

            int x=0;
            int av = sum / n;

            if (av <= k) {
                System.out.println(x);
            } else {
                boolean check = true;
                do {
                    x = 1;
                    av = (sum + x) / (n + 1);
                    if (av <= k) {
                        System.out.println(x);
                        check = false;
                    }
                    x++;
                } while (check);
            }
        }


    }
}


