public class ASearch {


	private Entry[] catalogue;
	private int current;
	
	/*
	 * Assume 10 entries
	 */
	public ASearch(){
		catalogue = new Entry[10];
		current = 0;
	}
	
	/*
	 * Ignores adding if full (should really be handled by exception...)
	 */
	public void addEntry(Entry e){
		if(current < 10){
			catalogue[current++] = e;
		}
	}
	
	/*
	 * Part 2: complete implementation
	 */
	/**
	 * Uses linear search to look up a given name in the catalogue and returns the
	 * number if the name is in the catalogue. Otherwise it returns -1.
	 * 
	 * TODO Where N is the number of entries in the catalogue the (worst case) complexity is:
	 *
	 * O(?)
	 *  
	 * @param name is the person name to look for in the catalogue
	 * @return the number of that person, otherwise -1 to indicate an error
	 */
	
	
	public int linearSearch(String name){
//INITIALIZING A VARIABLE I WITH VALUE 0
//WHILE CONDITION I LESS THAN THE CURRENT VALUE IS TRUE , THE LOOP ITERATE THROUGH THE ARRAY CATALOGUE		
		int i = 0;
		while (i < current) {
//CHECKING THE NAME OF INDEX I IN THE CATALOGUE ARRAY MATCHES IN TARGET NAME
//IF THE MATCH IS FOUND , LINE RETURNS NUMBER ASSOCIATED WITH NAME PRESENT IN CATALOGUE			
		    if (catalogue[i].getName().equals(name)) {
		        return catalogue[i].getNumber();
		    }
		    i++;
		}

		return -1;
	}
	
	
	/*
	 * Part 4: complete implementation
	 */
	/**
	 * Uses binary search to look up a given name in the catalogue and returns the
	 * number if the name is in the catalogue. Otherwise it returns -1.
	 * 
	 * TODO Where N is the number of entries in the catalogue the (worst case) complexity is:
	 *
	 * O(?)
	 *  
	 * @param first the array index of the start of search space
	 * @param last the array index of the end of the search space
	 * @param name the person name being searched for
	 * @return the persons phone number if their name is found or -1 otherwise
	 */
	
	
	private int binarySearch(int first,int last,String name){
//CHECKING IF VALUE OF FIRST IS LESS THAN OR EQUAL TO LAST
		if (first <= last) {
//CHECKING MIDDLE INDEX BY ADDING FIRST TO THE HALF OF DIFFERENCE OF LAST AND FIRST		    
			int middle = first + (last - first) / 2;
//CHECKS NAMES OF THE MIDDLE INDEX OF CATALOGUE ARRAY MATCHES THE NAME TARGET
//IF ITS TRUE , IT RETURNS THE NUMBER SIMILAR TO NAME IN CATALOGUE 			
		    if (catalogue[middle].getName().equals(name)) {
		        return catalogue[middle].getNumber();
		    } 
//CHECKS IF MIDDLE INDEX NAME IS LESS THAN THE TARGET NAME
//IF NAME IN MIDDLE INDEX IS LESS THAN TARGET NAME , IT UPDATES FIRST VARIABLE AND SEARCHES IN RIGHT SIDE
//ELSE IT UPDATES LAST VARIABLE TO CONTINUE THE SEARCH IN LEFT HAND 	    
		    if (catalogue[middle].getName().compareTo(name) < 0) {
		        first = middle + 1;
		    } else {
		        last = middle - 1;
		    }
//AFTER UPDATING EITHER FIRST OR LAST , METHOD CALLS RECURSIVELY ITSELF WITH THE NEW RANGE TO CONTINUE THE SEARCH 
		    return binarySearch(first, last, name);
		}

		return -1;
	}


	// helper method exposed to the programmer
	public int binarySearch(String name){
		return binarySearch(0,current-1,name);
	}
	
	
}
