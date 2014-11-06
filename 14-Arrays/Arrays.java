public class Arrays{

    int[] intArray =  {0,1,2,3,4,5,6,7,8,9};

    // int find(n) - returns the index of the first occurence of n in the array or -1 if n isn't in the array.
    public int find(int n){
	for (int i=0;i<intArray.length; i++){
	    if (intArray[i]==n) {
	    	return i;
	    }
	}
	return -1;
    }
    
    // int maxVal() - return the largest value in the array
    public int maxVal(){
	//i'll be implementing the "knockout" method
	int winner = intArray[0];
	for (int i=0;i<intArray.length;i++){
	    if (intArray[i]>winner){
		winner = intArray[i];
	    }
	}
	return winner;
    }
    
    // public String printArray (int[] array) {
    // 	String ret = "";
    // 	for(int i=0;i<array.length;i++){
    // 	    ret = ret + array[i] + ",";
    // 	}
    // 	return ret;
    // }
    // public String printIntArray (){
    // 	return printArray(intArray);
    // }


    public static void main(String[] args){
	Arrays a = new Arrays();	
	// System.out.println(a.printIntArray());
	// System.out.println();

	System.out.println(a.find(1));	
	System.out.println(a.find(9));	
	System.out.println(a.find(10));
	System.out.println();

	System.out.println(a.maxVal());  
	System.out.println();
	
    }
    
}
