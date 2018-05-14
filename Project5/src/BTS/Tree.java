package BTS;

public class Tree {
	Node root;

	
	Tree(){
		root = null;
//		root = new Node(data[0]);
//		for(int i = 1; i < data.length; i++){
//			insert(data[i], root);
//		}
	}

	
	Node find(int k){
		return _find(k, root);
	}
	
	
	Node _find(int k, Node r){
		
		if(r == null || r.key == k)
			return r;
		
		if(r.key < k)
			return _find(k, r.rightChild);
		
		return _find(k, r.leftChild);
		
		
		
	}
	
	void insert(int k){
		root = _insert(k, root);
	}
	
	private Node _insert(int k, Node root){
		if(root == null){
			root = new Node(k);
			return root;
		}	
		
		if(k < root.key)
			root.leftChild = _insert(k, root.leftChild);
		else if(k > root.key)
			root.rightChild = _insert(k,root.rightChild);
		
		return root;

	}

	void delete(int k){
		root = _delete(k, root);
	}
	
	private Node _delete(int k, Node r){
		if(r == null)
			return r;
		
		else if(k < r.key)
			r.leftChild = _delete(k, r.leftChild);
		else if(k > r.key)
			r.rightChild = _delete(k, r.rightChild);
		else if(k == r.key){
			 if (r.leftChild == null)
	                return r.rightChild;
	            else if (r.rightChild == null)
	                return r.leftChild;
			
			
			//k is a leaf case
//			if(current.leftChild == null)
			//k has two children
		}
		return r;

	}
	
	int count(){
		return _count(root);
	}
	
	private int _count(Node r){
		int count = 0;
		if(r == null)
			return count;
		
		count += _count(r.leftChild);
		count++;
		count += _count(r.rightChild);
		
		return count;
	}
	

	int height(){
		return _height(root)-1;
	}
	

	
	private int _height(Node r){
		int lheight = 0, rheight = 0;
		if(r == null)
			return 0;
		
		lheight += _height(r.leftChild)+1;
		rheight += _height(r.rightChild)+1;
		if(rheight == 0 && lheight == 0)
			return 1;
		if(rheight < lheight)
			return lheight;
		return rheight;
	}
	
	int maxValue(){
		return _maxValue(root);
	}
	
	private int _maxValue(Node r){
		int max = 0;
		if(r == null)
			return 0;
		while(r.rightChild != null){
			max = r.rightChild.key;
			r = r.rightChild;
		}
		return max;
	}
	
	
	int sumValue(){
		return _sumValue(root);
	}
	
	private int _sumValue(Node r){
		int sum = 0;
		
		if(r == null)
			return 0;
		
		sum += _sumValue(r.leftChild);
		sum += r.key;
		sum += _sumValue(r.rightChild);
		
		return sum;
		
		
	}
	
	double avgValue(){
		return (double)sumValue()/count();
	}
	
		
	boolean isChildOf(int child, int parent){
		return _isChildOf(child, parent);
	}
	
	private boolean _isChildOf(int c, int p){
		Node parent = _find(p,root);
		try{
		Node child = _find(c, parent);
		}catch(Exception e){
			System.out.println("not a match, yo");
			return false;
		}
		
		
		
		return true;
		
	}

	int[] toArray(){
		Node current = root;
		int height = 3;
		int[] newArr = new int[(int) Math.pow(2, height)-1]; //Height is hard coded here. Must complete exercise b 
		
		if(current.leftChild == null){
			
		}else if(current.leftChild != null){
			
		}
		if(current.rightChild == null){
			
		}else if(current.rightChild != null){
			
		}
		
		
		
		
//		int index = 0;
//		int height = 3;
////		System.out.println((int) Math.pow(2, height)-1);
//		int[] newArr = new int[(int) Math.pow(2, height)-1];
//		
//		newArr[index] = current.key;
////		System.out.println(current.rightChild.key);
//		newArr[(index*2)+1] = current.leftChild.key;
//		newArr[(index*2)+2] = current.rightChild.key;
//		
//		
		return newArr;
	}
	

}
