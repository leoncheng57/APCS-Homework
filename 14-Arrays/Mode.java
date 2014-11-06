//Taken from Zamansky's classcode: https://github.com/stuycs-apcs-z/classcode/blob/master/1/mode/Mode.java 

import java.io.*;
import java.util.*;

public class Mode {

    /*------------ Instance Variables -------------*/
    int[] a;
    Random r;

    /*------------ Constructors -------------*/
    public Mode() {
	this(20,100);
    }

    public Mode(int n) {
	this(n,100);
    }


    /* 
       n - size of the array
ls
       m - max value for each entry
    */
    public Mode(int n,int m){
	r = new Random();
	a = new int[n];
	for (int i=0;i<n;i++){
	    a[i] = r.nextInt(m);
	}
    }

    /*------------  methods -------------*/
		
    public String toString() {
	String s = "";
	for (int i=0;i<a.length;i++)
	    s = s  + a[i]+", ";
	return s;
    }




    public int freq(int n) {
	int count = 0;
	for (int i=0;i<a.length;i++){
	    if (a[i]==n)
		count = count + 1;
	}
	return count;
    }

    //less efficient way
    public int mode(){
	int count = 0;
	int modeIndex = 0;
	for (int i=0;i<a.length;i++){
	    if (freq(a[i]) > count){
		count = freq(a[i]);
		modeIndex = i;
	    }
	}
	System.out.println("modeval = "+a[modeIndex]);
	return count;
    }
    
    //more efficient way (My attempt) (buckets algorithm)
    public int fastmode(int maxnum){
	int[] intArray = new int[maxnum+1];
	for (int i=0;i<a.length;i++){
	    intArray[a[i]] += 1;
	}
	int winner = 0;
	int winnerIndex = 0;
	for (int i=0;i<intArray.length;i++){
	    if (intArray[i]>winner){
		winner = intArray[i];
		winnerIndex = i;
	    }
	}
	return winnerIndex;
    }
		
    /*------------  main -------------*/		
    public static void main(String[] args) {
	int n=20,
	    maxval=20;

	if (args.length > 0){
	    n = Integer.parseInt(args[0]);
	}
	if (args.length > 1){
	    maxval = Integer.parseInt(args[1]);
	}

	Mode m = new Mode(n,maxval);
	//System.out.println(m);
	//System.out.println("modecount = "+m.mode());

	System.out.println();
	System.out.println(m.fastmode(maxval));

    }
}
