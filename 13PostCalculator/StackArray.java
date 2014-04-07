public class StackArray{
	private int[] stack;
	private int size;

	public StackArray(){
		stack = new int[10];
	}

	private void increase(){
		int[] temp = new int[stack.length()*2];
		for (int a = 0;a<stack.length();a++){
			temp[a]=stack[a];
		}
		stack = temp;
	}

	public void push(int data){
		if (size==stack.length()){
			this.increase();
		}
		stack[size]=data;
		size++;
	}

	public int pop(){
		int value = stack[size-1];
		stack[size-1]="";
		size--;
		return value;
	}

	public int peek(){
		return stack[size-1];
	}

}