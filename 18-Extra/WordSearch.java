import java.util.*;
import java.io.*;

/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{
    private char[][] board,key;
    private ArrayList<String> words;
    private ArrayList<String> wordsInPuzzle;
    private Random rnd;
    
    public WordSearch(int r, int c){
	rnd = new Random();
	words = new ArrayList<String>();
	Scanner sc = null;
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open wordlist");
	    System.exit(0);
	}
	while (sc.hasNext()){
	    words.add(sc.next());
	}
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    public WordSearch(){
	this(30,30);
    }

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
		
    public boolean addWordHelper(String w,int row, int col,int deltaRow, int deltaCol){
	int r = row, c = col;
	for (int i=0;i<w.length();i++){
	    try {
		if (board[r][c]!='.' && board[r][c]!=w.charAt(i)){
		    return false;
		}
	    } catch ( Exception e){
		return false;
	    }
	    r = r + deltaRow;
	    c = c + deltaCol;
	}
	r = row;
	c = col;
	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    r = r + deltaRow;
	    c=c+deltaCol;
	}
	return true;
    }

    
    public boolean addWord(String w) {
	int row = rnd.nextInt(board.length);
	int col = rnd.nextInt(board[0].length);
	int deltaRow = -1 + rnd.nextInt(3);
	int deltaCol = -1 + rnd.nextInt(3);
	if (deltaRow == deltaCol && deltaCol == 0)
	    return false;
	return addWordHelper(w,row,col,deltaRow,deltaCol);
    }

    /**
     * copy a board with words in it to key which will be the answer key
     *
     */
    private void makeKey(){
	key = new char[board.length][board[0].length];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		key[i][j] = board[i][j];
	    }
	}
    }
		
    public void buildPuzzle(int numwords){
	/*
	  loop 
	  take a random word out of the word list
	  try to add it to the puzzle
	*/
	wordsInPuzzle = new ArrayList<String>();
	while (numwords > 0){
	    int wordIndex = rnd.nextInt(words.size());
	    String word = words.get(wordIndex);
	    if (addWord(word)) {
		numwords--;
		words.remove(wordIndex);
		wordsInPuzzle.add(word);
	    }
	}
	makeKey();
	/* fill the rest of the board */
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		if (board[i][j]=='.'){
		    /* method 2 */
		    String letters = "abcdefghijklmnopqrstuvwxyz";
		    char letter = letters.charAt(rnd.nextInt(letters.length()));
		    board[i][j]=letter;
		    /* method 1
		       int offset = rnd.nextInt(26);
		       board[i][j]=(char)((int)'a'+offset);
		    */
		}
	    }
	}
    }

    public String getWIP() {
	return wordsInPuzzle.toString();
    }

    public String getKey() {
	String s = "";
	for (int i = 0; i < key.length; i++) {
	    for (int j = 0; j < key[i].length; j++) {
		s = s + key[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }


    //-------------------------ATTEMPTED TO RETURN THE BOARD WITH THE MOST OVERLAPPIGN WORDS
    public void clearBoard(){
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[0].length;j++){
		board[i][j] = '.';
	    }
	}
    }
    public int numOfDots(char[][] sampleBoard){
	int count = 0;
	for (int i=0;i<sampleBoard.length;i++){
	    for (int j=0;j<sampleBoard[0].length;j++){
		if (sampleBoard[i][j] == '.') count++;
	    }
	}
	return count;
    }
    public void mostOverlap(int numwords, int repeat){
	Object[] storeBoards = new Object[repeat];

	wordsInPuzzle = new ArrayList<String>();
	while (numwords > 0){
	    int wordIndex = rnd.nextInt(words.size());
	    String word = words.get(wordIndex);
	    if (addWord(word)) {
		numwords--;
		words.remove(wordIndex);
		wordsInPuzzle.add(word);
	    }
	}
	storeBoards[0] = board;
	System.out.println(toString());

	ArrayList<String> WIP = wordsInPuzzle;
	for (int i=0;i<repeat;i++){
	    clearBoard();
	    for (int j=0;j<WIP.size();j=j){
		if (addWord(WIP.get(j))){
		    j++;
		}
	    }
	    System.out.println(board);
	    System.out.println(toString());
	    System.out.println(i);
	    if (i==1) {
		final char[][] temp1 = board;  
		storeBoards[1] = temp1;
	    }
	    if (i==2){
		final char[][] temp2 = board;
		storeBoards[2] = temp2;
	    }
	    if (i==3) {
		final char[][] temp3 = board;
		storeBoards[3] = temp3;
	    }
	}
	
	for (int i=0;i<storeBoards.length;i++){
	    System.out.println(storeBoards[i]);
	    System.out.println(numOfDots((char[][])storeBoards[i]));
	}

	char[][] winner = (char[][])storeBoards[0];
	for (int i=0;i<storeBoards.length;i++){
	    if (numOfDots((char[][])storeBoards[i])>numOfDots(winner)){
		winner = (char[][])storeBoards[i];
	    }
	}
	board = winner;
    }

    


    /*------------------MAIN----------------*/
    public static void main(String[] args) {
	WordSearch w = new WordSearch(10,40);
	//System.out.println(w);
	//w.buildPuzzle(5);
	//System.out.println(w);
	//System.out.println(w.getWIP());
	//System.out.println(w.getKey());
	w.mostOverlap(40,3);
	System.out.println(w);
    }
}
