package easy;

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {

        if(head == null) {
            return null;
        }
        String s = new StringBuilder(makeString(head)).reverse().toString();
        return makeNode(s);
    }

    public ListNode makeNode(String s) {
        if(s.length() == 1) {
            return new ListNode(Integer.parseInt(s), null);
        }
        return new ListNode(Integer.parseInt(s.substring(0,1)), makeNode(s.substring(1)));
    }

    public String makeString(ListNode listNode) {
        if(listNode == null) {
            return "";
        }
        return listNode.val + makeString(listNode.next);
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

    public static void main(String[] args) {
        Reverse_Linked_List solution = new Reverse_Linked_List();
        solution.reverseList(new ListNode(1));
    }
}
