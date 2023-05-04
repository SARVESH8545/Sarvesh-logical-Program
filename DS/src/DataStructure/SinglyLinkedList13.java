package DataStructure;



public class SinglyLinkedList13 {


		// Given a listNode,print all element it hold
		public void display2(ListNode head)
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
					 
			SinglyLinkedList13 sll=new SinglyLinkedList13();
			sll.display2(head);
			System.out.println();
		}
		}
