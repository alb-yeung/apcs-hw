public class MyLinkedList{
    private Node head;



    public MyLinkedList(){
	head = null;
    }



    public String toString(){
	String s = "";
	Node temp = head;
	s+=""+temp;
	while(temp.getNext()!=null){
	    temp=temp.getNext();
	    s+=" "+temp;
	}
	return s;
    }



    public void add(int i, String s){
	if (i==0){
	    add(s);
	    return;
	}
	Node temp = head;
	for (int a = 0;a<i;a++){
	    temp = temp.getNext();
	}
	Node newnode = new Node(s);
	newnode.setNext(temp.getNext());
	temp.setNext(newnode);
    }
    public void add(String d){
	Node temp = new Node(d);
	temp.setNext(head);
	head = temp;
    }



    public String get(int i){
	Node temp = head;
	for (int a = 0;a<i;a++){
	    temp = temp.getNext();
	}
	return "" + temp;
    }

    public String set(int i, String s){
	Node temp = head;
	for (int a = 0;a<i;a++){
	    temp = temp.getNext();
	}
	String d = ""+temp;
	temp.setData(s);
	return d;
    }
    public String remove(int i){
	Node temp = head;
	for (int a = 0;a<i-1;a++){
	    temp = temp.getNext();
	}
	String s =""+temp.getNext();
	temp.setNext(temp.getNext().getNext());
	return s;	
    }



    public int find(String s){
	int i = 0;
	Node temp = head;
	do{
	    if ((""+temp).equals(s)){
		return i;
	    }
	    i++;
	    temp=temp.getNext();
	}while(temp!=null&&temp!=head);
	return -1;
    }
    public int length(){
	int i = 0;
	Node temp = head;
	while(temp!=null){
	    i++;
	    temp = temp.getNext();
	}
	return i;
    }
}