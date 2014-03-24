public class Node{
    private String data;
    private Node next;

    public Node(String d){
	data = d;
    }
    public void setData(String s){
	data = s;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public String toString(){
	return data;
    }
}