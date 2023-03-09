package L_Soloutions;
import java.util.ArrayList;
import java.util.Scanner;

public class inverse_word_matrix {
    public  static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of words :");
        int n =sc.nextInt();
        int max_word=0;
        String[] words =new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
            if(words[i].length()>max_word){
                max_word=words[i].length();
            }
        }

        ArrayList<ArrayList<String>> words2=new ArrayList<>();
        for(String word :words){
            ArrayList<String> wd1 =new ArrayList<>();
            String[] wd2 =word.split("");
            for(String w:wd2){
                wd1.add(w);
            }
            for(int i=wd1.size();i<max_word;i++){
                wd1.add(" ");
            }
            words2.add(wd1);
        }

        for(int i=0;i<max_word;i++){
            for(ArrayList<String> wd3 :words2){
                System.out.print(wd3.get(i));
            }
            System.out.println();
        }
    }
}
