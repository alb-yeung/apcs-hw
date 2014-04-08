import java.util.*;
import java.io.*;

public class RPNCalc{

    public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	StackArray stack = new StackArray();
	while(true){
	    String temp = input.next();
	    if(temp.equals("+")){
		double ans = stack.pop()+stack.pop();
		System.out.println(ans);
		stack.push(ans);
	    }
	    else if(temp.equals("-")){
		double ans = (-1*stack.pop())+stack.pop();
		System.out.println(ans);
		stack.push(ans);
	    }
	    else if(temp.equals("*")){
		double ans = stack.pop()*stack.pop();
		System.out.println(ans);
		stack.push(ans);
	    }
	    else if(temp.equals("/")){
		double a = stack.pop();
		double b = stack.pop();
		double ans = b/a;
		System.out.println(ans);
		stack.push(ans);
	    }
	    else{
		stack.push(Float.parseFloat(temp));
	    }
	}
    }

}