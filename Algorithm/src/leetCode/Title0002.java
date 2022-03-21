package leetCode;

public class Title0002 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode dummy = new ListNode(0);
			ListNode t1 = l1, t2 = l2, c = dummy;
			int m = 0;
			while (t1 != null || t2 != null) {
				int x = (t1 != null) ? t1.val : 0;
				int y = (t2 != null) ? t2.val : 0;
				int sum = m + x + y;
				m = sum / 10;
				c.next = new ListNode(sum % 10);
				c = c.next;
				if (t1 != null)
					t1 = t1.next;
				if (t2 != null)
					t2 = t2.next;
			}
			if (m > 0) {
				c.next = new ListNode(m);
			}
			return dummy.next;
		}
	}

	public static void main(String[] args) {

	}

}
