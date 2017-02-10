
public class Merge {
	public static void main(String[] args){
		
	}
	
	static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
	
	static ListNode merge(ListNode l1, ListNode l2){
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		
		ListNode mergeHead;
		if(l1.val < l2.val){
			mergeHead = l1;
			mergeHead.next = merge(l1.next, l2);
		} else{
			mergeHead = l2;
			mergeHead.next = merge(l1, l2.next);
		}
		
		return mergeHead;
	}
}
