package L_Soloutions;
import java.util.Scanner;
import java.util.TreeMap;

public class Check_Characters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string of alphhanumeric keys");
        String Sentence =sc.nextLine();
        System.out.println("Sentence is :"+Sentence);
        System.out.println("Total length of sentence is : "+Sentence.length());
        Sentence=Sentence.replace(" ","");
        System.out.println("After removing white spaces ,Sentence is "+Sentence+" ,and length is :"+Sentence.length());

        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        TreeMap<Character,Integer> map1=new TreeMap<>();
        TreeMap<Character,Integer> map2=new TreeMap<>();
        TreeMap<Character,Integer> map3=new TreeMap<>();
        TreeMap<Character,Integer> map4=new TreeMap<>();

        for(int i=0;i<Sentence.length();i++){

            char ch=Sentence.charAt((i));

            //Alphabet by isAlphabetic method
            if(Character.isAlphabetic(ch)){
                char key=ch;
                int value=1;
               if(map1.containsKey(ch)){
                   value=map1.get(ch);
                   value++;
                   map1.put(key,value);
               }else{
                   map1.put(key,value);
               }
            }

            //Digit by isDigit method
            if(Character.isDigit(ch)){
                char key=ch;
                int value=1;
                if(map2.containsKey(ch)){
                    value=map2.get(ch);
                    value++;
                    map2.put(key,value);
                }else{
                    map2.put(key,value);
                }
            }

            //Alphabet without isAlphabetic method
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                char key=ch;
                int value=1;
                if(map3.containsKey(ch)){
                    value=map3.get(ch);
                    value++;
                    map3.put(key,value);
                }else{
                    map3.put(key,value);
                }
            }

            //Digit without isDigit method
            if(ch>='0'&&ch<='9'){
                char key=ch;
                int value=1;
                if(map4.containsKey(ch)){
                    value=map4.get(ch);
                    value++;
                    map4.put(key,value);
                }else{
                    map4.put(key,value);
                }
            }

        }

        System.out.println("All Alphabets by method      :"+map1);
        for(char ch2 :map1.keySet()){
            count1=count1+map1.get(ch2);
        }
        System.out.println("All Alphabets without method :"+map3);
        for(char ch2 :map3.keySet()){
            count3=count3+map3.get(ch2);
        }
        System.out.println("Total Alphabets by method are      : "+count1);
        System.out.println("Total Alphabets without method are : "+count3);


        System.out.println("All Digits by method      :"+map2);
        for(char ch2 :map2.keySet()){
            count2=count2+map2.get(ch2);
        }
        System.out.println("All Digits without method :"+map4);
        for(char ch2 :map4.keySet()){
            count4=count4+map4.get(ch2);
        }
        System.out.println("Total Alphabets by method are      : "+count2);
        System.out.println("Total Alphabets without method are : "+count4);
    }
}
