package demo_stack;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stacks s=new Stacks();
		long begin=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			s.insertStack("111111111111222222222222"+i);
		}
		long end=System.currentTimeMillis();
		System.out.println(end-begin);
		Stack<String> s1=new Stack<String>();
		long begin1=System.currentTimeMillis();
		for(int i=0;i<10000;i++){
			s1.push("111111111111222222222222"+i);
		}
		long end1=System.currentTimeMillis();
		System.out.println(end1-begin1);
	}
	
}
