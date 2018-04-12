/**
 * ����:
 * ���ַ���ת��Ϊ���ͣ�������C++�е�atoi������
 * 
 * ��Ŀ�����Ĳ��Ǻ�������Լ�����һ�¹���
 * 1�������ַ���ǰ��Ŀհ��ַ�
 * 2������ǰ����ܻ���������
 * 3������������ʱ����ת�������ؽ������������"-12a34"����-12
 * 4���������ת�������ͣ�����0
 * 5�����������͵����Χ���򷵻�������С��Χ����������"9999999999"����2147483647
 * */

package Problem_1_10;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(myAtoi("1"));
	}
	
	//�ҵĽⷨ
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
	
	//���ⷨ
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
