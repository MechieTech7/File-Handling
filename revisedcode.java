import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TextFile {

	public void fileRunner()  {
		
		int numLines = 0;
		int numWords = 0;
		int numChars = 0;
		String userWorkingDirectory = System.getProperty("user.dir");
		String pathSeparator = System.getProperty("file.separator");
		String filepath = userWorkingDirectory + pathSeparator + "src" + pathSeparator + "default package" + pathSeparator + "Files" + pathSeparator + "Tribute to parents.txt";
		Scanner myFile = null;
		
		try {
		
			
			Scanner file = new Scanner(new File("filepath"));
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
public class AppRunner {

	public static void main (String[] args ) {

		TextFile tf = new TextFile();
		tf.fileRunner();
}
}

