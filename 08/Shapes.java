public class Shapes {
    public String line(int n, String thing){
	String s = "";
	for (int i=0;i<n;i=i+1){
	    s=s+thing;
	}
	return s;
    }
    


    //following function will return a frame/border/perimeter that has dimensions r by c 
    //N: All if statements are there to address the special cases where rORc==1OR2
    public String frame(int r, int c){
   	String s = "";
	//first, add the top line of stars
	if (r>=2){
	    s = s+line(c,"*")+"\n";
	}
	//then add the one star to the front and back of the line (spaces in between)
	for(int i=0; i<r-2; i=i+1){
	    if (c==1){
		s=s+"*";
	    }
	    if (c>=2){
		s=s+"*"+line(c-2," ")+"*";
	    }
	    s=s+"\n";
	}
	//finally, add the last line of stars
	if (r>=1) {
	    s = s+line(c,"*");
	}
	return s;
    }
}



