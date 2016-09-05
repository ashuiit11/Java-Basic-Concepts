class Node{
	public int data;
	public Node next;
	public Node previous;

	public Node(int val){
		data = val;
		next = null;
		previous = null;
	}

	public void setNext(Node node){
		next = node;
	}

	public Node getNext(){
		return next;
	}
	public void setPrevious(Node node){
		previous = node;
	}
	public Node getPrevious(){
		return previous;
	}

	public void setData(int val){
		data = val; 
	}
	public int getData(){
		return data;
	}
}
public class DoublyLinkedList{

	public int length;
	Node head;
	public void insertHead(Node node){
		if(head == null)
			head = node;
		else{
			node.setNext(head);
			head.setPrevious(node);
			head = node;
		}
		length++;
	}
	public void insertEnd(Node node){
		if(head == null)
			head = node;
		else{
			Node p = head;
			while(p.getNext() != null)
				p = p.getNext();
			p.setNext(node);
			node.setPrevious(p);
		}
		length++;
	}
	public void insertAtGivenPosition(int val, int pos){
		//System.out.println(length);
		//System.out.println(pos);
		Node node = new Node(val);
		if(pos<=1)
			insertHead(node);
		else if(pos > length)
			insertEnd(node);
		else{
			Node p = head, q = null;
			for(int i = 1; i < pos; i++){
				q = p;
				p = p.getNext();
			}
			node.setNext(p);
			p.setPrevious(node);
			node.setPrevious(p.getPrevious());
			q.setNext(node);
			length++;
		}
	}
	public void deleteHead(){
		if(head == null)
			return;
		else if(length == 1)
			head = null;
		else{
			Node tmp = head;
			head = head.getNext();
			head.setPrevious(null);
			tmp = null;
		}
		length--;
	}
	public void deleteEnd(){
		if(head == null)
			return;
		else if(length == 1)
			head = null;
		else{
			Node p = head, q = null;
			while(p.getNext() != null){
				q = p;
				p = p.getNext();
			}
			q.setNext(null);
			// remove p
			p = null;
		}
		length--;
	}
	public void deleteAtGivenPosition(int pos){
		if(pos <=1)
			deleteHead();
		else if(pos>= length)
			deleteEnd();
		else{
			Node p = head, q = null;
			for(int i= 1; i < pos; i++){
				q = p;
				p = p.getNext();
			}
			q.setNext(p.getNext());
			p.getNext().setPrevious(q);
			p = null;
			length--;
		}
	}
	public Boolean isEmpty(){
		if(length == 0)
			return false;
		else 
			return true;
	}
	public int size(){
		return length;
	}
	public void printList(){
		Node p;
		p = head;
		while(p != null){
			System.out.println(p.data);
			p = p.getNext();
		}
	}

	public static void main(String[] args){
		DoublyLinkedList list = new DoublyLinkedList();

		Node node1 = new Node(4);
		Node node2 = new Node(5);
		Node node3 = new Node(6);
		Node node4 = new Node(7);
		list.insertHead(node1);
		list.insertEnd(node4);
		list.insertAtGivenPosition(10,2);
		list.insertAtGivenPosition(11,3);
		list.insertAtGivenPosition(12,4);
		int size = list.size();
		System.out.println(size);
		System.out.println("\n");
		list.printList();
		System.out.println("\n");
		list.insertHead(node2);
		list.insertEnd(node3);
		int size1 = list.size();
		System.out.println(size1);
		System.out.println("\n");
		list.printList();
		System.out.println("\n");
		// test delete
		list.deleteHead();
		list.deleteEnd();
		int size2 = list.size();
		System.out.println(size2);
		System.out.println("\n");
		list.printList();
		System.out.println("\n");

		list.deleteAtGivenPosition(3);

		int size3 = list.size();
		System.out.println(size3);
		System.out.println("\n");
		list.printList();
		System.out.println("\n");

	}
}