package com.fdmgroup.IOExample;

//Import the needed classes from JavaIO
import java.io.*;

public class IOExampleMain {
	
	public static void main(String[] a){
		
		/* Create a file inside the project root by default and write to it
		 * The second value is append (false will overwrite, true will append)
		 * Java will translate '/' to '\' for Windows
		 * File paths can be relative or absolute
		 * After running this code you will need to refresh your project
		 * in the Project Explorer to see the file it created
		 */
		try {
			Writer w = new FileWriter("./Test.txt", true);
			BufferedWriter bw = new BufferedWriter(w);
			String line = "This String will be written to the file 'Test.txt'\n";
			bw.write(line);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Handle the IOException
			e.printStackTrace();
		}			
		
		/* Now, let's read from the file we just created and print its contents
		 * to the command line. 
		 */
		try {
			Reader r = new FileReader("Test.txt");
			BufferedReader br = new BufferedReader(r);
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Handle the file not being found
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Handle any other IOException
			e.printStackTrace();
		}

	}
}
