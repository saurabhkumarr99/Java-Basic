package L_Soloutions;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test case : ");
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            System.out.println("Enter no of elements");
            int n = sc.nextInt();
            System.out.println("Enter k :");
            int k = sc.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Enter " + (i + 1) + " element");
                int x1 = sc.nextInt();
                sum = sum + x1;
            }
            System.out.println("Sum is " + sum);

            int x2 = 0;

            int av = sum / n;
            System.out.println(av);

            if (av <= k) {
                System.out.println(x2);
            } else {
                boolean check = true;
                int count = 1;
                while (check) {
                    sum = sum + 1;
                    n = n + 1;
                   int Newav = sum / n;
                    System.out.println(Newav + "," + k+","+count);
                    if (Newav <= k) {
                        System.out.println(Newav + "," + k+","+count);
                        check = false;
                    }
                   count++;
                }

            }
        }
    }
}
