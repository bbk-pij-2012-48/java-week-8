public class TreeIntSet implements IntSet {
	
	private IntegerTreeNode first;
	
	public TreeIntSet(int n) {
		first = new IntegerTreeNode(n);
	}
	
	public void add(int n) {
		if (first == null) {
			first = new IntegerTreeNode(n);
			return;
		}
		
		if(first.contains(n)) {
			return;
		}
		
		first.add(n);
	}
	
	public boolean contains(int n) {
		if (first == null) {
			return false;
		}
		return first.contains(n);
	}
	
	public boolean containsVerbose(int n) {
		if(first == null) {
			return false;
		}
		return first.containsVerbose(n);
	}
	
	public String toString() { // needs sorting
		if (first == null) {
			return "";
		}
		return first.toString();
	}
	
}
		
		
		
		
