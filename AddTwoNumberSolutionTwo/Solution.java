package AddTwoNumberSolutionTwo;

import AddTwoNumber.Node;

public class Solution {
	
	public static void main(String[] arg){
		ListNode one 	= new ListNode(2);
		ListNode two 	= new ListNode(4);
		ListNode three = new ListNode(3);
		ListNode four  = new ListNode(5);
		ListNode five  = new ListNode(6);
		ListNode six   = new ListNode(4);
        one.next = two;
        two.next = three;
        
        four.next = five;
        five.next = six;
        
        ListNode head = null;
        head = addTwoNumbers(one,four);
        while(head!=null){
       	 System.out.println(head.val);
       	 head = head.next;
        }
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode h1 = l1, h2 = l2, h3 = new ListNode(0);
		ListNode reasultHead = h3;
		int carry = 0;
		while (h1 != null || h2 != null) {
			if (h1 != null) {
				carry += h1.val;
				h1 = h1.next;
			}

			if (h2 != null) {
				carry += h2.val;
				h2 = h2.next;
			}

			h3.next = new ListNode(carry % 10);
			carry /= 10;
			h3 = h3.next;
		}

		if (carry == 1) {
			h3.next = new ListNode(1);
		}
		return reasultHead.next;

	}
}
