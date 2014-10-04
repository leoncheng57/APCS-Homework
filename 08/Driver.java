public class Driver {
    public static void main(String[] args){
        Shapes obj = new Shapes();
	System.out.println(obj.line(5,"*"));
	System.out.println();
	System.out.println("5,4");     
	System.out.println(obj.frame(5,4));
	System.out.println("5,0");     
	System.out.println(obj.frame(5,0));
	System.out.println("1,4");     
	System.out.println(obj.frame(1,4));
	System.out.println("4,1");     
	System.out.println(obj.frame(4,1));
	System.out.println("0,4");
	System.out.println(obj.frame(0,4));

	System.out.println();
	System.out.println(obj.stringSplosion("Hello"));

	System.out.println();
	System.out.println(obj.stringX("xaxxxxxxbcx"));


    }
}


