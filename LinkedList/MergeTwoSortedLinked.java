package LinkedList;

public class MergeTwoSortedLinked {
    public static Node solution(Node list1, Node list2){
        Node dummy = new Node();
        Node newList = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                newList.next = list1;
                list1 = list1.next;
            }else{
               newList.next = list2;
                list2 = list2.next;
            }newList = newList.next;
        }
        if(list1 != null) {
            newList.next = list1;
        }
        
        if(list2 != null) {
            newList.next = list2;
        }

        return dummy.next;
    }

    public static void printList(Node node){
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Node list1 = new Node(10);
        Node list2 = new Node(30);

        Node list11 = new Node(20);

        list1.next = list11;
        Node newSolList = solution(list1, list2);
        // Node newSolList = solution(list11, list2);

        printList(newSolList);
    }
}
