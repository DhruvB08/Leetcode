import java.util.*;

public class SwapNodes {
	public static void main(String[] args){
		
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	static ListNode swapPairs(ListNode head){
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode current = dummy;
		
		while(current.next!=null && current.next.next!=null){
			ListNode first = current.next;
			ListNode second = current.next.next;
			
			first.next = second.next;
			current.next = second;
			current.next.next = first;
			current = current.next.next;
		}
		
		return dummy.next;
	}
}
