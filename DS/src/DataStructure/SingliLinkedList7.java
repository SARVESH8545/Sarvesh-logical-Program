package DataStructure;


public class SingliLinkedList7{
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
	//reverse  a given node
	public ListNode reverse(ListNode head) {
		if(head==null)
		{
			return head;
		}
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		
		while (current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			}
return previous;
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
				 
		SingliLinkedList7 sll=new SingliLinkedList7();
		sll.display1(head);
		System.out.println();
	ListNode reverseListhesd=sll.reverse(head);
	sll.display1(reverseListhesd);
	
	
	
	}

}
