public class TreeIntSortedList implements IntSortedList {
	private IntegerTreeNode first;
	
	public TreeIntSortedList(int n) {
		first = new IntegerTreeNode(n);
	}
	
	public void add(int n) {
		if (first == null) {
			first = new IntegerTreeNode(n);
			return;
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
	
	public String toString() {
		if (first == null) {
			return "";
		} else {
			return first.toOrderedString();
		}
	}
}
