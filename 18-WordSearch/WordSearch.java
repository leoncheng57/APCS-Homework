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
		s = s + board[i][j];
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
	    ans = false;
	}
	if (ans == true){
	    wordAdded = true;
	    System.out.println("Added: "+w);
	    return ans;
	} else{
	    wordAdded = false;
	    System.out.println("Failed to add: "+w);
	    return ans;
	}
    }

    public void insert(String w, int row, int col, int rowChange, int colChange){
	if (insertCheck(w,row,col,rowChange,colChange)){
	    for (int i=0;i<w.length();i++){
		board[row][col] = w.charAt(i);
		row += rowChange;
		col += colChange;
	    }
	}	
    }

    public boolean addWord(String w){
	char[][] copyboard = board;
	Random rnd = new Random();
	int row = rnd.nextInt(board.length);
	int col = rnd.nextInt(board[0].length);
	int rowChange = rnd.nextInt(3)-1;
	int colChange = rnd.nextInt(3)-1;
	insert(w,row,col,rowChange,colChange);
	return wordAdded;
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
	
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("hola"));
	// System.out.println(w.addWord("bueno"));
	// System.out.println(w.addWord("estupendo"));
	
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));
	// System.out.println(w.addWord("defenestrate"));


	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));	System.out.println(w.addWord("hola"));System.out.println(w.addWord("hola"));
	
	System.out.println(w.addWord("byE"));
	
	System.out.println(w.addWord("byE"));
		
	
	System.out.println();
	System.out.println(w);

	
    }
}
