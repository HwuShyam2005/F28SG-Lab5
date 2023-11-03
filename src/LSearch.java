public class LSearch {


	private class Node {
		private Entry value;
		private Node nextNode;

		public Node(Entry v) {
			value = v;
			nextNode = null;
		}

		public Entry getValue() {
			return value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		// Sets the NextNode to the given Node
		public void setNextNode(Node n) {
			nextNode = n;
		}
	}

	// Holds a reference to the head of the list
	private Node headNode;

	public LSearch() {
		headNode = null;
	}

	public void addAtHead(Entry e) {
		Node newNode = new Node(e); 
		newNode.setNextNode(headNode); 
		headNode = newNode; 
	}
	
	/*
	 * Part 3: complete
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
//DECLARING VARIABLE CURRENT NODE OF TYPE NODE AND INITALIZING TO HEADNODE
		Node currentNode = headNode;
//CREATING A FOR LOOP IN WHICH LOOP CONTINUES UNTILL AND AND UNLESS CURRENTNODE IS NOT NULL
//UPDATES CURRENTNODE AFTER EACH ITERATION TO NEXT NODE IN CURRENTNODE.GETNEXTNODE()
		for (; currentNode != null; currentNode = currentNode.getNextNode()) {
//CHECKS IF NAME OF VALUE RELATED TO CURRENT NODE IN LINKED LIST MATCH NAME			
			if (currentNode.getValue().getName().equals(name)) {
//IF THE MATCH IS FOUND , LINE RETURNS CORRESPONDING NUMBER RELATED WITH NAME IN NODE
		        return currentNode.getValue().getNumber();
		    }
		}

		return -1;
				}
			}