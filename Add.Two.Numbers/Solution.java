public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = new ListNode(-1);
        ListNode node = head;
        int carry = 0;
        while (true) {
            int curr = carry;
            if (l1 != null) {
                curr += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                curr += l2.val;
                l2 = l2.next;
            }
            carry = curr / 10;
            curr = curr % 10;
            node.next = new ListNode(curr);
            node = node.next;
            if ((l1 == null ) && (l2 == null)) break;
        }
        if (carry == 1) node.next = new ListNode(1);
        return head.next;
    }
}
