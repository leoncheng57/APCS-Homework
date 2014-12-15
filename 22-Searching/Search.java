import java.util.*;
import java.io.*;

public class Search{

    //linear search
    public Comparable lsearch (Comparable[] a, Comparable s){
	for (int i=0;i<a.length;i++){
	    if (a[i].equals(s)){
		return s;
	    }
	}
	return null;
    }

    //binary search
    public Comparable bsearch(Comparable[] a, Comparable s){
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
    public Comparable rbsearch(Comparable[] a, Comparable s){
	return rbsearch(a,s,0,a.length-1); //why does "return" have to be in the code?
    }

    public Comparable rbsearch(Comparable[] a, Comparable s,int low, int high){
	int mid, n;
	while (low != high){
	    mid = (low + high)/2;
	    n = s.compareTo(a[mid]);
	    if (n==0)
		return s;
	    if (n>0)
		return rbsearch(a,s,mid+1,high);
	    if (n<0)
		return rbsearch(a,s,low,mid-1);
	}
	if (s.compareTo(a[low])==0)
	    return s;
	else
	    return null;
    }
    
    /*-----------MAIN--------------------*/
    public static void main(String[] args){
	Search sea = new Search();
	Comparable[] c = {"hello", "sad", "watermelon","seven"};
	Arrays.sort(c);
	System.out.println(Arrays.toString(c));
	System.out.println(sea.lsearch(c,"water"));
	System.out.println(sea.lsearch(c,"watermelon"));
	System.out.println(sea.bsearch(c,"water"));
	System.out.println(sea.bsearch(c,"watermelon"));
	System.out.println(sea.rbsearch(c,"water"));
	System.out.println(sea.rbsearch(c,"watermelon"));
	
	
	
    }
}

/*
  search should return the value it found (also the place of it?)
  return null if not found
*/
