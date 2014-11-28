public class orderedSarray extends Sarray{

    /*<----------------INSTANCE VARIABLES------------------->*/
    private String[] data; // should be object[]
    private int last; //last index of the list

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
    public orderedSarray() {
	// start array at size 10, don't use 0
	data = new String[10];
    }
    
    
    public void add(int i, String s){
	System.out.println("ERROR: cannot add to a specfied part in the ORDERED Sarray");
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
    
    public boolean addNew(String s){
	for (int i=0;i<data.length;i++){
	    System.out.println(s);
	    System.out.println(data[i]);
	    if (s.compareTo(data[i])<0){
		super.add(i,s);
		break;
	    }
	}
	return true;
    }
 

    /*-------------MAIN-------------------*/
    public static void main(String[] args){
	orderedSarray os = new orderedSarray();
	System.out.println();
	System.out.println(os);
	os.add(55,"hi");
	System.out.println(os.add("hi"));
	System.out.println(os);
	System.out.println(os.add("bye"));
	System.out.println(os);
	System.out.println(os.add("later"));
	System.out.println(os);
	System.out.println("a".compareTo("z"));
	System.out.println(os.addNew("aaa"));
	System.out.println(os);
	
    }
}
