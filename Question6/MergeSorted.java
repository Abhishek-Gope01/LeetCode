package Question6;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode (int val,ListNode next){
        this.val = val;
        this.next = next;
    }
    ListNode(){}
}
public class MergeSorted {
    public static void printList(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode temp = new ListNode();
        ListNode current = temp;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                current.next = list1;
                list1 = list1.next;
            }else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = (list1 != null) ? list1 : list2;
        return temp.next;

    }
    public static void main(String[] args) {
        ListNode a = null;
        ListNode b = null;

        a = new ListNode(4,a);
        a = new ListNode(2,a);
        a = new ListNode(1,a);


        b = new ListNode(4,b);
        b = new ListNode(3,b);
        b = new ListNode(1,b);

        ListNode head = mergeTwoLists(a, b);
        printList(head);

    }
}
