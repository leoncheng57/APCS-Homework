import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> ai = new ArrayList<Integer>();
	Collections.addAll(ai,3,2,4,2,2,4,5,6,6,6,7,8,2,3,3,4); //something I found online about filling arraylists easily
	// Random r = new Random();
	// for (int i=0;i<20;i++){
	//     ai.add( r.nextInt(5) );
	// }
	// System.out.println(ai);
	
	for(int i=1;i<ai.size();i=i){ //start at i=1, not i=0 because there is nothing behind the zero element to compare it to
	    if (ai.get(i)==ai.get(i-1)){
		System.out.println("removed this val: "+ai.remove(i));
		System.out.println(i);
	    }
	    else {
		i++;
	    }
	}
	System.out.println(ai);



	//ai.add(99,99);
	//ai.remove(99);
	//ai.get(99);
	//ai.set(99,99);
    }
}
