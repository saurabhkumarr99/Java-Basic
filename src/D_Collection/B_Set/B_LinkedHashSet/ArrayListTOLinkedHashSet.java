package D_Collection.B_Set.B_LinkedHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayListTOLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arryList = new ArrayList<String>(
				Arrays.asList("A", "B", "C", "D", "E", "A", "B", "C", "D", "E"));
		HashSet<String> hashSet = new HashSet<>(arryList);

		System.out.println("Arraylist     : " + arryList);
		System.out.println("LinkedHashSet : " + hashSet);
	}

}
