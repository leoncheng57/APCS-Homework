/**
 * Creates a word search puzzle
 * paired with Kevin Mejia
 *
 */

import java.util.*;
import java.io.*;

public class WordSearch{
    
    /*------------------INSTANCE VARS-----------------*/
    private char[][] board;
    private boolean wordAdded;
    
    /*------------------CONSTRUCTORS-----------------*/
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}	
    }

    public WordSearch(){
	this(20,30);
    }
    

    /*------------------METHODS-----------------*/
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j]+" ";
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean insertCheck(String w, int row, int col, int rowChange, int colChange){
    	int r = row;
    	int c = col;
    	boolean ans=true;
    	try {
    	    for (int i=0;i<w.length();i++){
    		ans = ans && (board[r][c]=='.' || board[r][c] == w.charAt(i));
    		r+=rowChange;
    		c+=colChange;
    	    }
    	}catch (Exception e) {
	    return false;
	}
	return ans;
    }

    public void insert(String w, int row, int col, int rowChange, int colChange){
	if (insertCheck(w,row,col,rowChange,colChange)){
	    for (int i=0;i<w.length();i++){
		board[row][col] = w.charAt(i);
		row += rowChange;
		col += colChange;
	    }
	    wordAdded = true;
	    System.out.println("Added: "+w);
	}	
	else{
	    wordAdded = false;
	    System.out.println("Failed to add: "+w);
	}
    }

    public boolean addWord(String w){
	Random rnd = new Random();
	int row = rnd.nextInt(board.length);
	int col = rnd.nextInt(board[0].length);
	int rowChange=0;
	int colChange=0;
	while (rowChange==0 && colChange==0){ //prevents the case where only one letter is inserted in one place because the both change == 0
	    rowChange = rnd.nextInt(3)-1;
	    colChange = rnd.nextInt(3)-1;
	}
	System.out.println(rowChange+","+colChange);
	insert(w,row,col,rowChange,colChange);
	return wordAdded;
    }

    public void fillBoard(){
	Random rnd = new Random();
	String alphabet = "qwertyuiopasdfghjklzxcvbnm";
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[i].length;j++){
		if (board[i][j]=='.'){
		    board[i][j] = alphabet.charAt( rnd.nextInt(alphabet.length())  ); 
		}
	    }
	}
	System.out.println(alphabet);
    }	
    /*----------------MAIN----------------*/
    public static void main(String[] args) {
	WordSearch w = new WordSearch();

	// w.insert("bar" , 10,22,1,1);
	// w.insert("bar", 15,22,1,-1);
	// w.insert("bar",15,22,1,1);
	// w.insert("bar",15,22,-1,0);
	// w.insert("bar",15,22,0,-1);
	// w.insert("friday",12,2,1,1);
	// w.insert("porpoise",8,0,1,0);
	// w.insert("porpoise",9,0,1,0);
	// w.insert("plum",9,0,-1,0);
	// w.insert("plum",8,20,0,-1);
	// w.insert("words",99,22,0,-1);
	//w.insert("bar",16,24,0,0); //puts just the last letter into board
	
	
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));

    	System.out.println();
	System.out.println(w);

	w.fillBoard();
	System.out.println();
	System.out.println(w);


	ReadFile rf = new Readfile();
	System.out.println(rf.getWords);
    }
}
