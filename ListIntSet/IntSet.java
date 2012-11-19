public interface IntSet {
	
	/**
	* Adds a new int to the set;
	* if it is there already, nothing happens.
	*/
	void add(int n);
	
	/**
	* Returns true if the number is in the set,
	* false otherwise.
	*/
	boolean contains(int n);
	
	/** 
	* Returns the same values as the former method,
	* but for every element that is checked prints
	* its value to screen.
	*/
	boolean containsVerbose(int n);
	
	/**
	* Returns a string with the values of the
	* elements in the set separated by commas
	*/
	String toString();
}
