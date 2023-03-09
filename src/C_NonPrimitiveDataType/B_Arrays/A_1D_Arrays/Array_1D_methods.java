package C_NonPrimitiveDataType.B_Arrays.A_1D_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array_1D_methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    /* ************************************************************************************************************** */
        //Create

        //By initialization
        int[] arr1 ={1,2,3,4,5};
        System.out.println("Array from initialization :"+ Arrays.toString(arr1));

        //By User
        System.out.print("Enter size of array :");
        int n=sc.nextInt();
        int[] arr2 =new int[n];
        for(int i=0;i<n;i++){
            System.out.print("insert "+(i+1)+" element ");
            arr2[i]= sc.nextInt();
        }

    /* ************************************************************************************************************** */
        //Read

        //method-1
        System.out.println("All elements by toString "+Arrays.toString(arr2));

        //method-2
        System.out.println("All element using for loop :");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+",");
        }
        System.out.println();

        //method-3
        for(int ele :arr2){
            System.out.print(ele+",");
        }
        System.out.println();
    /* ************************************************************************************************************** */
       //Update
        System.out.println("Before updation arrays is :"+Arrays.toString(arr2));
        System.out.println("Update all element");
        for(int i=0;i<n;i++){
            System.out.print("insert "+(i+1)+" element ");
            arr2[i]= sc.nextInt();
        }
        System.out.println("After updation arrays is :"+Arrays.toString(arr2));
    /* ************************************************************************************************************** */
    //Delete

    /* ************************************************************************************************************** */
    //Search

    //method-1 -> Linear Search

        System.out.print("Enter element :");
        int x= sc.nextInt();
        boolean check=false;
        for(int ele : arr2){
            if(ele == x){
                System.out.println("Element "+x+" is present");
                check=true;
                break;
            }
        }
        if(check == false){
            System.out.println("Element not present.");
        }

    /* ************************************************************************************************************** */
    //Sorting

    //By method Arrays.sort()
        System.out.println("Before sorting array :"+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("After sorting array by Arrays.sort() :"+Arrays.toString(arr2));
    }

}
