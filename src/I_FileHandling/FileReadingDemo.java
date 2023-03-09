package I_FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f = new File("FH_test1");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println();
		
		try {
			File f = new File("my_file.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

			br.close();
			fr.close();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
