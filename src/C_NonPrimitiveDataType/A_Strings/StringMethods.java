package C_NonPrimitiveDataType.A_Strings;
import java.util.*;

public class StringMethods {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //Create:
        //User Input
        System.out.print("Enter your name : ");
        String name=sc.nextLine();

        /* ********************************************************************************************************** */
        //Update:
        //method 1 : toUpperCase
        System.out.println("method 1- Name in Upper Case :"+name.toUpperCase());

        //method 2 : toLowerCase
        System.out.println("method 2- Name in Lower Case :"+name.toLowerCase());

        //method 3: .length()
        System.out.println("method 3- Total length of name :"+name.length());

        //method 4: String to string array
        String[] name_letters =name.split("");
        System.out.println("method 4- Arrays to string letter :"+ Arrays.toString(name_letters));

        //method 5: String to char array
        char[] name_chars =name.toCharArray();
        System.out.println("method 5- String to char array :"+ Arrays.toString(name_chars));

        //method 6: character array to string
        String name2 = new String(name_chars);
        System.out.println("method 6- Name from char array : "+name2);

        //method 7: replace
        String name3=name;
        System.out.println("method 7- Before replacing name is : "+name3);
        name3 =name3.replace(" ","");
        System.out.println("method 8- After replacement , name is : "+name3);

        //method 8 :
        String name4=name;
        name4 = name4.trim();
        System.out.println("method 9- After remove  leading ang trailing white spaces using trim() method ,name is : "+name4);

        /* ********************************************************************************************************** */
        //Searching
        System.out.println("Enter word or letter you want to search :");
        String wrd =sc.nextLine();
        if(name.contains(wrd)){
            System.out.println(" Word "+wrd+" is present at "+name.indexOf(wrd));
        }else {
            System.out.println("Word is not present.");
        }
    }
}
