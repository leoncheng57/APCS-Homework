public class Sarray{
    private int[] data; // should be object[]

    public Sarray() {
	// start array at size 10, don't use 0
	data = new data[10];
    }
    public String add (int i) {
	// add to end
	for (int a=0;a<data.length;a++){
	    if (data[a]==0) {
		data[a]=i;
		return "completed running add";
	    }
	}
	return "error: no space in the array to add to";	   
    }

    // add methods might require growing
    public void add (int index, int i) {
	// inserts at location index - shift everything else down
	int[] newarray=new newarray[data.length+1];
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
    public int get (int index) {
	// gets the item
	return data[index];
    }
    
    public void set (int index, int i) {
	// replaces item
	data[index]=i;
    }
    
    public int size(){
        for (int a=0;a<data.length;a++) {
	    if (data[a]==0) {
		return a;
	    }
	}
    }
    
    public void remove (int index) {
	// must shift things over
	for (int a=0;a<data.length-1;a++) {
	    if (a>=index) {
		data[a]=data[a+1];
	    }
	}
	data[data.length-1]=0;
	
    }
}
