package DataStructure;

public class SinglyLinkedList {
	private ListNode head;//Head node to hold the list
	
	// Given a listNode,print all element it hold
	public void display(ListNode head)
	{
		if(head==null)
		{
			return;
		}
		ListNode current=head;
		// loop each element till end of the list
		// last node points to null
		while(current!=null)
		{
			System.out.print(current.data+" --> ");//print current element's data
			// move to next element
			current=current.next;
			}
		//System.out.println(current);//here current will be null
	}
	
	
	
	// It contains a static inner class ListNode 
	private static class ListNode {
		private int data;
		private ListNode next;
		public ListNode (int data) {
			this.data =data;
			this.next=null;
		}
		}
	//7.insert a node after a given node
	public static void insertAfter(ListNode previous,int data) {
		if(previous==null) {
			System.out.println("The given previous node cannot be null");
		return;
		}
		ListNode newNode=previous.next;
		previous.next=newNode;
	}
	//insert a node in beginning 
	public ListNode insertingBeginning(ListNode head,int data) {
		ListNode newNode=new ListNode(data);
		if(head==null) {
			return newNode;
		}
		newNode.next=head;
		head=newNode;
		return head;// this head will be new head,having new node at beginning.
		
	}
	public ListNode insertAtEnd(ListNode head,int data)
	{
		ListNode newNode=new ListNode(data);
		if(head==null) {
			return newNode;
		}
		ListNode current=head;
		while(null!=current.next) {
			current=current.next;
		}
		current.next=newNode;
		return head; 
	}
	// given a listNode head,find out length of linked of linked list
	public int length(ListNode head) {
		if(head==null) {
			return 0;
		}
	// create a count variable to hold length
	int count =0;
	// loop each element and increment the count till list ends
	ListNode current=head;
	while(current!=null) {
		count++;
		// move to next node 
		current =current.next;
	}
	return count;
	}
	public static void main(String[] args) {
	//Lets create a linked list demonstrated in slide
		// 10--> 8--> 1 --> 11 -->null
		// 10 as head node of linked link
		ListNode head=new ListNode(10);
		ListNode second =new ListNode(8);
		ListNode third =new ListNode(1);
		ListNode fourth =new ListNode(11);
		
		// Attach them together to form a list
		head.next=second;//10-->8
		second.next=third;//10-->8-->1
		third.next=fourth;//10-->8-->1-->11--null
		 
SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
singlyLinkedList.display(head);
System.out.println();
//ListNode newhead=singlyLinkedList.insertingBeginning(head,15);
//ListNode newhead=singlyLinkedList.insertAtEnd(head, 15);
SinglyLinkedList.insertAfter(second,15);
singlyLinkedList.display(head);
//System.out.println("length of linked list is- "+singlyLinkedList.length(head));
	}

}
