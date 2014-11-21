/**
 * Creates a word search puzzle
 * paired with Kevin Mejia
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


    /* beginning to think about refactoring */
    public void insert(String w, int row, int col, int rowChange, int colChange){
	if (insertCheck(w,row,col,rowChange,colChange)){
	    for (int i=0;i<w.length();i++){
		board[row][col] = w.charAt(i);
		row += rowChange;
		col += colChange;
	    }
	}	
    }

    public boolean insertCheck(String w, int row, int col, int rowChange, int colChange){
	int r = row;
	int c = col;
	boolean ans=true;
	try {
	    for (int i=0;i<w.length();i++){
		ans = ans && (board[r][c]=='.' || board[r][c] == w.charAt(i));
		System.out.println("coordinates: "+r+","+c+ans);
		r+=rowChange;
		c+=colChange;
	    }
	}catch (Exception e) {return false;}
	return ans;
    }
    
    // public boolean insertCheck(String w, int row, int col, int rowChange, int colChange){
    // 	int r = row;
    // 	int c = col;
    // 	boolean ret = true;
    // 	try{
    // 	    for (int i=0;i<w.length();i++){
    // 		if (!(board[r][c]=='.' || board[r][c]==w.charAt(i))){
    // 		    ret = false;
    // 		break;
    // 		}
    // 		r += rowChange;
    // 		c += colChange;
    // 	    }
    // 	}
    // 	catch (Exception e){
    // 	    System.out.println("Failed: "+w+" at "+row+","+col);
    // 	}
    //     if (!ret) System.out.println("Failed: "+w+" at "+row+","+col);
    // 	return ret;
    // }    

    /*----------------MAIN----------------*/
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	
	//Testing  refactoring strategy
	w.insert("bar" , 10,22,1,1);
	w.insert("bar", 15,22,1,-1);
	w.insert("bar",15,22,1,1);
	w.insert("bar",15,22,-1,0);
	w.insert("bar",15,22,0,-1);
	w.insert("friday",12,2,1,1);
	w.insert("porpoise",8,0,1,0);
	w.insert("porpoise",9,0,1,0);
	w.insert("plum",9,0,-1,0);
	w.insert("plum",8,20,0,-1);
   
	
	//line below crashes program
	w.insert("words",99,22,0,-1);
	
	
	System.out.println();
	System.out.println(w);

	
    }
}
