import java.util.*;
import java.io.*;
public class sortingTest{
    public static void main(String[] args){
	// BaseChar[] a = new BaseChar[5];
	// for (int i=0;i<a.length;i++){
	//     a[i]=new BaseChar();
	// }
	// a[0].setName("myname");
	// a[1].setName("bobito");
	// a[2].setName("doyle");
	// a[3].setName("margo");
	// a[4].setName("parsons");
	// System.out.println(Arrays.toString(a));
	// Arrays.sort(a);
	// System.out.println(Arrays.toString(a));
	
	//What if we extend the class???
	ExtendBaseChar[] a = new ExtendBaseChar[5];
	for (int i=0;i<a.length;i++){
	    a[i]=new ExtendBaseChar();
	}
	a[0].setName("myname");
	a[1].setName("bobito");
	a[2].setName("doyle");
	a[3].setName("margo");
	a[4].setName("parsons");
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	//just some practice with sorting arraylists
	ArrayList<Integer> al = new ArrayList<Integer>();
	System.out.println(al);
	al.add(1);
	al.add(1231231);
	al.add(1231);
	al.add(112);
	Collections.sort(al);
	System.out.println(al);
    }
}
