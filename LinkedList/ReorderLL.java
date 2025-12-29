package LinkedList;

public class ReorderLL {

    public static Node solution(Node head){
        Node dummpyNode = new Node();
        Node slow = head, fast = head.next;

        while (fast != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        L


        return dummpyNode;
        
    }
    
    public static void main(String[] args) {
        Node list1 = new Node(10);
        Node list01 = new Node(20);
        Node list001 = new Node(30);
        Node list0001 = new Node(40);
        
        list1.next = list01;
        list01.next = list001;
        list001.next = list0001;
    }
}
