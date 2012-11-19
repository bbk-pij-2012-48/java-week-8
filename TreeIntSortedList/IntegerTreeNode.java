public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
		left = null;
		right = null;
	}
	
	public int getValue() {
		return value;
	}
	
	public IntegerTreeNode getRight() {
		return right;
	}
	
	public IntegerTreeNode getLeft() {
		return left;
	}
	
	public void add(int newNumber) {
		if(newNumber > this.value) {
			if(right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}
	
	public boolean contains(int n) {
		if(n == this.value) {
			return true;
		} else if(n > this.value) {
			if(right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}
	
	public boolean containsVerbose(int n) {
		System.out.println(this.value);
		if(n == this.value) {
			return true;
		} else if(n > this.value) {
			if(right == null) {
				return false;
			} else {
				return right.containsVerbose(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.containsVerbose(n);
			}
		}	
	}
	
	public int getMax() {
		if(right == null) {
			return this.value;
		} else {
			return right.getMax();
		}
	}
	
	public int getMin() {
		if(left == null) {
			return this.value;
		} else {
			return left.getMin();
		}
	}
	
	public void prettyPrint() {
		System.out.print("[" + value);
		
		if(left != null) {
			System.out.print(" L");
			left.prettyPrint();
		} else {
			System.out.print(" L[]");
		}
		
		if(right != null) {
			System.out.print(" R");
			right.prettyPrint();
		} else {
			System.out.print(" R[]");
		}
		
		System.out.print("]");
	}
	
	private String toOrderedStringComma() {  // leaves a trailing comma
		String dst = "";
		if (this.left != null) {
			dst += this.left.toOrderedStringComma();
		}
		dst += this.value + ",";
		if (this.right != null) {
			dst += this.right.toOrderedStringComma();
		}
		return dst;
	}
	
	public String toOrderedString() {	// removes the trailing comma
		String dst = this.toOrderedStringComma();
		return dst.substring(0,dst.length()-1);
	}
		
	public String toStringLong() {
		String dst = "[" + value;
		if(left != null) {
			dst += " L" + left.toString();
		} else {
			dst += " L[]";
		}
		
		if(right != null) {
			dst += " R" + right.toString();
		} else {
			dst += " R[]";
		}
		
		dst += "]";
		
		return dst;
	}
	
	public String toString() {		// just prints list separated by commas
		String dst = "" + value;
		if(left != null) {
			dst += "," + left.toString();
		}
		
		if(right != null) {
			dst += "," + right.toString();
		} 
		
		return dst;
	}
	
	public int depth() {
		int count = 0;
		
		if (left != null && right != null) {
			count++;
			count += Math.max(left.depth(), right.depth());
		} else if (left != null) {
			count++;
			count += left.depth();
		} else if (right != null) {
			count++;
			count += right.depth();
		}
		
		return count;
	}
	
	/*
	private IntegerTreeNode find(int n) {
		if (n == value) {
			return this;
		} else if (n < value) {
			return left.find(n);
		} else {
			return right.find(n);
		}
	}
	
	public void remove(int n) {
		find(n).removeTop();
	}
	
	private void removeTop() {
		if (left == null && right == null) {
			this = null; //how can I make this work?
			return;
		}
		//complete
	}
	*/
			
}
