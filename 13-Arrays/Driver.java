public class Driver {
    public static void main(String[] args) {
	
	Arrays a = new Arrays();	
	int[] test = new int[3];
	test[0] = 0;    
        test[1] = 1;
        test[2] = 2;
	//System.out.println( test );

	int[] intArray2 = new int[2];
	intArray2 = a.frontPiece(test);
	for(int i=0;i<intArray2.length;i=i+1){
	    System.out.println( intArray2[i] );
	}
	System.out.println( "^^^should be {0,1}" );

	System.out.println( a.sum13(test) );
	System.out.println( "^^^should be 3" );

    }
}
