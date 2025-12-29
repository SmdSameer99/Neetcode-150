package LinkedList;

public class SwappingNodeLL {

    public static Node swapNodes(Node head, int k){
        Node temp = head;
        Node firstNode, secondNode;

        int count = 0 ;
        while (temp != null) {
            if(count == k){
                firstNode = temp;
            }
            if(count == (count-k)){
                secondNode = temp;
            }
            System.out.println(temp.val);
            temp = temp.next;
            count++;
        }
        

        return temp;
    }
    
    public static void main(String[] args) {
        /* tasks swap
        staring kth node  <=> ending kth node 
        1.count lenght cal n-k th & kth
        2.using temp node store both once done 
        3. swap
        */

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        swapNodes(head, 2);

    }
}
