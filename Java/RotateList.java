import java.util.*;

public class RotateList{
	public static void main(String[] args){
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		RotateList rl = new RotateList();
		head = rl.rotate(head, 2);

		while(head.next != null){
			System.out.print(head.val + "-> ");
			head = head.next;
		}

		System.out.println(head.val);
	}

	public ListNode rotate(ListNode head, int k){
		if(head==null || head.next==null){
			return head;
		}

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode fast = dummy;
		ListNode slow = dummy;

		//length of linked list
		int i;
		for(i=0; fast.next!=null; i++){
			fast = fast.next;
		}

		//the i-n%i'th node
		for(int j= i - k%i; j>0; j--){
			slow = slow.next;
		}

		//do the rotation
		fast.next = dummy.next;
		dummy.next = slow.next;
		slow.next = null;

		return dummy.next;
	}
}

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int x){
		val = x;
	}
}