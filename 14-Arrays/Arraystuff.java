import java.util.*;

public class Arraystuff {
    /*-------------------- Instance Variables --------------------*/

    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;

    /*-------------------- Constructors --------------------*/ 
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    /*-------------------- Methods --------------------*/
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }


    //int freq(i) - returns the number of times the element at a[i] occurs. So, if our array contains 3,2,4,5,6,2,3,4,1,2,3 starting with the three at index 0, freq(1) returns 3 because the element at location 1, a 2 (a1 has a 2) occurs 3 times.
    public int freq(int i){
    	for (int n=0;n<a.length;n++){
	    if (a[n]==i) {
		return n;
	    }
	}
	return -1;
    }


    //Codingbat Problems
    public int sum67(int[] nums) {
	int f = 0;
	boolean s = true;
	for (int i = 0;i<nums.length;i++) {
	    if (nums[i]==6) {
		s = false;
	    }
	    if (s == true) {
		f += nums[i];
	    }
	    if (nums[i]==7) {
		s = true;
	    }
	}
	return f;
    }
    public boolean more14(int[] nums) {
	int freq = 0;
	int freq2 = 0;
	for (int i=0;i<nums.length;i++) {
	    if (nums[i] == 1) {
		freq += 1;
	    }
	    if (nums[i] == 4){
		freq2 += 1;
	    }
	}
	return (freq > freq2);
  
    }

    public int[] tenRun(int[] nums) {
	boolean s = false;
	int k = 0;
	for(int i=0;i<nums.length;i++) {
	    // if (s==true && nums[i] % 10 == 0){
	    // 	s = false;
	    // }
	    if (nums[i] % 10 == 0) {
		s = true;
		k = nums[i];
	    }
	    if (s == true) {
		nums[i] = k;
	    }
	}
	return nums;
    }		

    public boolean tripleUp(int[] nums) {
	for (int i=0;i+2<nums.length;i++){ //i+2<nums.length makes sure it never goes out of range
	    if (nums[i] == nums[i+1]-1 &&
		nums[i+1] == nums[i+2]-1) {
		return true;
	    }
	}
	return false;
    }

    // thoughts on the algorithm:
    // take sum, subtract first  element from sum, sum the subtracted elements, if total subtracted == sum after subtraction then return true
    public boolean canBalance (int[] nums) {
	int rightSum = 0;
	int leftSum = 0;
	for (int i=0;i<nums.length;i=i+1){
	    rightSum = rightSum + nums[i];
	}
	for (int i=0;i<nums.length;i=i+1){
	    rightSum = rightSum - nums[i];
	    leftSum = leftSum + nums[i];
	    if (leftSum==rightSum) {
		return true;
	    }
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int[] ret = new int[n*(n + 1)/2]; 
	int i = 0;
	for (int place=0;place<=n;place++){
	    for (int x=1;x<=place;x++,i++){
		ret[i]=x;
	    }
	}
	return ret;
    }


    

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println();
	System.out.println(as.freq(75));
	
    }
}
