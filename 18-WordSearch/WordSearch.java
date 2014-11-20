/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private char[][] board;

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

    public void addWordH(String w, String direction, int row, int col){
	int r = row, c = col;
	boolean doesNotOverlap = true;

	for (int i=0;i<w.length();i++){
	    if (r>=board.length){
		doesNotOverlap = false;
		break;
	    }
	    if (c>=board[r].length){
		doesNotOverlap = false;
		break;
	    }	
	    if (board[r][c]!='.') {
		doesNotOverlap = false;
		break;
	    }
	    c++;
	}

	System.out.println(doesNotOverlap);

	r = row;
	c = col;
	if (direction == "f"){ 
	    if (doesNotOverlap){
		for (int i=0;i<w.length();i++){
		    board[r][c] = w.charAt(i);
		    c++;
		}
	    }
	}
	if (direction == "b") {
	    if (doesNotOverlap){
		for (int i=w.length()-1;i>=0;i--){
		    board[r][c] = w.charAt(i);
		    c++;
		}
	    }
	}
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello", "f", 3,5);
	w.addWordH("look", "f",3,8);
	w.addWordH("look", "f",11,7);
	w.addWordH("look", "f",99,7);
	w.addWordH("look", "f",2,99);
	w.addWordH("look", "f",1,29);
	w.addWordH("look", "b",2,5);
	w.addWordH("look", "b",7,6);
	w.addWordH("look", "b",1,1);
	w.addWordH("look", "bleh",1,1);
	//w.addWordH("hello",100,5);
	//w.addWordH("hello",30,555);
				
	System.out.println(w);
    }
}
