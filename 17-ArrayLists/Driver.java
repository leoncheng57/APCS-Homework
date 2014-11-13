import java.util.*;

public class Driver{
    public static void main(String[] args){
	//ARRAYLISTS
	ArrayList<Integer> al = new ArrayList<Integer>();
	System.out.println(al);
	for(int i=0;i<10000;i++){
	    al.add(i);
	}
	System.out.println(al);

	ArrayList<Integer> ret = new ArrayList<Integer>();
	System.out.println(ret);
	Random r = new Random();
	while (al.size()>0){
	    ret.add(al.remove(  r.nextInt(al.size()))  );
	}
	System.out.println(ret);
    

	//ARRAYS
	
    }
}
