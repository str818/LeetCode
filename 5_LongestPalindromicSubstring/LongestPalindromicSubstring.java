
/**
 * ����:
 * �����ַ���s���ҳ�s����������ַ�����
 * 
 * �ٶ���
 * �ַ���s����󳤶�Ϊ1000
 * 
 * ���룺
 * babad
 * cbbd
 * 
 * �����
 * bab(abaҲ�ǺϷ��Ĵ�)
 * bb
 * 
 * */

package Problem_1_10;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("cbbd"));
		
	}
	
	//�ҵĽⷨ
	public static String longestPalindrome(String s) { 
		int n = s.length();
		//����Ϊi�Ļ�����
		for (int i = n; i>0; i--) {
			for(int j = 0; j<=n-i; j++) {
				if(isPalindromic(s.substring(j, j+i))) 
					return s.substring(j, j+i);
			}
		}
		return null;
    }
	
	//�ж��Ƿ�Ϊ�����ַ���                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	public static boolean isPalindromic(String s) {
		int n = s.length();
		for(int i=0; i<=n/2; i++) {
			if(s.charAt(i) != s.charAt(n-i-1)) return false; 
		}
		return true;
		
	}
}


