import java.io.*;
import java.util.*;

class Sorts {
    int[] data;
    int[] copy;
    Random r;
    int countC; //number of comparisons
    int countA; //number of assignments

    public Sorts(int n){
	r = new Random();
	data = new int[n];
	copy = new int[n];
	fill();
    }

    public Sorts() {
	this(20);
    }
    
    public void fill(){
	for (int i = 0; i < data.length; i++) {
	    data[i]=r.nextInt(100);
	}
    }

    public void backup() {
	for (int i = 0; i < data.length; i++) {
	    copy[i] = data[i];
	}
    }

    public void restore() {
	for (int i = 0; i < data.length; i++) {
	    data[i] = copy[i];
	}
    }


    public void isort() {
	countC=0;
	countA=0;
	int i,j;
	for (i = 1; i < data.length; i++) {
	    int tmp=data[i];
	    for (j=i-1 ; j >= 0 && tmp < data[j];j--) {
		data[j+1]=data[j];
		countC++;
		countA++;
	    }
	    data[j+1]=tmp;
	    countA++;
	}
    }


    public void ssort() {
	int i,j;
	int mi;
	for ( i = 0; i < data.length-1; i++) {
	    mi = i;
	    for (j=i+1;j<data.length;j++) {
		countC++;
		if (data[j]<data[mi]){
		    mi=j;
		    countA++;
		}
	    }
	    int tmp=data[mi];
	    countA++;
	    data[mi]=data[i];
	    countA++;
	    data[i]=tmp;
	    countA++;
	}
    }

    
    public void bsort(){
	for (int repeat=0;repeat<data.length;repeat++){
	    for(int j=0;j<data.length-1-repeat;j++){
		int currentMax = data[j];
		countA++;
		countC++;
		if (currentMax - (data[j+1])<0){ //new currentMax
		    currentMax = data[j+1];
		    countA++;
		    countC++;
		}
		else{
		    data[j]=data[j+1];
		    data[j+1]=currentMax;
		    countA++;
		    countA++;
		}
	    }
	}
    }


    public void builtin() {
	/* this sorts the whole array, if you want to sort only some of it
	   you would write Arrays.sort(data,0,n) where n is the index beyond the 
	   stopping point */
			 
	Arrays.sort(data);

	/* for an ArrayList, you would use Collections.sort(list) */
    }

    public String toString() {
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s = s+data[i]+" ";
	}
	s+="\n"+"countC: "+countC;
	s+="\n"+"countA: "+countA;
	return s;
    }

    public static void main(String[] args) {
	Sorts s = new Sorts();
	System.out.println(s);
	//s.builtin();
	//s.isort();
	//s.ssort();
	s.bsort();
	System.out.println(s);
    }
}
