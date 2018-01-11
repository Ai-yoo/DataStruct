package demo_linkedlist;

/**
 * �������ж�����һ��headͷ�ڵ㣬ʱ���������ͷ������ִ�в��������ʱ��᷽��Щ
 * 
 */

public class LinkedLists {
	private Node n10 = null;
	private Node n8 = null;
	private Node n7 = null;
	private Node n6 = null;
	private Node n5 = null;
	private Node n4 = null;
	private Node n3 = null;
	private Node n2 = null;
	private Node n1 = null;
	private Node head = null;

	public void init() {
		n10 = new Node(10, null);
		n8 = new Node(8, n10);
		n7 = new Node(7, n8);
		n6 = new Node(6, n7);
		n5 = new Node(5, n6);
		n4 = new Node(4, n5);
		n3 = new Node(3, n4);
		n2 = new Node(2, n3);
		n1 = new Node(1, n2);
		head = new Node(0, n1);
	}

	public static void main(String[] args) {
		LinkedLists l = new LinkedLists();
		l.init();
		l.print();// ��������
		System.out.println("���ң�" + l.find(6));
		l.insert(11);
		System.out.println("�������ݺ�" + l.head);
		l.delete(11);
		System.out.println("ɾ����" + l.head);
	}

	/**
	 * ��ӡÿ���ڵ��ֵ
	 */
	public void print() {
		Node star = head;
		while (star != null) {
			System.out.print(star.element + " ");
			star = star.next;
		}
		System.out.println();
	}

	/**
	 * ���ҽ���ֵ
	 */
	public Node find(int a) {
		Node current = n1;
		while (current.element != a) {
			if (current.next == null) {
				return null;
			}
			current = current.next;
		}
		return current;
	}

	/**
	 * ����һ���ڵ㣬����֤������Ȼ����
	 */
	public Node insert(int a) {
		Node n9 = new Node(a, null);
		Node current = head;
		while (current.next != null) {
			if (a < current.element) {
				n9.next = current;
				current.next = n9;
				break;
			}
			if (current.element <= a && current.next.element > a) {
				n9.next = current.next;
				current.next = n9;
				break;
			}
			current = current.next;
		}
		if (current.element < a && current.next == null) {
			n9.next = null;
			current.next = n9;
		}
		return current;
	}

	/**
	 * ɾ��ֵΪa�Ľڵ�
	 */
	public Node delete(int a) {
		Node current = head;
		Node current1 = head.next;
		while (current1.next != null) {
			if (current1.element == a) {
				current.next = current1.next;
				return current;
			}
			current = current.next;
			current1 = current1.next;
		}
		if (current1.next == null) {
			current.next = null;
		}
		return current;
	}

}
