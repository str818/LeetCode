
/**
 * ����:
 * ��һ���������飬������������������������ʹ������������ӵõ�һ��ָ��������Target��
 * 
 * �ٶ���
 * ÿ���������������ֻ��Ψһ�⣬���������е�ÿһ���������ظ�ʹ��
 * 
 * ���룺
 * nums = [2,7,11,15] target = 9
 * 
 * �����
 * [0,1]
 * 
 * */

import java.util.*;

public class TwoSum {
	
	public static void main(String[] args) {
		int[] nums = {2,2,3,3,4};
		int target = 6;
			
		int[] answer = twoSum(nums,target);
		
		for(int con : answer) {
			System.out.print(con + " ");
		}
	}
	
	//�ҵĽⷨ
	public static int[] twoSum(int[] nums, int target) {
        
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0;i<nums.length;i++) {
			map.put(i, nums[i]);
		}
		
		ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());  
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {  
        	//��������
			@Override
			public int compare(Map.Entry<Integer, Integer> arg0, Map.Entry<Integer, Integer> arg1) {
				return arg1.getValue().compareTo(arg0.getValue());
			}  
        }); 
        
        int[] result = new int[2];
		
		for(java.util.Map.Entry<Integer, Integer> entry_1: list){
			int key_1 = (int) entry_1.getKey();
			int val_1 = (int) entry_1.getValue();
			for(java.util.Map.Entry<Integer, Integer> entry_2: list) {
				int key_2 = (int) entry_2.getKey();
				int val_2 = (int) entry_2.getValue();
				if(key_1 != key_2 && val_1 + val_2 == target) {
					result[0] = key_1;
					result[1] = key_2;
					Arrays.sort(result);
					return result;
				}
			}
		}  
		
		return null;
       
    }
	
	//�ⷨһ��������
	/*public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}*/
	
	//�ⷨ����HashMap��������
	/*public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
	    }
		throw new IllegalArgumentException("No two sum solution");
	}*/
	
	//�ⷨ����HashMap����һ��
	/*public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}*/
}
