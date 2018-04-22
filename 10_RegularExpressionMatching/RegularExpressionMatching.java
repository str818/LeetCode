/**
 * ����:
 * �����ַ���s��ģʽ��pattern��p��ʵ��������ʽƥ�䣬֧��'.'��'*'
 * 
 * '.'�ܹ�ƥ������ĵ����ַ�
 * '*'�ܹ�ƥ���������ǰ��Ԫ��
 * 
 * ƥ��Ӧ�ø��������ַ����������ǲ��ַ���
 * 
 * ע�⣺
 * s�ܹ�Ϊ�ղ���ֻ����Сд��ĸ'a-z'
 * p�ܹ�Ϊ�ղ���ֻ����Сд�ַ�'a-z'��'.'��'*'
 * 
 * ʾ��1��
 * ���룺 s="aa" p="a"
 * �����false
 * ���ͣ�a����ƥ�������ַ���
 * 
 * ʾ��2��
 * ���룺 s="aa" p="a*"
 * �����true
 * ���ͣ�*�ܹ�ƥ�������a�ַ�
 * 
 * ʾ��3��
 * ���룺s="ab" p=".*"
 * �����true
 * ���ͣ��ܹ�ƥ�������'.'����'.'��ʾ���ⵥ���ַ�
 * 
 * ʾ��4��
 * ���룺s="aab" p="c*a*b*"
 * �����true
 * ���ͣ�cΪ0�Σ�aΪ2��
 * 
 * ʾ��5��
 * ���룺s="mississippi" p="mis*is*p*."
 * �����false
 * */

package Problem_1_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {
	
	public static void main(String[] args) {
		System.out.println(isMatch("aaa","a*a"));
	}
	
	//�ҵĽⷨ-ʹ��java�Դ���������ʽ
	public static boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
        
    }
	
	//�ⷨһ���ݹ�
	/*public static boolean isMatch(String s,String p) {
		
		if(p.isEmpty()) return s.isEmpty();
		
		if(p.length() == 1) {
			return s.length() == 1 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
		}
		
		if(p.charAt(1) != '*') {
			if(s.isEmpty()) return false;
			return (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.') && 
					isMatch(s.substring(1),p.substring(1));
		}
		
		while(!s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
			if(isMatch(s,p.substring(2))) return true;
			s = s.substring(1);
		}
		
		return isMatch(s,p.substring(2));
	}*/
	
	//�ⷨ������̬�滮 
	/*public static boolean isMatch(String s, String p) {
		
		int n = s.length(),m = p.length();
		
		//dp[i][j]��ʾs[0-i]��p[0-j]�Ƿ�ƥ��
		boolean[][] dp = new boolean[n+1][m+1];
		
		dp[0][0] = true; //��s��p��Ϊ���ַ�����ʱ�������ַ���ƥ��
		
		//��ʼ����0�У���pΪ���ַ�������s��Ϊ�գ�s��pһ����ƥ��
		for(int i = 1; i<=n; i++) {
			dp[i][0] = false;
		}
		
		//��ʼ����0�У�ֻ�е�pΪX*ʱ����ƥ��մ���������ֵһ����dp[0][i-2]��ͬ
		for(int i = 1; i<=m; i++) {
			dp[0][i] = i>1 && p.charAt(i-1) == '*' && dp[0][i-2];
		}
		
		for(int i = 1; i<=n; i++) {
			for(int j =1;j<=m;j++) {
				
				if(p.charAt(j-1) == '*') {
					//��X*����0�Σ����ߵ�ǰ�ַ�ƥ��X�ַ�(*ǰ���ַ�)
					dp[i][j] = dp[i][j-2] || (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') && dp[i-1][j];
				}else {
					//��ǰ�ַ���ȫƥ��ʱ������dp[i-1][j-1]����ֵ
					dp[i][j] = (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1)) && dp[i-1][j-1];
				}
			}
		}
		
		return dp[n][m];
	}*/
}
