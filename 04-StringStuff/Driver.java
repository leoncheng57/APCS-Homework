public class Driver {
    public static void main(String[] args) {
	Codingbat object1 = new Codingbat();
	System.out.println(object1.mixStart("9ix"));
	System.out.println("^Expected true");
	System.out.println(object1.makeOutWord("<<>>", "leon"));
	System.out.println("^Expected <<leon>>");
	System.out.println(object1.firstHalf("Boohoo"));
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
