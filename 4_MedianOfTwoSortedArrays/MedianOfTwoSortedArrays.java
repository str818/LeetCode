/**
 * ����:
 * ��������������nums1��nums2�����ȷֱ�Ϊm��n��
 * �ҳ����������������λ����Ҫ��ʱ�临�Ӷ�ΪO(log(m+n))
 * 
 * ���룺
 * nums1 = [1,3]
 * nums2 = [2]
 * 
 * nums1 = [1,2]
 * nums2 = [3,4]
 * 
 * �����
 * 2.0
 * 
 * 2.5
 * */
package Problem_1_10;

public class MedianOfTwoSortedArrays {
	
	public static void main(String[] args) {
		int[] nums1 = {1};
		int[] nums2 = {2,3,4,5,6};
		double ans = findMedianSortedArrays(nums1, nums2);
		System.out.println(ans);
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
		int n = nums1.length +  nums2.length;
		if(n%2==0)
			return (getKth(nums1,0,nums2,0,n/2) + getKth(nums1,0,nums2,0,n/2+1))/2.0;
		else
			return getKth(nums1,0,nums2,0,n/2+1);
    }
	
	//�ҵ���kС����
	public static int getKth(int[] A,int m,int[] B,int n,int k) {
		
		if(m>=A.length) return B[n+k-1];
		if(n>=B.length) return A[m+k-1];
		
		if(k==1) return Math.min(A[m], B[n]);
	
		int key1 = m+k/2-1>=A.length?Integer.MAX_VALUE:A[m+k/2-1];
		int key2 = n+k/2-1>=B.length?Integer.MAX_VALUE:B[n+k/2-1];
		if(key1<key2) { 
			return getKth(A,m+k/2,B,n,k-k/2);
		}else {
			return getKth(A,m,B,n+k/2,k-k/2);
		}
	}
	
	
}
