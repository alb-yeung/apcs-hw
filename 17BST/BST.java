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
    }
    
    private Node root;

    public void insert(Node n){
        Node temp = root;
        Node next = temp;
        if (root == null){
            root = n;
        }else{
            if (n.getData()<temp.getData())
                next = temp.getLeft();
            else
                next = temp.getRight();
            while(next!=null){
                temp = next;
                if (n.getData()<temp.getData())
                    next = temp.getLeft();
                else    
                    next = temp.getRight();
            }
            if (n.getData()<temp.getData())
                temp.setLeft(n);
            else
                temp.setRight(n);
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
        }if(c.getData() = x){
            return c;
        }slse{
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
}