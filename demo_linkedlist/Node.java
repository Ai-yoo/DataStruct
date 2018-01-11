package demo_linkedlist;

public class Node {
	public int element;
//	public Node pre;
	public Node next;
	public Node(){
		
	}
//	public Node(int element,Node pre,Node next){
//		this.element=element;
//		this.pre=pre;
//		this.next=next;
//	}
	public Node(int element,Node next){
		this.element=element;
		this.next=next;
	}
	@Override
	public String toString() {
		return element + "->"+next;
	}
	
	

}
