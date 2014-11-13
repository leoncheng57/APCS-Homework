import java.util.*;

public class Driver{
    public static void main(String[] args){
	System.out.println();
	ArrayList al = new ArrayList();
	System.out.println(al);

	for(int i=0;i<20;i++){
	    al.add(i);
	}
	System.out.println(al);

	ArrayList<Integer> ai=new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 20; i++) {
	    ai.add(r.nextInt(5));
	}
	System.out.println(ai);
	
    }
}
