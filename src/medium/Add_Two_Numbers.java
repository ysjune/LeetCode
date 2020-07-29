package medium;

public class Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int a = 0;
        int b = 0;
        if(l1 == null && l2 == null) {
            return null;
        }

        if(l1 != null) {
            a = l1.val;
        }
        if(l2 != null) {
            b = l2.val;
        }

        int sum = a+b;

        l1 = l1 == null ? null : l1.next;
        l2 = l2 == null ? null : l2.next;

        if(sum > 9) {
            sum = sum % 10;
            if(l1 != null) {
                l1.val++;
            }
            else if(l2 != null) {
                l2.val++;
            } else {
                l1 = new ListNode(1);
            }
        }

        return new ListNode(sum, addTwoNumbers(l1, l2));
    }

    public static class ListNode {
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

    /**
     *
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     * Example:
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     * Explanation: 342 + 465 = 807.
     *
     */
    public static void main(String[] args) {
        Add_Two_Numbers solution = new Add_Two_Numbers();
        solution.addTwoNumbers(null, null);
    }

}
