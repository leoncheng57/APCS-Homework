/*
"Write a program just consisting of Driver.java. In the main routine, assign a String variable to a value consisting of a first and last name, all lower case with only one space between the first and last: ...

Add code to do the following:

Use indexOf to find the location of the space
Make a new String that's just the first name
Make a new String that's just the last name
 */

public class Driver{

     public static void main(String []args){

         String s = "leon cheng";
         //System.out.println(s.length());

         int space = s.indexOf(" ");
         //System.out.println(space);

         String firstName = s.substring(0,space);
         System.out.println(firstName);

         String lastName = s.substring(space+1);
         System.out.println(lastName);
     }
}
