/**
 * 描述:
 * 输入字符串s与模式（pattern）p，实现正则表达式匹配，支持'.'与'*'
 * 
 * '.'能够匹配任意的单个字符
 * '*'能够匹配零个或多个前置元素
 * 
 * 匹配应该覆盖整个字符串，而不是部字符串
 * 
 * 注意：
 * s能够为空并且只包含小写字母'a-z'
 * p能够为空并且只包含小写字符'a-z'与'.'或'*'
 * 
 * 示例1：
 * 输入： s="aa" p="a"
 * 输出：false
 * 解释：a不能匹配整个字符串
 * 
 * 示例2：
 * 输入： s="aa" p="a*"
 * 输出：true
 * 解释：*能够匹配任意个a字符
 * 
 * 示例3：
 * 输入：s="ab" p=".*"
 * 输出：true
 * 解释：能够匹配任意个'.'，而'.'表示任意单个字符
 * 
 * 示例4：
 * 输入：s="aab" p="c*a*b*"
 * 输出：true
 * 解释：c为0次，a为2次
 * 
 * 示例5：
 * 输入：s="mississippi" p="mis*is*p*."
 * 输出：false
 * */

package Problem_1_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatching {
	
	public static void main(String[] args) {
		System.out.println(isMatch("aaa","a*a"));
	}
	
	//我的解法-使用java自带的正则表达式
	public static boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
        
    }
	
	//解法一：递归
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
	
	//解法二：动态规划 
	/*public static boolean isMatch(String s, String p) {
		
		int n = s.length(),m = p.length();
		
		//dp[i][j]表示s[0-i]与p[0-j]是否匹配
		boolean[][] dp = new boolean[n+1][m+1];
		
		dp[0][0] = true; //当s与p均为空字符串的时候，两个字符串匹配
		
		//初始化第0列，当p为空字符串，且s不为空，s与p一定不匹配
		for(int i = 1; i<=n; i++) {
			dp[i][0] = false;
		}
		
		//初始化第0行，只有当p为X*时才能匹配空串，并且真值一定和dp[0][i-2]相同
		for(int i = 1; i<=m; i++) {
			dp[0][i] = i>1 && p.charAt(i-1) == '*' && dp[0][i-2];
		}
		
		for(int i = 1; i<=n; i++) {
			for(int j =1;j<=m;j++) {
				
				if(p.charAt(j-1) == '*') {
					//将X*当做0次，或者当前字符匹配X字符(*前的字符)
					dp[i][j] = dp[i][j-2] || (s.charAt(i-1) == p.charAt(j-2) || p.charAt(j-2) == '.') && dp[i-1][j];
				}else {
					//当前字符完全匹配时，传递dp[i-1][j-1]的真值
					dp[i][j] = (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1)) && dp[i-1][j-1];
				}
			}
		}
		
		return dp[n][m];
	}*/
}
