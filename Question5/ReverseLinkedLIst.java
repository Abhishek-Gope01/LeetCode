package Question5;


class ListNode{
    int val;
    ListNode next;
    ListNode (int val){
        this.val = val;
    }
    ListNode (int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    ListNode(){}
}
class ReverseLinkedList {

    public static void printList(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }


    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        ListNode next = head.next;
        ListNode prev = null;

        while (current != null){
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ListNode head = null;
        for (int i = arr.length - 1; i >= 0; i--){
            head = new ListNode(arr[i],head);
        }
        printList(head);
        head = reverseList(head);
        System.out.println();
        printList(head);
    }
}
