package week_challenge;

import java.util.ArrayList;
import java.util.List;

public class Reorder_List {

    List<ListNode> list = new ArrayList<>();
    public void reorderList(ListNode head) {
        if(head.next == null) {
            list.add(head);
            return;
        }
        list.add(head);
        reorderList(head.next);
    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {

    }
}
