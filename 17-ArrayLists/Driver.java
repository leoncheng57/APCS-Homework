import java.util.*;
public class Driver{
    public static void main(String[] args){

	int customLength = 10; //here, user can set the length of the arraylist and array

	//ARRAYLISTS
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i=0;i<customLength;i++){
	    al.add(i);
	}
	System.out.println("original: "+al);

	ArrayList<Integer> ret = new ArrayList<Integer>();
	Random r = new Random();
	while (al.size()>0){
	    ret.add(al.remove(  r.nextInt(al.size()))  );
	}
	System.out.println("ArrayList: "+ret);
    
	//ARRAYS
        int[] a = new int[customLength];
	for (int i=0;i<a.length;i++){
	    a[i]=i;
	}
	
	for (int i=0;i<a.length;i++){
	    int indexFirst = r.nextInt(a.length);
	    int valueFirst = a[indexFirst];
	    int indexSecond = r.nextInt(a.length);
	    int valueSecond = a[indexSecond];
	    a[indexSecond] = valueFirst;
	    a[indexFirst] = valueSecond;
	}	
	
	//printing the array
	System.out.print("printing array: ");
	for (int i=0;i<a.length;i++){
	    System.out.print(a[i]+", ");
	}
	System.out.println();
    }
}
