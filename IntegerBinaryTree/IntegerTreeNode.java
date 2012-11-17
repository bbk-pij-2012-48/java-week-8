public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(int value) {
		this.value = value;
		left = null;
		right = null;
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
	
	public String toString() {
		String dst = "[" + value;
		if(left != null) {
			dst += " " + left.toString();
		}
		
		if(right != null) {
			dst += " " + right.toString();
		} 
		
		dst += "]";
		
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
			
}
