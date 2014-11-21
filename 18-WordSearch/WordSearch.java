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

    /* reverses the ordering of letters in the String */
    public String reverseWord(String w){
	String ret = "";
	for (int i=w.length()-1;i>=0;i--){
	    ret = ret + w.charAt(i);
	}
	return ret;
    }

    /* with _F it means in the forward word direction/orientation */
    public boolean canAdd_F(String w , int row, int col) {
	boolean ans = true; 
	int x = row;
	int y = col;
	try{
	    for(int i =0;i<w.length();i++) {
		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
		y++;
	    }
	    return ans;}
	catch(Exception e) {
	    System.out.println("horizontalForw: "+w+" at "+row+","+col);
	    ans = false;
	}
	if (!ans) System.out.println("horizontalForw: "+w+" at "+row+","+col);
	return ans;
    }
    
    public void addWordH_F(String w,int row, int col){
	int r = row, c = col;
	if (  (canAdd_F(w,row,col)) ) {
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c++;
	    }
	}
    }
    
    /* with _B it means in the backward word direction/orientation */
    public boolean canAdd_B(String w , int row, int col) {
	boolean ans = true; 
	int x = row;
	int y = col;
	try{
	    for(int i =0;i<w.length();i++) {
		ans = (ans && ( (board[x][y] == '.')||( board[x][y]==w.charAt(i) )  )    );
		y--;
	    }
	    return ans;}
	catch(Exception e) {
	    System.out.println("horizontalBack: "+w+" at "+row+","+col);
	    ans = false;
	}
	if (!ans) System.out.println("horizontalBack: "+w+" at "+row+","+col);
	return ans;
    }
    
    public void addWordH_B(String w,int row, int col){
	int r = row, c = col;
	if (  (canAdd_B(w,row,col)) ) {
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c--;
	    }
	}
    }


    /* VERTICAL */
    public boolean checkVertical(String w, int row, int col){
	int r = row;
	int c = col;
	boolean ret = true;
	try{
	    for (int i=0;i<w.length();i++){
		if (!(board[r][c]=='.' || board[r][c]==w.charAt(i))){
		    ret = false;
		}
		r++;
	    }
	}
	catch (Exception e){
	    System.out.println("vertical: "+w+" at "+row+","+col);
	}
        if (!ret) System.out.println("vertical: "+w+" at "+row+","+col);
	return ret;
    }

    public void addVerticalDown(String w, int row, int col){
	if (checkVertical(w,row,col)){
	    for (int i=0;i<w.length();i++){
		board[row][col] = w.charAt(i);
		row++;
	    }
	}
    }

    public void addVerticalUp(String w,int row, int col){
	w = reverseWord(w);
	addVerticalDown(w, row,  col);
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
	boolean ret = true;
	try{
	    for (int i=0;i<w.length();i++){
		if (!(board[r][c]=='.' || board[r][c]==w.charAt(i))){
		    ret = false;
		}
		r += rowChange;
		c += colChange;
	    }
	}
	catch (Exception e){
	    System.out.println("Failed: "+w+" at "+row+","+col);
	}
        if (!ret) System.out.println("Failed: "+w+" at "+row+","+col);
	return ret;
    }    

    /*----------------MAIN----------------*/
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w);
	//forward
	w.addWordH_F("hello",3,5);
	w.addWordH_F("porcupine",9,0);
	w.addWordH_F("smash",2,1);
	w.addWordH_F("brothers",2,6);
	w.addWordH_F("alabama",5,0);
	w.addWordH_F("mammal",5,5);

	w.addWordH_F("look",3,8);//should change nothing
	w.addWordH_F("look",3,5);//is legal because of similar letter placement
	//	not working, out of index... 
	w.addWordH_F("hello",100,5);
	w.addWordH_F("hello",30,555);
	//backward
	w.addWordH_B("hello",0,9);
	w.addWordH_B("racecar",11,20);
	w.addWordH_B("bar" , 11,22);
	w.addWordH_B("bar" , 9999,22);
	w.checkVertical("bar" , 9999,22);
	w.addVerticalDown("bar" , 1,22);
	w.addVerticalUp("bar" , 9,22);
	
	//Testing  refactoring strategy
	w.insert("bar" , 10,22,1,1);
	w.insert("bar", 15,22,1,-1);
	w.insert("bar",15,22,1,1);
	w.insert("bar",15,22,-1,0);
	w.insert("bar",15,22,0,-1);
	
	//line below crashes program
	//w.insert("words",99,22,0,-1);

	
	System.out.println();
	System.out.println(w);

	
    }
}
