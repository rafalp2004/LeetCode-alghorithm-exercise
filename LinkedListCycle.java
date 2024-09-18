public class LinkedListCycle {

    //Floyd's Tortoise and Hare Algorithm
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while (fast.next != null && fast != null) {
            head = head.next;
            fast = fast.next.next;
            if (head == fast) {
                return true;
            }
        }
        return false;
    }
//Implementation on ListNode
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
