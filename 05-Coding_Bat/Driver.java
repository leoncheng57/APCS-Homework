public class Driver {
    
    public static void main(String[] args){
	
	StringStuff g1 = new StringStuff();
	//System.out.println(g1);
	
	System.out.println(  g1.nonStart("honey","bee")  );
	System.out.println("^oneybee" );
	
	System.out.println(  g1.makeAbba("Happy","Sad")  );
	System.out.println("^HappySadSadHappy");
	
	System.out.println(  g1.diff21(50) );
	System.out.println("^58");

	//Code below is for Wednesday's classwork
	System.out.println( g1.nearHundred(120) );
	System.out.println("^false");

	System.out.println( g1.mixStart("six") );
	System.out.println("^true");

	System.out.println( g1.teaParty(1,1) );
	System.out.println("^0");

	System.out.println( g1.lastDigit(34,243,44) );
	System.out.println("^true");

    }
}
