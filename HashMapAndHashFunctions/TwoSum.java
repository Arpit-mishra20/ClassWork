import java.util.*;
public class TwoSum{
	public static int[] twoSum(int[] nums,int target){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			int complement=target-nums[i];
			if(map.containsKey(complement)){
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("No solution");
	}
	public static void main(String[] args){
	int[] num={2,4,6,3,5,2};
	int target=8;
	int[] result=twoSum(num,target);
	System.out.println("Indices :"+result[0]+","+result[1]);
		
		
	}
	
}