public class ListIntNode {
	
	private int value;
	private ListIntNode next;
	
	public ListIntNode(int value) {
		this.value = value;
		next = null;
	}
	
	public ListIntNode getNext() {
		return next;
	}
	
	public void setNext(int value) {
		next = new ListIntNode(value);
	}
	
	public int getValue() {
		return value;
	}
	
	public void add(int n) {
		if (this.getNext() == null) {
			this.setNext(n);
		} else {
			this.getNext().add(n);
		}
	}

	public boolean contains(int n) {
		if (this.value == n) {
			return true;
		} else if (this.getNext() != null) {
			return this.getNext().contains(n);
		}
		return false;
	}
	
	public boolean containsVerbose(int n) {
		System.out.println(this.value);
		if (this.value == n) {
			return true;
		} else if (this.getNext() != null) {
			this.getNext().containsVerbose(n);
		}
		return false;
	}
	
	private String toStringComma() {		// returns string with a comma at end
		String dst = this.value + ",";
		if (this.getNext() != null) {
			dst += this.getNext().toStringComma();
		}
		return dst;
	}		
	
	public String toString() {
		String dst = this.toStringComma();
		//System.out.println(dst); //*************************************************************************************
		return dst.substring(0,dst.length()-1); // removes final comma for neatness
	}		
}
