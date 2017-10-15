package programs;

import java.io.FileWriter;
import java.io.IOException;

public class Copyright {
	public static void main(String[] args){
		try {
			FileWriter fw = new FileWriter("src/programs/JUNK.java", true);
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			fw.write("\n//*************************************** \n//| \n//| Copyright © 2017 by Charlie Herbert");
			fw.write("\n//| \n//***************************************");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
