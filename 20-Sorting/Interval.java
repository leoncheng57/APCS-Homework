import java.io.*;
import java.util.*;

public class Interval {
    private int high;
    private int low;
    private Random r = new Random();
    ArrayList<Interval> data = new ArrayList<Interval>();
    
    
    
    //CONSTRUCTORS
    public Interval(int l, int h){
	low = l;
	high = h;
    }
    
    public Interval(){
	low = r.nextInt(100);
	high = r.nextInt(100)+low+1;
    }

    //TOSTRING
    public String toString () {
	String output = "";
	output += "[";
	output += low;
	output += ",";
	output += high;
	output += "]";
	return output;
    }

    //SORT
   
    

    //MAIN
    public static void main(String[] args){
	Interval i = new Interval();
	for (int x =0;x<10;x++){
	    System.out.println(i);
	}
	
	
    }
}

//NOTES!!!
//STATIC
//part of the class when it is created, not part of the instance
//ex: Math.sqrt
//static variables are all shared by the class, not part of one instance

//Arrays.toString(a) prints out the array conveniently

/* HOMEWORK
add a compareTo routine that compares two intervals, compare by the low num (if low nums are same, comapre hgih num), returns pos, zero, or neg intergers like compareTo for String
*/
