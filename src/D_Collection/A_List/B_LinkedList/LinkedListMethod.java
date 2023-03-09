package D_Collection.A_List.B_LinkedList;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class LinkedListMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> myList1 = new LinkedList<>();

        /* ********************************************************************************************************** */
        System.out.println("*****************************************************************************************");
        //Create

        System.out.print("Size of LinkedList :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i+1) + " name : ");
            String ele1 = sc.next();
            myList1.add(ele1);
        }

        /* ********************************************************************************************************** */
        System.out.println("*****************************************************************************************");
        //Read

        //Method-1 ->By Direct Printing
        System.out.println("Print all elements directly: " + myList1);

        //Method-2 ->By get method
        System.out.println("Print all elements by for loop i.e.; myList.get(i): ");
        for (int i = 0; i < myList1.size(); i++) {
            System.out.print(myList1.get(i)+",");
            System.out.println();
        }

        //Method-2 ->By for loop
        System.out.println("Print all elements by for loop : ");
        for (String ele :myList1) {
            System.out.print(ele+",");
            System.out.println();
        }

        /* ********************************************************************************************************** */
        System.out.println("*****************************************************************************************");
        //Update

        //Method-1 ->set()
        System.out.println("Method-1 :");
        System.out.print("Insert index and new name to update element :");
        int i= sc.nextInt();
        String name1 = sc.next();
        System.out.println("MyList1 before updation : "+myList1);
        myList1.set(i,name1);
        System.out.println("MyList1 after using set(index,element) updation : "+myList1);

        //Method-2 :
        System.out.println("Enter the name you want to update");
        String name2=sc.next();
        if(myList1.contains(name2)){
            System.out.print("Insert new name to update element :");
            String name3=sc.next();
            int ind = myList1.indexOf(name2);
            System.out.println("MyList1 before updation : "+myList1);
            myList1.set(ind,name3);
            System.out.println("MyList1 after using set(index,element) updation : "+myList1);
        }else{
            System.out.println("No such name exist.");
        }

        /* ********************************************************************************************************** */
        System.out.println("*****************************************************************************************");
        //Delete

        boolean check1 =true;
        do{
            System.out.println("To delete Press 1 else 0");
            int check2= sc.nextInt();
            if(check2 ==1){
                System.out.print("Please Enter the name : ");
                String name4=sc.next();
                if(myList1.contains(name4)){
                    System.out.println("MyList before deletion : "+myList1);
                    myList1.remove(name4);
                    System.out.println("MyList after deletion : "+myList1);
                }else{
                    System.out.println("No such name exist.");
                }
            }else{
                check1 =false;
            }
        }while(check1);

        /* ********************************************************************************************************** */
        System.out.println("*****************************************************************************************");
        //Search

        boolean check4 =true;
        do{
            System.out.println("To search Press 1 else 0");
            int check5= sc.nextInt();
            if(check5 ==1){
                System.out.print("Please Enter the name : ");
                String name5=sc.next();
                if(myList1.contains(name5)){
                    System.out.println(name5 + " is present at index number "+myList1.indexOf(name5));
                }else{
                    System.out.println("No such name exist.");
                }
            }else{
                check1 =false;
            }
        }while(check1);

        /* ********************************************************************************************************** */
        System.out.println("*****************************************************************************************");
        //Sort

        //Method1-
        System.out.println("Before Sorting myList1 : "+myList1);
        Collections.sort(myList1);
        System.out.println("After sorting myList by Collections.sort() : "+myList1);


        /* ********************************************************************************************************** */
        System.out.println("*****************************************************************************************");
        //Reverse

        //Method1-
        System.out.println("Before reversing myList1 : "+myList1);
        Collections.reverse(myList1);
        System.out.println("After reversing myList by Collections.reverse() : "+myList1);

        /* ********************************************************************************************************** */
        System.out.println("*****************************************************************************************");
        //Max and min

        //Method1-
        System.out.println("Max of list is : "+Collections.max(myList1));
        System.out.println("Min of list is : "+Collections.min(myList1));
    }
}



