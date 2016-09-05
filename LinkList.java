class Node{
	
	public int data;
	public Node next;

	public Node(int val){
		data = val;
		next = null;
	}
	public void setNext(Node node){
		next = node;
	}
	public Node getNext(){
		return next;
	}
	public void setData(int val){
		data = val;
	}
	public int getData(){
		return data;
	}
}

public class LinkList{

	public int length;
	Node head;
	// insert new node at the head
	public void insertHed(Node node){
		if(head == null)
			head = node;
		else{
			node.setNext(head);
			head = node;
		}
		length++;

	}
	// insert in the end
	public void insertEnd(Node node){

		if(head == null)
			head = node;
		else{
			Node p = head;
			while(p.getNext() != null)
				p = p.getNext();
			p.setNext(node);
			node.setNext(null);
		}
		length++;
	}
	//insert new node at position p
	public void insertAtGivenPosition(int data,int pos){

		Node node = new Node(data);
		if(pos <= 1 ){
			insertHed(node);
		}
		if(pos > length){
			insertEnd(node);
		}
		else{
			Node p;
			p = head;
			for(int i = 1; i<pos-1; i++){
				p = p.getNext();
			}
			node.setNext(p.getNext());
			p.setNext(node);
			length++;
		}
	}
	//delete from begining
	public void deleteHead(){
		if(length == 0)
			return;
		else if(length == 1){
			// dispose every node
			head = null;
		}
		else{
			Node tmp;
			tmp = head;
			head = head.getNext();
			tmp.setNext(null);

		}
		length--;
	}
	public void deleteLast(){
		if(length == 0)
			return;
		else if(length == 1)
			//dispose every node
			head = null;
		else{
			Node p, q = null;
			p = head;
			while(p.getNext() != null){
				q = p;
				p = p.getNext();
			}
			q.setNext(null);
			//dispose p
		}
		length--;
	}
	public void deleteAtGivenPosition(int pos){
		if(pos <= 1)
			deleteHead();
		else if(pos >= length)
			deleteLast();
		else{
			Node p,q=null;
			p = head;
			for(int i= 1; i < pos;i++){
				q = p;
				p = p.getNext();
			}
			q.setNext(p.getNext());
			//dispose p
			p.setNext(null);
			length--;
		}
	}
	public Boolean isEmpty(){
		if(length == 0)
			return true;
		return false;
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
		LinkList list = new LinkList();
		Node node1 = new Node(4);
		Node node2 = new Node(5);
		Node node3 = new Node(6);
		Node node4 = new Node(7);
		list.insertHed(node1);
		list.insertEnd(node4);
		list.insertAtGivenPosition(10,2);
		list.insertAtGivenPosition(11,3);
		list.insertAtGivenPosition(12,4);
		int size = list.size();
		System.out.println(size);
		System.out.println("\n");
		list.printList();
		System.out.println("\n");
		list.insertHed(node2);
		list.insertEnd(node3);
		int size1 = list.size();
		System.out.println(size1);
		System.out.println("\n");
		list.printList();
		System.out.println("\n");
		// test delete
		list.deleteHead();
		list.deleteLast();
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