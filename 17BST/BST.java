public class BST{

    public class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int s){
            data = s;
        }

        public Node getRight(){
            return right;
        }
        public Node getLeft(){
            return left;
        }
        public int getData(){
            return data;
        }

        public void setRight(Node n){
            right = n;
        }
        public void setLeft(Node n){
            left = n;
        }
	
	public String toString(){
	    return ""+data;
	}
    }
    
    private Node root;

    public Node getRoot(){
	return root;
    }

    public void insert(int n){
	Node inserting = new Node(n);
        Node temp = root;
        Node next = temp;
        if (root == null){
            root = inserting;
        }else{
            if (inserting.getData()<temp.getData())
                next = temp.getLeft();
            else
                next = temp.getRight();
            while(next!=null){
                temp = next;
                if (inserting.getData()<temp.getData())
                    next = temp.getLeft();
                else    
                    next = temp.getRight();
            }
            if (inserting.getData()<temp.getData())
                temp.setLeft(inserting);
            else
                temp.setRight(inserting);
        }   
    }

    public Node search(int x){
        Node temp = root;
        while(temp!=null && temp.getData()!=x){
            if (x<temp.getData())
                temp = temp.getLeft();
            else
                temp = temp.getRight();
        }
        return temp;
    }
    public Node searchParent(int x){
	if(x==root.getData()){
	    return root;
	}
        Node temp = root;
        while(temp!=null && temp.getRight().getData()!=x && temp.getLeft().getData()!=x){
            if (x<temp.getData())
                temp = temp.getLeft();
            else
                temp = temp.getRight();
        }
        return temp;
    }

    public Node rsearch(Node c,int x){
        if(c==null){
            return c;
        }if(c.getData() == x){
            return c;
        }else{
            if (x<c.getData()){
                return rsearch(c.getLeft(),x);
            }else{
                return rsearch(c.getRight(),x);
            }
        }
    }

    public void remove(int x){
        Node parent = searchParent(x);
        Node removing = search(x);
        //How many children
        int children = 0;
        if (removing.getLeft()!=null){
            children ++;
        }
        if (removing.getRight()!=null){
            children ++;
        }
        //If 1 or 0
        if (children < 2){
            if (parent.getLeft().equals(removing)){
                if (removing.getLeft()==null){
                    parent.setLeft(removing.getRight());
                }else{
                    parent.setLeft(removing.getLeft());
                }
            }else{
                if (removing.getLeft()==null){
                    parent.setRight(removing.getRight());
                }else{
                    parent.setRight(removing.getLeft());
                }
            }
        }else{//If 2 children
        //Search for largest
            
        }
    }

    public void traverse(){
	traverse(root);
    }
    public void traverse(Node c){
	//Base case
	if (c==null){
	    return;
	}
	//Print
	//traverse(c.getRight());
	traverse(c.getLeft());
	//System.out.println(c);
	//traverse(c.getLeft());
	traverse(c.getRight());
	System.out.println(c);
    }

    public static void main(String[]args){
	BST tree = new BST();
	tree.insert(5);
	tree.insert(8);
	tree.insert(4);
	tree.insert(2);
	tree.insert(3);
	tree.insert(7);
	tree.insert(10);
	tree.insert(1);
	//System.out.println(tree.getRoot());
	tree.traverse();
	System.out.println();
	System.out.println();
	tree.remove(1);
	tree.traverse();
	//tree.remove(5);
	//System.out.println(tree.getRoot());
    }
}