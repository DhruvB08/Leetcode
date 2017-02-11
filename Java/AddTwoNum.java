public class AddTwoNum {
	public static void main(String[] args){
		ListNode num1 = new ListNode(3);
		num1.next = new ListNode(0);
		num1.next.next = new ListNode(4);

		ListNode num2 = new ListNode(8);
		num2.next = new ListNode(9);
		num2.next.next = new ListNode(6);

		ListNode answer = solution(num1, num2);
		while(answer.next != null){
			System.out.print(answer.val + " -> ");
			answer = answer.next;
		}
		System.out.print(answer.val);

		System.out.println("");
	}

	public static class ListNode{
		int val;
		ListNode next;

		ListNode(int x){
			val = x;
			next = null;
		}
	}

	private static ListNode solution(ListNode num1, ListNode num2){
		if(num1==null && num2==null){
			return null;
		}

		ListNode sol = new ListNode(0);
		ListNode head = sol;

		int carry = 0;
		int sum = 0;
		
		while(num1!=null && num2!=null){
			sum = carry + num1.val + num2.val;
			carry = sum/10;
			head.next = new ListNode(sum%10);
			num1 = num1.next;
			num2 = num2.next;
			head = head.next;
		}

		while(num1!=null){
			sum = num1.val + carry;
			carry = sum/10;
			head.next = new ListNode(sum%10);
			num1 = num1.next;
			head = head.next;
		}

		while(num2!=null){
			sum = num2.val + carry;
			carry = sum/10;
			head.next = new ListNode(sum%10);
			num2 = num2.next;
			head = head.next;
		}

		if(carry!=0){
			head.next = new ListNode(carry);
		}

		return sol.next;
	}
}