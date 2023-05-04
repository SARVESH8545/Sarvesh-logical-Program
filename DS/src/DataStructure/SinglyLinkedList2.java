package DataStructure;



//7. Insertion After a given Node
public class SinglyLinkedList2{
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
	public ListNode insertAtPosition(ListNode head,int data,int position)
	{
		//perform boundaery checks
		int size = length(head);
		if(position>size+1||position<1) {
			System.out.println("Invalid position");
return head;
		}
		ListNode newNode=new ListNode(data);
		if(position==1) {
			newNode.next=head;
		}else {
			ListNode previous=head;
			int count=1;
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			newNode.next=current;
			previous.next=newNode;
			return head; 
			
		}
		return newNode;
	}


	private int length(ListNode head2) {
		// TODO Auto-generated method stub
		return 0;
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
				 
		SinglyLinkedList2 sll=new SinglyLinkedList2();
		sll.display1(head);
		System.out.println();
		head=sll.insertAtPosition(head, 15, 3);
		sll.display1(head);

	}

}

