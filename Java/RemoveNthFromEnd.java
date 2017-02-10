import java.util.*;

public class RemoveNthFromEnd {
	public static void main(String[] args){
		
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	static ListNode removeNthFromEnd(ListNode head, int n){
		if(head.next==null){
			return null;
		}
		
		ListNode start = new ListNode(0);
		start.next = head;
		ListNode fast = start;
		ListNode slow = start;
		
		while(n>0){
			fast = fast.next;
			n--;
		}
		
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		return start.next;
	}
}
