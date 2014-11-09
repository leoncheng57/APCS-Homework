/*<----------------MY NOTES------------------->*/
/*
  lists are not the same as arrays
  lists are like the things we used in Python (easier to use than Arrays)
  lists are made 
*/
public class Sarray{    
    /*<----------------MAIN------------------->*/
    public static void main(String[] args){
     	Sarray s = new Sarray();
	System.out.println(s);
	s.set(8,11); //set 
	System.out.println(s);
	System.out.println(s.get(8)); //get
	System.out.println(s);
	System.out.println(s.add(22));//add(version1)
	System.out.println(s);
	System.out.println(s.add(22));//add(version1)
	System.out.println(s);
	s.add(3,33);//add(version2)
	System.out.println(s);    
	s.add(15,33);//add(version2)
	System.out.println(s);    
	s.remove(4); //remove
	s.remove(5); //remove
	System.out.println(s);
	System.out.println("the size is: " + s.size()); //size	
    }
    
    /*<----------------INSTANCE VARIABLES------------------->*/
    private int[] data; // should be object[]
    private int last; //last index of the list

    /*<----------------METHODS AND CONSTRUCTOR------------------->*/
    //This was a method that I decided to include
    //prints the array in a readable fashion
    //finds the number for last, changes last, prints last
    public String toString(){
	String ret = ""; 
	for (int a=0;a<data.length;a++){
    	    ret += +data[a]+", ";
	}
	ret+="\n";
	int count = -1;
	for (int a=0;a<data.length;a++){
	    if (data[a]!=0){
		count = a;
	    }
	}
	last = count;	
	ret+="last: "+last;
	ret+="\n";
	return ret;
    }

    //set up the initial instance variables
    public Sarray() {
	// start array at size 10, don't use 0
	data = new int[10];
    }

    //adds an item to the end of the list, grow if needed, returns true
    public boolean add (int i) {
	//Note: The toString fxn usually needs to be run before this function, b/c this relies in the var last, which is updated in toString
	if (last == data.length-1){
	    //gotta create a new array with i as the last added element
	    int[] newArray = new int[data.length+1];
	    for (int a=0;a<data.length;a++){newArray[a]=data[a];}
	    newArray[newArray.length-1] = i;
	    data=newArray;
	}
	else {data[last+1]=i;}
	return true;
    }

    //adds item i at index, shifting everything down as needed
    //also grows as needed
    //!!TODO:need to implement growing!!
    public void add (int index, int i) {
    	// inserts at location index - shift everything else down
    	int[] newArray;
	if (index<data.length){
	    newArray=new int[data.length+1];
	    for (int a=0;a<newArray.length;a++) {
		if (a<index) {
		    newArray[a]=data[a];
		}
		if (a==index) {
		    newArray[a]=i;
		}
		if (a>index) {
		    newArray[a]=data[a-1];
		}
	    }
	}
	else {
	    newArray = new int[index+1];
	    for (int a=0;a<data.length;a++){
		newArray[a]=data[a];
	    }
	    newArray[index]=i;
	}
    	data = newArray;
    }

    //return the number of items in the list (not the array size)
    public int size(){
	int count = 0;
	for (int a=0;a<data.length;a++){
	    if (data[a]!=0){
		count++;
	    }
	}
	return count;
    }

    //returns the item at location index of the list
    public int get (int index) {
	return data[index];
    }
    
    //sets the item at locaiton index to value i
    //returns the old value
    public int set (int index, int i) {
	int ret = data[index];
	data[index]=i;
	return ret;
    }
        
    //removes the item at index i
    //returns the old value 
    public int remove(int index){
	int ret = data[index];
	int[] newArray = new int[data.length-1];
	// for(int a=0;a<newArray.length;a++){
	//     if (a<index){newArray[a]=data[a];}
	//     if (a>=index){newArray[a]=data[a+1];}
	// }
	int a=0;
	for (a=a;a<index;a++){newArray[a]=data[a];}
	for (a=a;a<newArray.length;a++){newArray[a]=data[a+1];}
	data = newArray;
	return ret;
    }
}

