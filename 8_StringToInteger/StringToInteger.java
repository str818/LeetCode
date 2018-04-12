/**
 * 描述:
 * 将字符串转换为整型，类似于C++中的atoi函数。
 * 
 * 题目表述的不是很清楚，自己归纳一下规则：
 * 1、跳过字符串前面的空白字符
 * 2、数字前面可能会有正负号
 * 3、遇到非数字时结束转换并返回结果，比如输入"-12a34"返回-12
 * 4、如果不能转换成整型，返回0
 * 5、若超过整型的最大范围，则返回最大或最小范围，比如输入"9999999999"返回2147483647
 * */

package Problem_1_10;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(myAtoi("1"));
	}
	
	//我的解法
	public static int myAtoi(String str) {
		
		long ans = 0;
		int sign = 0;
		for(int i=0;i<str.length();i++) {
			char s = str.charAt(i);
			
			if(ans == 0 && sign == 0) {
				if(s=='-') {
					sign = -1;
					continue;
				} 
				if(s=='+' ) {
					sign = 1;
					continue;
				}
				if(s==' ') continue;
			}
			
			if(s=='-' || s=='+') return 0;
		
			if(s<='9' && s>='0') {
				
				if(sign == 0) sign =1;
				ans = ans * 10 + ((int)s - 48); 
				if(ans*sign > Integer.MAX_VALUE ) return Integer.MAX_VALUE;
				if(ans*sign < Integer.MIN_VALUE ) return Integer.MIN_VALUE;
				continue;
			}
			break;
		}
		return (int)(ans*sign);
	}
	
	//最快解法
	/*public static int myAtoi(String str) {
        int i = 0, sign = 1, r = 0;
        int n = str.length();
        if (n == 0) return 0;

        while (i < n && str.charAt(i) == ' ') {
            i++;
        }

        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            sign = str.charAt(i) == '+' ? 1 : -1;
            i++;
        }

        while (i < n) {
            int num = str.charAt(i) - '0';
            if (num < 0 || num > 9) break;

            if (r > Integer.MAX_VALUE / 10 || Integer.MAX_VALUE / 10 == r && Integer.MAX_VALUE % 10 < num) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            r = 10 * r + num;
            i++;

        }

        return sign * r;
    }*/
	
}
