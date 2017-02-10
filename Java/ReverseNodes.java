import java.util.*;

public class ReverseNodes {
	public static void main(String[] args){
		
	}
	
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	static ListNode reverse(ListNode head, int k){
		ListNode curr = head;
		int count = 0;
		
		while(curr!=null && count!=k){
			curr = curr.next;
			count++;
		}
		
		if(count==k){
			curr = reverse(curr, k);
			
			while(count-- > 0){
				ListNode temp = head.next;
				head.next = curr;
				curr = head;
				head = temp;
			}
			
			head = curr;
		}
		
		return head;
	}
}
