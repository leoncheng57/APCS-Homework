import java.util.*;
import java.io.*;

public class Search{

    private Comparable[] a;
    private static Comparable[] sampleArray = {"hello", "sad", "watermelon","seven"};	
    
    /*---------CONSTRUCTOR--------*/
    public Search(Comparable[] newArray){
     	a = newArray;
    }
    
    public Search(){
     	this(sampleArray);
    }	
    
    public Search(int len){
	a = new Comparable[len];
    }    
    
    public Comparable[] getArray(){
	return a;
    }
    
    public void sort(){
	Arrays.sort(a);
    }
    
    public void extend(){
	Comparable[] newArray = new Comparable[a.length+1];
	for(int i=0;i<a.length;i++){
	    newArray[i] = a[i];
	}
	a = newArray;
    }
    
    public void addItem(Comparable item){
	extend();
	a[a.length-1]=item;
    }

    public void addItem(int i, Comparable item){
	a[i]=item;
    }
    
    
    //linear search
    public Comparable lsearch (Comparable s){
	for (int i=0;i<a.length;i++){
	    if (a[i].equals(s)){
		return s;
	    }
	}
	return null;
    }

    //binary search
    public Comparable bsearch( Comparable s){
	int low = 0;
	int high = a.length-1;
	int mid;
	int n;
	while (low!=high){
	    mid = (low+high)/2;
	    n = s.compareTo(a[mid]);
	    if (n==0)
		return s;
	    if (n>0)
		low = mid+1;
	    if (n<0)
		high = mid-1;
	}
	if (s.compareTo(a[low])==0){
	    return s;
	}
	else
	    return null;
    }
    
    //recrusive binary search
    public Comparable rbsearch(Comparable s){
	return rbsearch(s,0,a.length-1); //why does "return" have to be in the code?
    }

    public Comparable rbsearch(Comparable s,int low, int high){
	int mid, n;
	while (low != high){
	    mid = (low + high)/2;
	    n = s.compareTo(a[mid]);
	    if (n==0)
		return s;
	    if (n>0)
		return rbsearch(s,mid+1,high);
	    if (n<0)
		return rbsearch(s,low,mid-1);
	}
	if (s.compareTo(a[low])==0)
	    return s;
	else
	    return null;
    }
    
    /*-----------MAIN--------------------*/
    public static void main(String[] args){
	Search sea = new Search(10);
	for (int i=0;i<sea.getArray().length;i++){
	    sea.addItem(i,""+i);
	}
	for (int i=0;i<200;i++){
	    sea.addItem(""+i);
	}
	System.out.println(Arrays.toString(sea.getArray()));
	sea.sort();
	System.out.println(Arrays.toString(sea.getArray()));	
	
	System.out.println(sea.lsearch("5"));
	System.out.println(sea.lsearch("5"));
	System.out.println(sea.bsearch("5"));
	System.out.println(sea.bsearch("5"));
	System.out.println(sea.rbsearch("5"));
	System.out.println(sea.rbsearch("5"));

	// System.out.println(sea.lsearch("water"));
	// System.out.println(sea.lsearch("watermelon"));
	// System.out.println(sea.bsearch("water"));
	// System.out.println(sea.bsearch("watermelon"));
	// System.out.println(sea.rbsearch("water"));
	// System.out.println(sea.rbsearch("watermelon"));
	
	
	
    }
}
