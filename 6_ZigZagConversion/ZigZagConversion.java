/**
 * ����:
 * ��һ���ַ����ڷų�Z��״�������ַ���"PAYPALISHIRING"�ڷų�3�е�Z��״Ϊ��
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * ���п��Զ����ַ���"PAHNAPLSIIGYIR"
 * 				
 * 
 * ������Ҫ��һ���ַ����ڷų�n�е�Z��״����������ж����ַ�����
 * 
 * */
package Problem_1_10;

public class ZigZagConversion {

	public static void main(String args[]) {
		System.out.println(convert("0123456789",4));
	}
	
	//�ҵĽⷨ
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
