public class ListIntSet implements IntSet {
	private ListIntNode first;
	
	public ListIntSet(int n) {
		first = new ListIntNode(n);
	}
	
	public void add(int n) {
		if (first == null) {
			first = new ListIntNode(n);
		} else {
			first.add(n);
		}
	}
	
	public boolean contains(int n) {
		if (first == null) {
			return false;
		} else {
			return first.contains(n);
		}
	}
	
	public boolean containsVerbose(int n) {
		if (first == null) {
			return false;
		} else {
			return first.containsVerbose(n);
		}
	}
	
	public String toString() {
		if (first == null) {
			return "";
		} else {
			return first.toString();
		}
	}
}
	
	
	
		
