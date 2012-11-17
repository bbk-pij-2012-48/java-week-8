public class Script1_1 {
	public static void main(String[] args) {
		IntegerTreeNode first = new IntegerTreeNode(6);
		first.add(5);
		first.add(3);
		first.add(9);
		first.add(8);
		first.add(11);
		first.add(12);
		first.prettyPrint();
		System.out.println("\n" + first.toString());
		System.out.println(first.depth());
	}
}
