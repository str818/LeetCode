/**
 * 描述:
 * 判断一个整数是否为回文数
 * 
 * 
 * 输入：
 * 121
 * -121
 * 
 * 输出：
 * true
 * false
 * 
 * 3
 * 0 1 2
 * */

package Problem_1_10;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}
	
	//我的解法
	public static boolean isPalindrome(int x) {
		
		String s = x + "";
		int n = s.length();
		for(int i = 0;i<n/2;i++) {
			if(s.charAt(i) != s.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
    }
	
	//解法一   将整型x反转，比较两个整型是否相等
	/*public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int z = 0;
        int i = x;
        while (x > 0) {
            int y = x % 10;
            x = x/10;
            z = z*10 + y;
        }
        if (i == z) {
            return true;
        }
        return false;
    }*/
}
