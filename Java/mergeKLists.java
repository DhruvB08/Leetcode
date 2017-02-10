package mergeKsortedLists;

public class mergeKLists {
	public static void main(String[] args){
		
	}
	
	public static ListNode mergekLists(ListNode[] lists){
		return partion(lists, 0, lists.length-1);
	}
	
	public static ListNode partion(ListNode[] lists, int start, int end){
		if(start==end){
			return lists[start];
		}
		
		if(start<end){
			int q = (start+end)/2;
			ListNode l1 = partion(lists, start, q);
			ListNode l2 = partion(lists, q+1, end);
			return merge(l1, l2);
		} else{
			return null;
		}
	}
	
	public static ListNode merge(ListNode l1, ListNode l2){
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		
		if(l1.val < l2.val){
			l1.next = merge(l1.next, l2);
			return l1;
		} else{
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
		}
	}
}
