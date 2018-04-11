/**
 * 描述:
 * 给定一个32位带符号整数，反转该整数。
 * 
 * 假定：
 * 只能处理32位带符号整数范围内的数字，当所要翻转的数字溢出时返回0
 * 
 * 输入：
 * 123
 * -123
 * 120
 * 
 * 输出：
 * 321
 * -321
 * 21
 * */

package Problem_1_10;

public class ReverseInteger {
	
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
	
	//我的解法
	public static int reverse(int x) {
		
		StringBuilder s = new StringBuilder(x+"");			
		if(s.charAt(0)!='-') s.insert(0, '+');		
		String ans= new StringBuilder(s.substring(1, s.length())).reverse().toString();
		
		try{
			return Integer.parseInt(s.charAt(0)+ans);
		}catch (NumberFormatException e){
			return 0;
		}
	}
	
	//解法一
	/*public static int reverse(int x) {
		
		int ans = 0,newAns = 0;
		while(x!=0) {
			newAns = ans*10 + x%10;
			if(ans != (newAns - x%10)/10) return 0;//判断是否溢出
			ans = newAns;
			x/=10;
		}
		return ans;
		
	}*/
	//解法二
	/*public static int reverse(int x) {
		long ans = 0;
		while(x!=0) {
			ans = ans*10+x%10;
			x/=10;
		}
		
		//if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE)
		//	return 0;
		//return (int)ans;
		
		int test = (int) ans;
        return ans == test ? test : 0;
	}*/

}
