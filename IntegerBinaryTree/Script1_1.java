public class Script1_1 {
	public static void main(String[] args) {
		IntegerTreeNode first = new IntegerTreeNode(6);
		first.add(5);
		first.add(3);
		first.add(9);
		first.prettyPrint();
		System.out.println("\n" + first.toString());
	}
}
