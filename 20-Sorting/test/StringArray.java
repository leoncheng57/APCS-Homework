public class StringArray{
    private String[] data;
    public StringArray(){
	data = new String[10];
    }
    public String[] get(){
	return data;
    }
    public void set(int index,String s){
	data[index] = s;
    }
    public String toString(){
	String s = "";
	for (int i = 0; i < data.length; i ++){
	    s = s + data[i] + ", ";
	}
	return s;
    }
    public int size(){
	int count = 0;
	for(int counter =0; counter < data.length;counter ++){
	    if(data[counter] != null){
		count ++;
	    }
	}
	return count;
    }
    public void grow(){
	String[] data2 = new String[size() + 1];
	for(int i = 0; i < data.length; i ++){
	    data2[i] = data[i];
	}
	data = new String[size() + 1];
	for(int i = 0; i < data.length; i ++){
	    data[i] = data2[i];
	}
    }
    public boolean add(String s){
	int len = data.length;
	if(size() == len){
	    grow();
	    data[size()] = s;
	}
	else{
	    data[size()] = s;
	}
	return true;
    }
    public void add(int index, String i){
	if (index>data.length -1){
	    throw new ArrayIndexOutOfBoundsException();
	}
	int len = data.length;
	if (size() != data.length){
	    for(int counter = data.length - 1; counter > index; counter --){
		data[counter] = data[counter - 1];
	    }
	    data[index] = i;
	}
	else{
	    grow();
	    for(int counter = data.length - 1; counter > index; counter --){
		data[counter] = data[counter - 1];
	    }
	    data[index] = i;
	}

    }
    public String get(int index){
	return data[index];
    }
    public String remove(int index){
	if (index>data.length -1){
	    throw new ArrayIndexOutOfBoundsException();
	}
	String original = data[index];
	for(int counter = index; counter < data.length - 1;counter ++){
	    data[counter] = data[counter + 1];
	}
	return original;
    } 
    public void isortdescend(){
	String temp;
	int i;
	int index;
	for(i = 0; i < size(); i ++){
	    temp = data[i];
	    for(index = i;index > 0 && temp.compareTo(data[index - 1]) >= 0; index --){
		data[index] = data[index - 1];
	    }
	    data[index] = temp;
	}
    }
    public void isortascend(){
	String temp;
	int i;
	int index;
	for(i = 0; i < size(); i ++){
	    temp = data[i];
	    for(index = i;index > 0 && temp.compareTo(data[index - 1]) <= 0; index --){
		data[index] = data[index - 1];
	    }
	    data[index] = temp;
	}
    }
    public void ssortascend(){
	String min;
	String s1;
	String s2;
	for(int i = 0; i < size(); i ++){
	    int pos = size() - 1;
	    min = data[i];
	    for(int index = i; index < size(); index ++){
		if(min.compareTo(data[index]) > 0){
		    min = data[index];
		    pos = index;
		}
	    }
	    s1 = data[i];
	    s2 = min;
	    data[i] = s2; 
	    data[pos] = s1;
	}
    }
     public void ssortdescend(){
	String max;
	String s1;
	String s2;
	for(int i = 0; i < size(); i ++){
	    int pos = size() - 1;
	    max = data[i];
	    for(int index = i; index < size(); index ++){
		if(max.compareTo(data[index]) < 0){
		    max = data[index];
		    pos = index;
		}
	    }
	    s1 = data[i];
	    s2 = max;
	    data[i] = s2; 
	    data[pos] = s1;
	}
     }
    public void bsort(){
	String s1;
	String s2;
	for(int i = 0; i < size() - 1; i ++){
	    for(int index = 0; index < size() - 1; index ++){
		if(data[index].compareTo(data[index + 1]) > 0){
		    s1 = data[index];
		    s2 = data[index + 1];
		    data[index] = s2;
		    data[index + 1] = s1;
		}
	    }
	}
    }
    //run time of insertion is 0.174 seconds
    //run time for selection is 0.06 seconds
    //selection can be said to be better because it has a lower run time and therefore faster
    //bubblesort is probably slower than others because it takes form as n^2 instead of n!
    public static void main(String[] args){
	StringArray as = new StringArray();
	System.out.println(as);
	System.out.println(as.size());
	System.out.println(as.add("man"));
	as.add(1,"tan");
	System.out.println(as.add("dan"));
	System.out.println(as.add("white"));
	System.out.println(as.add("blue"));
	System.out.println(as.add("ban"));
	System.out.println(as.add("fan"));
	System.out.println(as.add("wan"));
	System.out.println(as.add("bite"));
	System.out.println(as.add("true"));
	System.out.println(as.add("san"));
	System.out.println(as.add("ran"));
	System.out.println(as.add("can"));
	System.out.println(as.add("mite"));
	System.out.println(as);
 	as.isortdescend();
	System.out.println(as);
	as.isortascend();
	System.out.println(as);
	as.ssortascend();
	System.out.println(as);
	as.ssortdescend();
	System.out.println(as);
	as.bsort();
	System.out.println(as);
	
    }
}
