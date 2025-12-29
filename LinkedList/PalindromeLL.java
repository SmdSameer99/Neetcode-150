package LinkedList;

import java.util.Stack;

public class PalindromeLL {
    public static boolean isPalindrome(Node head) {
        Node curr = head;
        Node fast = curr.next;
        Node slow = curr;

        Stack<Integer> stack = new Stack<>();

        while(fast.next != null){
            stack.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        while(slow.next != null){
            int val = stack.pop();
            if( val != slow.val){
                return false;
            }
            slow = slow.next;
        }

        
        return true;
    }
    public static void main(String[] args) {
        Node list0 = new Node(1);
        Node list1 = new Node(0);
        Node list2 = new Node(0);
        Node list3 = new Node(1);
        
        list0.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = null;  

        System.out.println(isPalindrome(list0));
    }
}
