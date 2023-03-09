package D_Collection.B_Set.B_LinkedHashSet;
import java.util.*;

public class Remove_Duplicity {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String sentence =sc.nextLine();
        System.out.println("Sentence before removing white spaces :"+sentence);
        sentence =sentence.replace(" ","");
        System.out.println("Sentence after removing white spaces :"+sentence);

        String[] allWords=sentence.split("");
        ArrayList<String> duplicate_words = new ArrayList<>();
        LinkedHashSet<String> unique_words =new LinkedHashSet<>();
        for(String s1 :allWords){
            if(unique_words.add(s1)==false){
                duplicate_words.add(s1);
            }
        }
        System.out.println("Unique words    : "+unique_words);
        System.out.println("Duplicate words : "+duplicate_words);
    }

}
