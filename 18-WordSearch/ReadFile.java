import java.io.*;
import java.util.*;

public class ReadFile {

    private String[] words = {"Hello","world"};

    public String[] getWords(){
	return words;
    }
    
    public static void main(String[] args) {
	Scanner sc=null;
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open file");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String s = sc.next();
	    System.out.println("Word: "+s);
	}
    }
}
