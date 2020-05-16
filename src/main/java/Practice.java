import java.util.ArrayList;
import java.util.List;

public class Practice {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    static class Solution {

        public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }

            public ListNode() {

            }
        }
        int maxLength=0;
        int minLength=0;


        public static int getLength(ListNode node){
            int length=0;
            while(node.next!=null){
                length++;
            }
            return length;
        }
        int bit=0;
        ListNode result=   new ListNode();
        List<ListNode> resultList=new ArrayList<ListNode>();

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            maxLength=Math.max(getLength(l1),getLength(l2));
            minLength=Math.min(getLength(l1),getLength(l2));
            for(int i=0;i<maxLength;i++){
                // if(i<minLength){
                while(l1.next!=null||l2.next!=null){
                    ListNode itemNode=   new ListNode();

                    itemNode.val=(l1.val+l2.val)%10+bit;
                    if(l1.val+l2.val>=10){
                        bit=1;
                    }
                    resultList.add(itemNode);
                    l1=l1.next;
                    l2=l2.next;


                }


                // }

            }

            for(int i=0;i<resultList.size()-1;i++)
            {
                resultList.get(i).next=resultList.get(i+1);

            }
            result.next=resultList.get(0);
            return result;
        }
    }
}
