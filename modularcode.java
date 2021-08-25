import java.io.*;
import java.util.Scanner;

public class TextFile {
    String workingDirectory = System.getProperty("user.dir");
    String pathSeparator = System.getProperty("file.separator");
    String filePath = workingDirectory + pathSeparator + "src" + pathSeparator + "default package" + pathSeparator + "Files" + pathSeparator + "Tribute to parents.txt";
    public void countLines() {
        int numLines = 0;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.readLine() != null) {
                numLines++;
            }
            reader.close();
            fileReader.close();
            System.out.println("Number of Lines = " + numLines);
        } catch (FileNotFoundException ioException) {
            System.out.println("Your file does not exist.");
        } catch (IOException e) {
            System.out.println("Your file does not exist.");
        }
    }
    public void countWords(){
        int numWords = 0, numChars=0;
        Scanner myFile = null;
        try {
            Scanner file = new Scanner(new File(filePath));
            myFile = file;
        } catch (FileNotFoundException ioException) {
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
        }
        myFile.close();
        System.out.println("Number of Words = " + numWords);
    }
    public void countChars(){
        int numChars = 0;
        Scanner myFile = null;
        try {
            Scanner file = new Scanner(new File(filePath));
            myFile = file;
        } catch (FileNotFoundException ioException) {
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
            }
        }
        myFile.close();
        System.out.println("Number of Char =  " + numChars);
    }
}

public class AppRunner {
    public static void main(String[] args) {
        TextFile textFile = new TextFile();
        textFile.countLines();
        textFile.countWords();
        textFile.countChars();
    }
}
