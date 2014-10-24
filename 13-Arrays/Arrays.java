public class Arrays {

    
    // Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present. 
    public int[] frontPiece(int[] nums) {
	if (nums.length == 1 || nums.length == 0) {
	    return nums;
	}
	else {
	    int[] intArray = new int[2];
	    intArray[0] = nums[0];
	    intArray[1] = nums[1];
	    return intArray;
	}
    }

    //Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count. 
    public int sum13(int[] nums) {
	int sum = 0;
	for (int i=0; i<nums.length; i=i+1) {
	    sum = sum + nums[i];
	    if (nums[i] == 13) sum = sum - 13;  
	    if (nums[i] == 13 && i+1<nums.length && nums[i+1] != 13) sum = sum - nums[i+1];
	}
	return sum;
    }

    

}
