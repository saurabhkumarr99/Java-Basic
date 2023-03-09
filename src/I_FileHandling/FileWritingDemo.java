package I_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			FileWriter fw = new FileWriter("FH_test1");
			fw.write("Hii\n");
			fw.write("Myself Saurabh Kumar Rai\n");
			fw.write("This is my first file handling program\n");
			fw.write("Thanks");
			fw.write("Hii\n");
			fw.write("Myself Saurabh Kumar Rai\n");
			fw.write("This is my first file handling program\n");
			fw.write("Thanks");
			fw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// open the file in either append mode or write mode
		// file object -> file writer object -> buffered writer object
		try {
			File f = new File("my_file.txt");
			FileWriter fw = new FileWriter(f, true); // true -> append mode
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("My name is Shivami.\n");
			bw.write("This is NPCI Cohort 5.\n");

			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
