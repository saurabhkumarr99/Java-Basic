package B_PrimitiveDataTypes;

public class AllCharcters {
    public static void main(String[] args){
        System.out.println("ASCII value of all Characters are :");
        for(char ch='A';ch<='Z';ch++){
            int i=ch;
            System.out.println(ch +" : "+i);
        }
        for(char ch='a';ch<='z';ch++){
            int i=ch;
            System.out.println(ch +" : "+i);
        }
    }
}
