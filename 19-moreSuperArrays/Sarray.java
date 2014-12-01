public class Sarray{
        
    /*<----------------INSTANCE VARIABLES------------------->*/
    public String[] data; // should be object[]
    public  int last; //last index of the list

    /*<----------------METHODS AND CONSTRUCTOR------------------->*/    
    //This was a method that I decided to include
    //prints the array in a readable fashion
    //finds the number for last, changes last, prints last
    public String toString(){
	String ret = ""; 
	for (int a=0;a<data.length;a++){
    	    ret += data[a]+", ";
	}
	ret+="\n";
	int count = -1;
	for (int a=0;a<data.length;a++){
	    if (data[a]!=null){
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
	data = new String[10];
    }

    public String[] getData(){
	return data;
    }

    public void setData(int index, String s){
	data[index] = s;
    }


    
    //adds an item to the end of the list, grow if needed, returns true
    public boolean add (String s) {
	//Note: The toString fxn usually needs to be run before this function, b/c this relies in the var last, which is updated in toString
	if (last == data.length-1){
	    //gotta create a new array with i as the last added element
	    String[] newArray = new String[data.length+1];
	    for (int a=0;a<data.length;a++){newArray[a]=data[a];}
	    newArray[newArray.length-1] = s;
	    data=newArray;
	}
	else {data[last+1]=s;}
	return true;
    }

    //adds item s at index, shifting everything down as needed
    //also grows as needed
    public void add (int index, String s) {
    	// inserts at location index - shift everything else down
    	String[] newArray;
	if (index<data.length){
	    newArray=new String[data.length+1];
	    for (int a=0;a<newArray.length;a++) {
		if (a<index) {
		    newArray[a]=data[a];
		}
		if (a==index) {
		    newArray[a]=s;
		}
		if (a>index) {
		    newArray[a]=data[a-1];
		}
	    }
	}
	else {
	    newArray = new String[index+1];
	    for (int a=0;a<data.length;a++){
		newArray[a]=data[a];
	    }
	    newArray[index]=s;
	}
    	data = newArray;
    }

    //return the number of items in the list (not the array size)
    public int size(){
    	int count = 0;
    	for (int a=0;a<data.length;a++){
    	    if (data[a]!=null){
    		count++;
    	    }
    	}
    	return count;
    }

    //returns the item at location index of the list
    public String get (int index) {
    	return data[index];
    }
    
    // sets the item at locaiton index to value i
    //returns the old value
    public String set (int index, String s) {
    	if (index>data.length){
    	    throw new ArrayIndexOutOfBoundsException();
    	    //throw new IndexOutOfBoundsException();
    	    //throw new ArithmeticException();
    	}
    	String ret = data[index];
    	data[index]=s;
    	return ret;
    }
        
    //removes the item at index i
    //returns the old value 
    public String remove(int index){
    	String ret = data[index];
        String[] newArray = new String[data.length-1];
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



    /*-----------------MAIN-----------*/
    public static void main(String[] args){
	Sarray s = new Sarray();
	System.out.println(s);
	s.add("hola");
	System.out.println(s);
	System.out.println(s.size());
	s.add(4,"mundo");
	System.out.println(s);
	// s.add(99,"mundo");
	// System.out.println(s);
	System.out.println(s.size());
	System.out.println();
	System.out.println();
	System.out.println(s.get(0));
	System.out.println(s);
	s.remove(0);
	System.out.println(s);
	System.out.println();
	System.out.println();
	System.out.println();
	s.set(0,"hola");
	System.out.println(s);
    }
}
