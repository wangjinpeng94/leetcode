import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node4.next = node5;
        node5.next = node6;

       ListNode addResult= new Solution().addTwoNumbers(node1, node4);
        System.out.println(addResult.toString());
    }

    int maxLength = 0;
    int minLength = 0;


    public static int getLength(ListNode node) {
        int length = 1;
        while (node.next != null) {
            length++;
            node.next=node.next.next;
        }
        return length;
    }

    int bit = 0;
    ListNode result = new ListNode(0);
    List<ListNode> resultList = new ArrayList<ListNode>();

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        maxLength = Math.max(getLength(l1), getLength(l2));
        minLength = Math.min(getLength(l1), getLength(l2));
        for (int i = 0; i < maxLength; i++) {
            // if(i<minLength){
           // while (l1.next != null || l2.next != null) {
                ListNode itemNode = new ListNode(0);

                itemNode.val = (l1.val + l2.val) % 10 + bit;
                if (l1.val + l2.val >= 10) {
                    bit = 1;
                }
                resultList.add(itemNode);
                l1 = l1.next;
                l2 = l2.next;


           // }


            // }

        }

        for (int i = 0; i < resultList.size() - 1; i++) {
            resultList.get(i).next = resultList.get(i + 1);

        }
        result.next = resultList.get(0);
        return result;
    }
}