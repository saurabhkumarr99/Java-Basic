package D_Collection.B_Set.B_LinkedHashSet;

import java.util.*;

public class LinkedHashSetMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> mySet1 = new LinkedHashSet<>();

        boolean check1 = true;
        do {
            System.out.println("Press 1 - Read data\nPress 2 - insert data \nPress 3 - Update Data \nPress 4- Search Data \nPress 5- Delete Data \nPress 6- Sort Data\nPress 7- For Max and Min of element \nPress 8- Exit from program");
            int option = sc.nextInt();

            switch (option) {

                case 1:

                    /* ********************************************************************************************** */
                    //Read

                    //Method 1-
                    System.out.println("All data from direct printing: " + mySet1);

                    //Method 2-
//                    System.out.println("All data using loop and get method");
//                     for(int i=0;i<mySet1.size();i++){
//                        System.out.print(mySet1.get(i));
//                    }

                    //Method 3-
                    System.out.println("All data using loop ");
                    for (int ele : mySet1) {
                        System.out.print(ele + ",");
                    }
                    System.out.println();
                    break;

                case 2:

                    /* ********************************************************************************************** */
                    //Create
                    System.out.println("Insert a number : ");
                    int x =sc.nextInt();
                    System.out.println("Before data added mySet is:"+mySet1);
                    if(mySet1.add(x)){
                        System.out.println("Data added Successfully");
                        System.out.println("After new data insertion mySet is :"+mySet1);
                    }else{
                        System.out.println("Data already exist");
                    }
                    break;

                case 3:

                    /* ********************************************************************************************** */
                    //Update
                    System.out.println("Can not update in set");
                    break;

                case 4:

                    /* ********************************************************************************************** */
                    //Search
                    System.out.print("Enter the element you want to search : ");
                    int y =sc.nextInt();
                    if(mySet1.contains(y)){
                        System.out.println(y+" is present in mySet.");
                    }else {
                        System.out.println(y+" is not present in mySet.");
                    }
                    break;

                case 5:

                    /* ********************************************************************************************** */
                    //Delete
                    System.out.print("Enter the element you want to delete : ");
                    int y1 =sc.nextInt();
                    if(mySet1.contains(y1)){
                        System.out.println("Before removing "+y1 +" m mySet : "+mySet1);
                        mySet1.remove(y1);
                        System.out.println("After removing "+y1 +" m mySet : "+mySet1);
                    }else {
                        System.out.println(y1+" is not present in mySet.");
                    }
                    break;

                case 6:

                    /* ********************************************************************************************** */
                    //Sort
                    System.out.println("Before sorting mySet is : "+mySet1);
                    System.out.println("Sorting not possible through Collection.sort() method.");
                    //Collections.sort(mySet1);
                    break;

                case 7:

                    /* ********************************************************************************************** */
                    //Max and Min
                    System.out.println("Max mySet is : "+Collections.max(mySet1));
                    System.out.println("Min mySet is : "+Collections.min(mySet1));
                    break;

                case 8 :
                    /* ********************************************************************************************** */
                    //Exit
                    check1 =false;
                    break;

                default :
                    System.out.println("You have enter wrong option");
            }

        } while (check1);
    }
}
