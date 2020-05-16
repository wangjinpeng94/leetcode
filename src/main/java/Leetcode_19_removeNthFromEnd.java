public class Leetcode_19_removeNthFromEnd {

     class ListNode {
     int val;
    ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;//统计链表长度
        ListNode dhead=new ListNode(-1);
        dhead.next=head;
        for(ListNode cur=head;cur.next!=null;cur=cur.next)//计算链表长度
            count++;
        int preindex=count-n;
        ListNode cur=dhead;
        while(preindex>0){//找到倒数第n个位置的元素
            cur=cur.next;
            preindex--;
        }

        cur.next=cur.next.next;//删除第n个元素


        return dhead;
    }
}
