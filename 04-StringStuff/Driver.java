public class Driver {
    public static void main(String[] args) {
	Codingbat object1 = new Codingbat();
	Codingbat.mixStart("9ix");
	System.out.println("^Expected true");
	Codingbat.makeOutWord("<<>>", "leon");
	System.out.println("^Expected <<leon>>");
	Codingbat.firstHalf("Boohoo");
	System.out.println("^Expected Boo");
    }
}

/*
NOTE: This Driver file does not work. I'm not sure why

I get errors like this: error: non-static method mixStart(String) cannot be referenced from a static context
        Codingbat.mixStart("9ix");
                 ^
But the code in Codingbat.java worked on Codingbat
*/
