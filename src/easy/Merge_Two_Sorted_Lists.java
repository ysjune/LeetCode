package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Merge_Two_Sorted_Lists {

    List<Integer> list = new ArrayList();

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        try {
            if(l1 == null) {
                return l2;
            }
            if(l2 == null) {
                return l1;
            }
            if(l1 == null && l2 == null) {
                throw new IllegalArgumentException("");
            }
            solving(l1);
            solving(l2);

            Collections.sort(list);

            return making(0, list.size(), list);
        } catch (Exception e) {
            return null;
        }
    }

    private ListNode solving(ListNode listNode) {
        list.add(listNode.val);
        if (listNode.next == null) {
            return null;
        }
        return solving(listNode.next);
    }

    private ListNode making(int val, int length, List<Integer> list) {
        if (val == length) {
            return null;
        }
        return new ListNode(list.get(val), making(++val, length, list));
    }

    /**
     *
     * Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
     *
     * Example:
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     *
     */
    public static void main(String[] args) {
        Merge_Two_Sorted_Lists merge_two_sorted_lists = new Merge_Two_Sorted_Lists();

        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);

        ListNode node4 = new ListNode(3);
        ListNode node3 = new ListNode(1, node4);

        ListNode listNode = merge_two_sorted_lists.mergeTwoLists(node1, node3);
    }

    private static class ListNode {
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
}
