package Daily;

public class Maximum_Twin_Sum_of_a_Linked_List_2130 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public int pairSum(ListNode head) {
            ListNode slow = head, fast = head, prev = null;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                ListNode temp = slow.next;
                slow.next = prev;
                prev = slow;
                slow = temp;
            }

            int res = 0;
            while (slow != null) {
                res = Math.max(res, prev.val + slow.val);
                prev = prev.next;
                slow = slow.next;
            }

            return res;
        }
    }

    public static void main(String[] args) {

    }
}
