public class StackArray{
    private double[] stack;
    private int size;

    public StackArray(){
	stack = new double[10];
	size = 0;
    }

    private void increase(){
	double[] temp = new double[stack.length*2];
	for (int a = 0;a<stack.length;a++){
	    temp[a]=stack[a];
	}
	stack = temp;
    }

    public void push(double data){
	if (size==stack.length){
	    this.increase();
	}
	stack[size]=data;
	size++;
    }

    public double pop(){
	double value = stack[size-1];
	size--;
	return value;
    }

    public double peek(){
	return stack[size-1];
    }
    
    public boolean isEmpty(){
	return size==0;
    }
    
}