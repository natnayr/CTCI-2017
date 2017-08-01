package LeetCode;


import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ListNode l1 = new ListNode(0);
        ListNode cur = l1;
        for(int i=0; i<n; i++){
            cur.next = new ListNode(in.nextInt());
            cur = cur.next;
        }
        l1 = l1.next;

        int m = in.nextInt();
        ListNode l2 = new ListNode(0);
        cur = l2;
        for(int i=0; i<m; i++){
            cur.next = new ListNode(in.nextInt());
            cur = cur.next;
        }
        l2 = l2.next;

        ListNode result = addTwoNumbers(l1, l2);
        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }

        in.close();

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode p = l1;
        ListNode q = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while(p != null || q != null){

            int total = ((p==null) ? 0 : p.val) + ((q==null) ? 0 : q.val) + carry;
            int sum = total % 10;
            carry = total / 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }

        if(carry != 0){
            curr.next = new ListNode(carry);
            curr = curr.next;
        }


        return dummyHead.next;
    }



    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
