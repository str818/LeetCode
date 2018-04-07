

/**
 * ����:
 * ����һ���ַ�������������ظ������ַ����ĳ���
 * 
 * 
 * ���룺
 * abcabcbb
 * bbbbb
 * pwwkew
 * 
 * �����
 * 3
 * 1
 * 3
 * 
 * ���ͣ�
 * abc
 * b
 * wke
 * 
 * */
package Problem_1_10;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args) {
		
		int length = lengthOfLongestSubstring("audaudc");
		System.out.println(length);
		
	}
	
	//�ҵĽⷨ2
	public static int lengthOfLongestSubstring(String s) {
		int ans = 0;
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0,j=0;j<s.length() && i<s.length();) {
			
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				if(j-i>ans) ans = j-i; 
			}else {
				set.remove(s.charAt(i++));
			}
		}
		
		return ans;
	}
	
	//�ҵĽⷨ 1
	/*public static int lengthOfLongestSubstring(String s) {
		
		int maxLength = 0;
		String subString = null;
		if(s.length() == 1) maxLength = 1;//���ǳ���Ϊ1���ַ���
		
		for(int i = 0; i < s.length(); i++) {
			subString = s.charAt(i)+"";
			for(int j = i+1; j< s.length();j++) {
				if(subString.indexOf(s.charAt(j))>=0) break;
				subString += s.charAt(j);
			}
			if(subString.length()>maxLength) maxLength = subString.length();
		}
		
		return maxLength;
        
    }*/
	
	//�������ڷ���
	/*public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }*/
}
