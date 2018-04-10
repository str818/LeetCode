
/**
 * 描述:
 * 给出字符串s，找出s中最长回文子字符串。
 * 
 * 假定：
 * 字符串s的最大长度为1000
 * 
 * 输入：
 * babad
 * cbbd
 * 
 * 输出：
 * bab(aba也是合法的答案)
 * bb
 * 
 * */

package Problem_1_10;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("cbbd"));
		
	}
	
	//我的解法
	public static String longestPalindrome(String s) { 
		int n = s.length();
		//长度为i的回文数
		for (int i = n; i>0; i--) {
			for(int j = 0; j<=n-i; j++) {
				if(isPalindromic(s.substring(j, j+i))) 
					return s.substring(j, j+i);
			}
		}
		return null;
    }
	
	//判断是否为回文字符串                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	public static boolean isPalindromic(String s) {
		int n = s.length();
		for(int i=0; i<=n/2; i++) {
			if(s.charAt(i) != s.charAt(n-i-1)) return false; 
		}
		return true;
		
	}
}


