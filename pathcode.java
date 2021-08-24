import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numLines = 0;
		int numWords = 0;
		int numChars = 0;
		
		Scanner set = new Scanner(System.in);
		Scanner myFile = null;
		System.out.println("Enter your path: ");
		String value = set.nextLine();
		try {
			System.setProperty("user.dir", value);
			
			Scanner file = new Scanner(new File (System.getProperty("user.dir")));
			myFile = file;
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Your file does not exist.");
		}
		while(myFile.hasNextLine()) {
			String curLine = myFile.nextLine();
			int size = curLine.length();
			boolean foundDiv = true ;
			boolean foundChar = false ;
			for (int LineSize = 0; LineSize < size ; LineSize++) {
				if(curLine.charAt(LineSize) == ' ') {
					foundDiv = true;
					foundChar = false;
				
					}else {
						foundChar = true;
						numChars++ ;
					}
			if(foundChar && foundDiv) {
				numWords++;
				foundDiv = false;
			}
		}
			numLines++;
	}
		myFile.close();
		System.out.println("Number of Words = " + numWords);
		System.out.println("Number of Lines = " + numLines);
		System.out.println("Number of Char =  " + numChars);
}
}
