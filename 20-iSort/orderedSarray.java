public class orderedSarray extends Sarray{

    public void add(int i, String s){
	System.out.println("ERROR: cannot add to a specfied part in the ORDERED Sarray");
    }
    
    //Note: this method will always make the length of data bigger
    public boolean add(String s){
	String[] oldData = super.getData();
	for (int i=0;i<super.getData().length;i++){
	    if (super.getData()[i]==null){
		super.add(i,s);
		break;
	    }
	    if (s.compareTo(super.getData()[i])<0){
		super.add(i,s);
		break;
	    }
	}
	return true;
    }
    
    //takes away the String at index and inserts s in its proper place
    public String set (int index, String s) {
    	if (index>super.getData().length){
    	    throw new ArrayIndexOutOfBoundsException();
    	    //throw new IndexOutOfBoundsException();
    	    //throw new ArithmeticException();
    	}
	String oldString = super.remove(index);
	add(s);
	return oldString;
    }


    /*-------------MAIN-------------------*/
    public static void main(String[] args){
	orderedSarray os = new orderedSarray();
	System.out.println();
	System.out.println(os);
	os.add(55,"hi");
	System.out.println("a".compareTo("z"));
	System.out.println(os.add("aaa"));
	System.out.println(os.add("a"));
	System.out.println(os);
	System.out.println(os.add("a"));
	System.out.println(os);
	System.out.println(os.add("z"));
	System.out.println(os);
	System.out.println(os.add("a"));
	System.out.println(os);
	System.out.println(os.add("g"));
	System.out.println(os);
	System.out.println(os.add("1"));
	System.out.println(os);
	System.out.println(os.set(1,"hello"));
	System.out.println(os);
	System.out.println(os.set(0,"hello"));
	System.out.println(os);
	System.out.println(os.get(0));
	System.out.println(os.size());
	
    }
}
