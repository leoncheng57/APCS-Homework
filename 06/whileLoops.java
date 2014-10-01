public class whileLoops {
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    public String frontTimes(String str, int n) {
	String front = "";
	if (str.length() <= 3) {
	    front = str;
	}
	else {
	    front = str.substring(0,3);
	}
  
  
	String ret = "";
	while (n>0) {
	    ret = ret + front;
	    n = n-1;
	}
	return ret;
    }
    //Took me this much time: 3 mins
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    public String stringBits(String str) {
	String ret = "";
	if (str.equals("")) {return str;} //special case when str==""
	while (str.length() > 2) {
	    ret = ret + str.substring(0,1);
	    str = str.substring(2);
	}
	return ret+str.substring(0,1); //now the string is either one or two chars long, and so we just add the first char and return ret
    }
    //Took me this much time: 6 mins
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    public String stringYak(String str) {
	String front = "";
	while (str.length()>=3) {
	    if (str.substring(0,3).equals("yak")) {
		str = str.substring(3); //removes the "yak"
	    }
	    else {
		front = front + str.substring(0,1); //stores the first char in the String, front
		str = str.substring(1); //takes away the first char from str
	    }
	}  
	return front + str;
    }
    //Time taken on this problem: 20 mins
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    public int stringMatch(String a, String b) {
	int ret = 0;
	while (a.length()>=2 && b.length()>=2){ //if the length goes below 2 chars long, then we no longer need to compare to match "double chars"
	    if (a.substring(0,2).equals( b.substring(0,2) )) ret = ret + 1;
	    a = a.substring(1); //take away the first two chars
	    b = b.substring(1); //take away the first two chars
	}
	return ret;
    }
    //Time spent: 15 mins
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////
}
