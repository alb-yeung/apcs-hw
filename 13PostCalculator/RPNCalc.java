import java.util.*;
import java.io.*;

public class RPNCalc{

	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		StackArray stack = new StackArray();
		//Stack of ints
		while(1==1){//Keeps loop running w/o recursion
			String temp = input.next();
			if(temp=="+"){
				int ans = stack.pop()+stack.pop();
				System.out.println(ans);
				stack.push(ans);
			}
			else if(temp=="-"){
				int ans = (-1*stack.pop())+stack.pop();
				System.out.println(ans);
				stack.push(ans);
			}
			else if(temp=="*"){
				int ans = stack.pop()*stack.pop();
				System.out.println(ans);
				stack.push(ans);
			}
			else if(temp=="/"){
				int ans = (1/stack.pop())*stack.pop()
				System.out.println(ans);
				stack.push(ans);
			}
			else{
				stack.push(Integer.parseInt(temp));
			}
		}

	}

}