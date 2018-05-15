package BTS;
public class main {
	
	
	public static void main(String[] args){
		
		int [] data = {50, 30, 60, 10, 80, 55, 40};
//		int [] data = {50};
		
		Tree t = new Tree();
		
		for(int e : data)
			t.insert(e);
//		t.insert(50);
//		t.insert(30);
//		t.insert(60);
//		
//		Node n = t.find(10);
//		System.out.println(n.key);
//		t.delete(10, t.root);
//		t.find(10);
//		t.delete(55);
//		System.out.println(t.root.key);
//		System.out.println(t.root.rightChild.key);
//		System.out.println(t.root.leftChild.key);
//		System.out.println(t.root.rightChild.rightChild.key);
//		System.out.println(t.root.leftChild.leftChild.key);
		
		System.out.println("Node count is: " + t.count());
		System.out.println("Tree height is: " + t.height());
		System.out.println("The max value is: " + t.maxValue());
		System.out.println("The sum of the nodes is: " + t.sumValue());
		System.out.println("The average of the nodes is: " + t.avgValue());
		System.out.println("The first is a child of the second? " + t.isChildOf(50, 30) + ".");
		System.out.println("The deepest full level is: " + t.maxLevel());
//		System.out.println(t.isChildOf(t.root.rightChild.key,t.root.key ));
		
		System.out.println(t._indexPosPreorder(t.root, 55));
		
		
//		n = t.find(10);
		
		
		
		
	
	}

}
