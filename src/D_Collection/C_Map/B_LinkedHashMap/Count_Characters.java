package D_Collection.C_Map.B_LinkedHashMap;

import java.util.*;

public class Count_Characters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<Integer, Integer> myMap1 = new LinkedHashMap<>();

		boolean check1 = true;
		do {
			System.out.println(
					"Press 1- Read data\nPress 2- insert data \nPress 3- Update Data \nPress 4- Search Key\nPress 5- Search Value \nPress 6- Delete Data \nPress 7- For max and min key \nPress 8- For max and min value\nPress 9- Sort Data\nPress 10- Exit from program");
			int option = sc.nextInt();

			switch (option) {

			case 1:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Read

				// Method 1-
				System.out.println("All data from direct printing: " + myMap1);

				// Method 2-
				System.out.println("All data using loop ang get method");
				for (int key : myMap1.keySet()) {
					System.out.println("Key- " + key + " ,Value- " + myMap1.get(key));
				}
				break;

			case 2:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Create
				System.out.println("Insert a number : ");
				int key = sc.nextInt();
				int value = 1;
				System.out.println("Before data added myMpa1 is:" + myMap1);
				if (myMap1.containsKey(key)) {
					value = myMap1.get(key) + 1;
					myMap1.put(key, value);
					System.out.println("Data already exist ,myMap1 is updated :" + myMap1);
				} else {
					myMap1.put(key, value);
					System.out.println("New Data added successfully .");
				}
				break;

			case 3:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Update
				System.out.println("Insert the key : ");
				int key2 = sc.nextInt();
				System.out.println("Before data added myMpa1 is:" + myMap1);
				if (myMap1.containsKey(key2)) {
					System.out.println("Insert Updated value : ");
					int value2 = sc.nextInt();
					myMap1.put(key2, value2);
					System.out.println("Data updated successfully :" + myMap1);
				} else {
					System.out.println("No such data exist");
				}
				break;

			case 4:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Search Key
				System.out.print("Enter the key you want to search : ");
				int key3 = sc.nextInt();
				if (myMap1.containsKey(key3)) {
					System.out.println(key3 + " is present in myMap and its value is " + myMap1.get(key3));
				} else {
					System.out.println(key3 + " is not present in myMap.");
				}
				break;

			case 5:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Search value
				System.out.print("Enter the value you want to search : ");
				int value4 = sc.nextInt();
				if (myMap1.containsValue(value4)) {
					System.out.println(value4 + " is present in myMap.");
				} else {
					System.out.println(value4 + " is not present in myMap.");
				}
				break;

			case 6:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Delete
				System.out.print("Enter the key you want to delete : ");
				int key5 = sc.nextInt();
				if (myMap1.containsKey(key5)) {
					System.out.println("Before removing " + key5 + " myMap : " + myMap1);
					myMap1.remove(key5);
					System.out.println("After removing " + key5 + " myMap : " + myMap1);
				} else {
					System.out.println(key5 + " is not present in mySet.");
				}
				break;

			case 7:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Max and Min in keySet
				int max = Collections.max(myMap1.keySet());
				int min = Collections.min(myMap1.keySet());
				System.out.println("Max key in myMap is : " + max);
				System.out.println("Min key in myMap is : " + min);
				break;

			case 8:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Max and Min in value
				int max_v = 0;
				int min_v = 100;
				for (int ele : myMap1.keySet()) {
					if (max_v < myMap1.get(ele)) {
						max_v = myMap1.get(ele);
					}
					if (min_v > myMap1.get(ele)) {
						min_v = myMap1.get(ele);
					}
				}
				System.out.println("Max value in myMap is : " + max_v);
				System.out.println("Min value in myMap is : " + min_v);
				break;

			case 9:

				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Sort
				System.out.println("Sorting not possible through Collection.sort() method.");
				break;

			case 10:
				/*
				 * *****************************************************************************
				 * *****************
				 */
				// Exit
				check1 = false;
				break;

			default:
				System.out.println("You have enter wrong option");
			}

		} while (check1);
	}
}
