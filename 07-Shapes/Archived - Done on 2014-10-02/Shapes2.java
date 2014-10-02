public class Shapes2 {
    public String tri1(int h) {
	int row = 0;
	int i;
	String s = "";
	for (row=row;row<=h;row=row+1){
	    for (i=0;i<row;i=i+1){
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }

    public String tri2(int h) {
	int row = 1;
	int i;
	String s = "";	
	for (row=row;row<=h;row=row+1){
	    //below loop generates one row of spaces
	    for (i=1;i<=(h-row);i=i+1){
		s=s+" ";
	    }
	    //below loop generates stars
	    for (i=i;i<=h;i=i+1){
		s=s+"*";
	    }
	    s = s+"\n";
	}	    
	return s;
    }

    public String tri3(int h){
	int row = 1;
	int i;
	String s = "";
	int rowLength = h;
	for (row=row;row<=h;row=row+1){
	    for (i=1;i<=h-row;i=i+1){
		s=s+" ";
	    }
	    for (i=i;i<=rowLength;i=i+1){
		s=s+"*";
	    }
	    rowLength=rowLength+1; //rowLength just increases by one for each row, so the number of stars in each row increases by one each time. Otherwise, this is the same as tri2
	    s=s+"\n";
	}
	return s;
    }

    //gameplan:make the space triangle, then the star triangle
    public String tri4(int h){
	String s = "";
	int i;
	int row = 1;
	
	for (row=row;row<=h;row=row+1){
	    //makes spaces in a row
	    for (i=1;i<row;i=i+1){
		s=s+" ";
	    }
	    //makes stars in a row
	    for (i=0;i<=h-row;i=i+1){
	    s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }

    public String diamond(int h) {
	String s = "";
	int row = 1;
	int i;
	int rowLength = h;
	//top half of triangle, including the middle row
	for (row=row;row<h;row=row+1){
	    for (i=1;i<=h-row;i=i+1){
		s=s+" ";
	    }
	    for (i=i;i<=rowLength;i=i+1){
		s=s+"*";
	    }
	    rowLength=rowLength+1;
	    s=s+"\n";
	}
	rowLength=rowLength-1;
	//bottom half of triangle
	for (row=row;row<=2*(h-1)-1;row=row+1){
	    //space part
	    for (i=0;i<=row-h+1;i=i+1){
		s=s+" ";
	    }
	    //star part
	    rowLength=rowLength-1;
	    for (i=i;i<rowLength;i=i+1){
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }
}



