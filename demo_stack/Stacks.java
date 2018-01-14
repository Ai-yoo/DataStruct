package demo_stack;

import java.util.LinkedList;
import java.util.List;

public class Stacks {
	public int i=0;
	public List<String> list=new LinkedList<String>();
	public void insertStack(String url){
		list.add(i, url);
		i++;
	}
	public String outStack(){
		String a=list.get(0);
		list.remove(0);
		i--;
		return a;
	}
	public boolean contains(String url){
		return url.contains(url);
	}
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
}
