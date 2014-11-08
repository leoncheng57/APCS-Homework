/*<----------------My Notes------------------->*/
/*
  lists are not the same as arrays
  lists are like the things we used in Python (easier to use than Arrays)
  lists are made from arrays
*/


public class Sarray{
    private int[] data; // should be object[]
    private int last; //last index of the list TODO:??Where do we use this??

    public String toString(){
	String ret = ""; 
	for (int a=0;a<data.length;a++){
    	    ret += +data[a]+", ";
	}
	ret+="\n"+"last: "+last;
	return ret;
    }

    //set up the initial instance variables
    public Sarray() {
	// start array at size 10, don't use 0
	data = new int[10];
	last = data.length;
    }

    //adds an item to the end of the list, grow if needed, returns true
    public boolean add (int i) {
	boolean done = false;
	for (int a=0;done==false;a++){
	    if (data[a]==0) {
		data[a]=i;
		done = true;
	    }
	    //if all the elements in data are full, make a new array with one more element at the end
	    if (a==data.length-1){
		int[] newArray = int[data.length+1];
		for (int b=0;b<newArray.length;b++){
		    newArray[b]=data[b];
		}
		newArray[newArray.length-1]=i;
		data = newArray;
	    }
	}
	return done;	   
    }

    //adds item i at index, shifting everything down as needed
    //also grows as needed
    //!!TODO:need to implement growing!!
    public void add (int index, int i) {
	// inserts at location index - shift everything else down
	int[] newarray=new int[data.length+1];
	for (int a=0;a<data.length;a++) {
	    if (a<index) {
		newarray[a]=data[a];
	    }
	    if (a==index) {
		newarray[a]=i;
	    }
	    if (a>index) {
		newarray[a]=data[a-1];
	    }
	}
	data = newarray;
    }

    //return the number of items in the list (not the array size)
    public int size(){
        for (int a=0;a<data.length;a++) {
	    if (data[a]==0) {
		return a;
	    }
	}
	return -1; //Do I need this????
    }

    //returns the item at location index of the list
    public int get (int index) {
	// gets the item
	return data[index];
    }
    
    //sets the item at locaiton index to value i
    //returns the old value
    public void set (int index, int i) {
	// replaces item
	data[index]=i;
    }
        
    //removes the item at index i
    //returns the old value
    public void remove (int index) {
	// must shift things over
	for (int a=0;a<data.length-1;a++) {
	    if (a>=index) {
		data[a]=data[a+1];
	    }
	}
	data[data.length-1]=0;
    }



    //MAIN
    public static void main(String[] args){
     	Sarray s = new Sarray();
	System.out.println(s);
	s.add(1);
	s.add(1);
	s.add(1);
	s.add(1);
	s.add(1);
	s.add(1);
	s.add(1);
	s.add(1);
	s.add(1);
	s.add(1);
	System.out.println(s.add(1));
	System.out.println(s);
    }
}
