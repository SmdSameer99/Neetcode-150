package LinkedList;

public class binaryLL {

    public static int getDecimalValue(Node head) {
        if (head == null || left == right) return head;
        int ans = 0;
        Node current = head;
        ans =  current.val;
        while(current.next != null){
            current = current.next;
            ans = (ans<<1) + current.val;

        }

        return ans;
    }
    
    public static void main(String[] args) {
        Node list0 = new Node(1);
        Node list1 = new Node(0);
        Node list2 = new Node(1);
        list0.next = list1;
        list1.next = list2;
        list2.next = null;  
        
        int sol = getDecimalValue(list0);

        System.out.println(sol);
    }
}
