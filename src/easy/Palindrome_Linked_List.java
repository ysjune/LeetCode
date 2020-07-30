package easy;

import java.util.Stack;

public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }
        Stack<Integer> s = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            s.push(curr.val);
            curr = curr.next;
        }
        while(!s.isEmpty()){
            if(s.peek()!=head.val){
                return false;
            }
            s.pop();
            head = head.next;
        }
        return true;
    }

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
}
