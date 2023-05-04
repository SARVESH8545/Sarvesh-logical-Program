package DataStructure;



public class SinglyLinkedList5{
private ListNode head;//Head node to hold the list
	
	// Given a listNode,print all element it hold
	public void display1(ListNode head)
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
		System.out.println(current);//here current will be null
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
public ListNode deleteAtPosition(ListNode head,int position) {
	int size =length(head);
	if(position>size||position<1) {
		System.out.println("Invalid position");
		return head;
		
	}
	if(position==1)
	{
		ListNode temp=head;
		head=head.next;
		temp.next=null;
	}else {
		ListNode previous=head;
		int count=1;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		previous.next=current.next;
		return current;
	}
	return head;
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
				 
		SinglyLinkedList5 sll=new SinglyLinkedList5();
		sll.display1(head);
		System.out.println();
		ListNode thirdNode=sll.deleteAtPosition(head, 3);
		System.out.println(thirdNode.data);

	}

}

