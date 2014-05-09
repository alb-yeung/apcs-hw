public class HeapSort{

    public static void main(String[]args){
	Heap List = new Heap();
	List.insert(5);
	System.out.println(List);
	System.out.println();
	List.insert(9);
	System.out.println(List);
	System.out.println();
	List.insert(70);
	System.out.println(List);
	System.out.println();
	List.insert(7);
	System.out.println(List);
	System.out.println();
	List.insert(1);
	System.out.println(List);
	System.out.println();
	int w = List.removeTop();
	while(w != Integer.MIN_VALUE){
	    System.out.print(w + " ");
	    w = List.removeTop();
	}
	System.out.println();
    }

}