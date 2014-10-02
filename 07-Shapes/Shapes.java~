

public class Shapes {
    
    //Time taken:10mins
    public String tri1(int r){
	String s= "";
	int row = 0;
	int col;
	while (row<=r){
	    //this while loops prints rows
	    col = 0;
	    while (col<row){ //makes numOfStars==numOfRow
		s = s + "*";
		col=col+1;
	    }

	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    
    //Time taken:40 mins
    public String tri2(int n) {
	String ret = "";
	int row = 1;
	int col;
	while (row<=n) {
	    
	    String printRow=""; //need this to store the strings made for each row
	    col = 0;
	    //following while loop makes numOfStars=numOfRow
	    while (col < row) {
		printRow = printRow+"*";
		col=col+1;
		//System.out.println(printRow+"COLS");
	    }


	    //following while loop adds enough spaces before the line of stars, so that the triangle will "lean to the right"
	    while (col<n) {
		printRow = " " + printRow; //this statement is why I need printRow, not just ret. If I just had ret, the spaces would be behind the entire ret string not just one row
		col=col+1;
		//System.out.println(printRow+"SPACES");
	    }
	    printRow = printRow+"\n";
	    ret = ret+printRow;
	    row=row+1;
	}
	return ret;
    }
	    
}
