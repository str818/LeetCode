/**
 * 描述:
 * 将一个字符串摆放成Z形状，比如字符串"PAYPALISHIRING"摆放成3行的Z形状为：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 按行可以读成字符串"PAHNAPLSIIGYIR"
 * 				
 * 
 * 本题需要将一个字符串摆放成n行的Z形状，并输出按行读的字符串。
 * 
 * */
package Problem_1_10;

public class ZigZagConversion {

	public static void main(String args[]) {
		System.out.println(convert("0123456789",4));
	}
	
	//我的解法
	public static String convert(String s,int numRows) {
		
		if(numRows == 1 || s.length() < numRows) return s;
		
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < numRows; i++) {
			int index = i;
			while(index<s.length()) {
				ans.append(s.charAt(index));
				index += 2*numRows-2;
				if(i != 0 && i != numRows-1 && index - 2*i<s.length()) {
					ans.append(s.charAt(index - 2*i));
				}
			}
		}
		return ans.toString();
	}
}
