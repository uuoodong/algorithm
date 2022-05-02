package leetCode;

public class Title0021 {

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
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode ans = new ListNode();
			ListNode c;
			c = ans;
			while (list1 != null || list2 != null) {
				if (list1 == null || list2 == null) {
					if (list1 == null) {
						c.next = new ListNode(list2.val);
						list2 = list2.next;
					} else if (list2 == null) {
						c.next = new ListNode(list1.val);
						list1 = list1.next;
					}
					c = c.next;
					continue;
				}
				if (list1.val <= list2.val) {
					c.next = new ListNode(list1.val);
					list1 = list1.next;
				} else {
					c.next = new ListNode(list2.val);
					list2 = list2.next;
				}
				c = c.next;

			}
			return ans.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
