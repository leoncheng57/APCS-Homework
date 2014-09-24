public class StringStuff {

////////////////////////////////////////////////////////////////////////
//Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". 
////////////////////////////////////////////////////////////////////////
    public String nonStart(String a, String b) {
	a = a.substring(1);
	b = b.substring(1);
	return a+b;
    }

////////////////////////////////////////////////////////////////////////
//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1. 
////////////////////////////////////////////////////////////////////////
    public String makeAbba(String a, String b) {
	return a+b+b+a;
    }

////////////////////////////////////////////////////////////////////////
//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 
////////////////////////////////////////////////////////////////////////
    public int diff21(int n) {
	int absDiff = 21 - n; //just takes the diff, whether the diff is pos or neg
	if (absDiff < 0) absDiff = -1*absDiff; //makes absDiff pos if it was neg
  
	if (n > 21) return 2*absDiff;
	else return absDiff;
  

//assignments on Wed
/* working */
    public boolean nearHundred(int n) {
	if ((n>=90) && (n<=110)) return true;
	if ((n>=190) && (n<=210)) return true;
	else return false;
    }
/* working */
    public boolean mixStart(String str) {
	if (str.length() < 3) return false;
	if (str.substring(1, 3).equals("ix")) 
	    {return true;
	    }
	else
	    {return false;
	    }
    }
/* working */
    public int teaParty(int tea, int candy) {
 
	if ((tea < 5) || (candy < 5)) return 0;
	if (((tea / 2) >= candy) || ((candy / 2) >= tea)) return 2;
	else return 1;
    }
/* working */
    public boolean lastDigit(int a, int b, int c) {
	a = a % 10;
	b = b % 10;
	c = c % 10;
	if ( (a == b) || (a == c) || (b == c) ) return true;
	else return false;
    }



    }
}
