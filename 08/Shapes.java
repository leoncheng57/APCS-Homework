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
	//CODINGBAT PROB: http://codingbat.com/prob/p117334
	public String stringSplosion(String str) {
	    String s = "";
	    //following is done with a while loop
	    int i = 0;
	    while (i<str.length()) {
		s=s+str.substring(0,i+1);
		i=i+1;
	    }

	    //following is done with a for loop
	    /*
	      for (int i = 0; i<str.length(); i = i+1) {
	      s=s+str.substring(0,i+1);
	      }
	    */
	    return s;
	}

	//CODINGBAT PROB: http://codingbat.com/prob/p171260
	public String stringX(String str) {
	    if (str==""){
		return "";
	    }
	    if (str=="x") {
		return "x";
	    }
  
	    String s ="";
	    for (int i = 1; i<str.length()-1; i=i+1) { //letting i = 1 and using str.length()-1 makes this loop ignore the first and last char of the string
		if (str.substring(i,i+1).equals("x") == false){
		    s=s+str.substring(i,i+1);
		}
	    }
	    return str.substring(0,0+1)+s+str.substring(str.length()-1,str.length());
	}
}



