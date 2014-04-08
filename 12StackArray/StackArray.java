public class StackArray{
	private String[] stack;
	private int size;

	public StackArray(){
		stack = new String[10];
	}

	private void increase(){
		String[] temp = new String[stack.length()*2];
		for (int a = 0;a<stack.length();a++){
			temp[a]=stack[a];
		}
		stack = temp;
	}

	public void push(String data){
		if (size==stack.length()){
			this.increase();
		}
		stack[size]=data;
		size++;
	}

	public String pop(){
		String value = stack[size-1];
		stack[size-1]="";
		size--;
		return value;
	}

	public String peek(){
		return stack[size-1];
	}

}