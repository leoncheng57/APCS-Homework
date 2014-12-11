public class Search{
    public Comparable isearch(ArrayList<Comparable> a,Comparable value){
	for (int i=0;i<a.size();i++){
	    if (a.get(i)==value){
		return value;
	    }
	}
	return null;
    }

    public static void main(String[] args){
	
    }
}

/*
  search should return the value it found (also the place of it?)
  return null if not found
*/
