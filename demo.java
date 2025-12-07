// import java.util.List;

// public class demo {


//     public static void main(String[] args) {
//         int [] numbers = {1, 4, 2, 5};
    
//         fineMissingNumber(numbers);
//     }

//     private static List<Integer> fineMissingNumber(int[] numbers) {
    
//         List<Integer> missingNumbers = new java.util.ArrayList<>();
//         int max = 0, min = 0;
//         for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] > max){
//                max = numbers[i];
//            }
//            if(numbers[i] < min || min == 0){
//                min = numbers[i];
//            }
//         }

        
//         System.out.println("Max: " + max + " Min: " + min);

//         for(int j = min; j <= max; j++){
//             boolean found = false;
//             for(int k = 0; k < numbers.length; k++){
//                 if(numbers[k] == j){
//                     found = true;
//                     break;
//                 }
//             }
//             if(!found){
//                 missingNumbers.add(j);
//                 System.out.println("Missing number: " + j);
//             }
//         }

//         return missingNumbers;
//     }
// }

public class demo {

    class LLNode {
        int data;
        LLNode next;

        LLNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    LLNode insertLLNode(LLNode head, int data) {
        LLNode newNode = new LLNode(data);
        if (head == null) {
            return newNode;
        }
        LLNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    LLNode printLLNode(LLNode head) {
        LLNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        return head;
    }

    LLNode ReverseLL(LLNode head) {
        LLNode ReverseLLHead = null;
        LLNode current = head;
        

        while(current != null){
            
            printLLNode(ReverseLLHead);
            
            LLNode nextNode = current.next;
            current.next = ReverseLLHead;
            ReverseLLHead = current;
            current = nextNode;
        }
        return ReverseLLHead;
    }
    public static void main(String[] args) {
        demo list = new demo();
        LLNode head = null;
        head = list.insertLLNode(head, 1);
        head = list.insertLLNode(head, 2);
        head = list.insertLLNode(head, 3);
        head = list.printLLNode(head);

        // reverse the linked list
        demo reversedList = new demo();
        LLNode reversedHead = reversedList.ReverseLL(head);
        reversedList.printLLNode(reversedHead);
    }
}