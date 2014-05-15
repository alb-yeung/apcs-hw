public class Heap{

    public Heap(){
	heap = new int[2];
	nextSpot = 1;
	wall = 2;
	min = false;
    }
    public Heap(int a){
	heap = new int[2];
	nextSpot = 1;
	wall = 2;
	min = true;
    }

    private int[] heap;
    private int nextSpot;
    private int wall;
    private boolean min;
    private void increase(){
	int[] temp = new int[heap.length*2];
	for (int i = 0;i<heap.length;i++){
	    temp[i]=heap[i];
	}
	heap = temp;
    }
    private void swap(int loc1, int loc2){
	int temp = heap[loc1];
	heap[loc1]=heap[loc2];
	heap[loc2]=temp;
    }

    public void insert(int a){
	if (nextSpot == heap.length){
	    increase();
	}
	heap[nextSpot]=a;
	int placeat=nextSpot;
	if(!min){
	    while (placeat/2>0 &&
		   heap[placeat/2]<a
		   ){
		swap(placeat,placeat/2);
		placeat /= 2;
	    }
	}else{
	    while (placeat/2>0 &&
		   heap[placeat/2]>a
		   ){
		swap(placeat,placeat/2);
		placeat /= 2;
	nextSpot++;
	wall++;
    }

    public int removeTop(){
	if (nextSpot == 0 || wall == 1)
	    return Integer.MIN_VALUE;
	int max = heap[1];
	swap(1,nextSpot - 1);
	wall = nextSpot - 1;
	int placeat = 1;
	if(!min){
	    while(placeat*2 < nextSpot &&
		  heap[placeat]<heap[placeat*2]
		  ){
		swap(placeat,placeat*2);
		placeat *= 2;
	    }
	}else{
	    while(placeat*2 < nextSpot &&
		  heap[placeat]>heap[placeat*2]
		  ){
		swap(placeat,placeat*2);
		placeat *= 2;
	    }
	}
	nextSpot--;
	wall --;
	return max;
    }

    public String toString(){
	String list = "";
	for (int i = 1;i<heap.length;i++){
	    list += heap[i] + " ";
	}
	return list;
    }
    public int getTop(){
	return heap[1];
    }
    
}