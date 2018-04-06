
/**
 * ����:
 * �������ǿյ������ʾ�����Ǹ����������Ǹ������Ƿ���洢�������еģ�ÿ�����ֻ����һλ����
 * �������Ǹ�����ӣ������������ʽ���ؽ����
 * 
 * �ٶ���
 * ��������������0��ͷ������0����
 * 
 * ���룺
 * (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 
 * �����
 * 7 -> 0 -> 8
 * 
 * ���ͣ�
 * 342 + 465 = 807
 * 
 * */

//�����
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val =x;
	}
}

public class AddTwoNumber {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		//l1.next = new ListNode(8);
		//l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		//l2.next = new ListNode(6);
		//l2.next.next = new ListNode(4);
		
		ListNode ans = addTwoNumbers(l1,l2);
		
		ListNode curr = ans;
		while(curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
	}
	
	//�ҵĽⷨ
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode curr1 = l1;
		ListNode curr2 = l2;
		int next = 0;
		
		ListNode ans = null;
		
		
		ans = new ListNode(curr1.val + curr2.val);
		if(ans.val>9) {
			next = 1;
			ans.val %= 10;
		}
		curr1 = curr1.next;
		curr2 = curr2.next;
		
		ListNode curr = ans;
	
		
		while(curr1 != null || curr2 != null) {
			
			if(curr1 == null) {
				curr.next = new ListNode(curr2.val+next);
				curr = curr.next;
				curr2 = curr2.next;
				if(curr.val>9) {
					next = 1;
					curr.val %= 10;
				}else {
					next = 0;
				}
				
				continue;
			}
			
			if(curr2 == null) {
				curr.next = new ListNode(curr1.val+next);
				curr = curr.next;
				curr1 = curr1.next;
				
				if(curr.val>9) {
					next = 1;
					curr.val %= 10;
				}else {
					next = 0;
				}
				continue;
			}
			
			curr.next = new ListNode(curr1.val + curr2.val + next);
			curr = curr.next;
			
			if(curr.val>9) {
				next = 1;
				curr.val %= 10;
			}else {
				next = 0;
			}
			
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		
		if(next == 1) {
			curr.next = new ListNode(1);
		}
		return ans;
        
    }
	
	//�ⷨһ
	/*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
	}*/
}
