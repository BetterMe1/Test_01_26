package xust;

import java.util.Arrays;

/*
1. 存在重复元素
给定一个整数数组，判断是否存在重复元素。
如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

示例 1:
输入: [1,2,3,1]
输出: true

示例 2:
输入: [1,2,3,4]
输出: false

示例 3:
输入: [1,1,1,3,3,4,3,2,4,2]
输出: true
 */

//public class Test_0126 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums = {1,4,3,4};
//		System.out.println(So.containsDuplicate2(nums));
//	}
//}
//
//class Solution {
//	//执行时间403 ms
//    public boolean containsDuplicate1(int[] nums) {
//    	if(nums.length <2){
//    		return false;
//    	}
//    	for(int i=0; i<nums.length; i++){
//    		for(int j=0; j!=i && j<nums.length;j++){
//    			if(nums[i] == nums[j]){
//    				return true;
//    			}
//    		}
//    	}
//        return false;
//        
//    }
//    //执行时间5 ms
//    public boolean containsDuplicate2(int[] nums) {
//    	if(nums.length <2){
//    		return false;
//    	}
//    	Arrays.sort(nums);//数组排序
//    	for(int i=0; i<nums.length-1; i++){
//    		if(nums[i] == nums[i+1]){
//    			return true;
//    		}
//    	}
//        return false;
//        
//    }
//}

/*
2. 存在重复元素 II
给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。

示例 1:
输入: nums = [1,2,3,1], k = 3
输出: true

示例 2:
输入: nums = [1,0,1,1], k = 1
输出: true

示例 3:
输入: nums = [1,2,3,1,2,3], k = 2
输出: false
 */
//public class Test_0126 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums ={1,1};
//		int k =2;
//		System.out.println(So.containsNearbyDuplicate(nums, k));
//	}
//}
//class Solution {
//    public boolean containsNearbyDuplicate(int[] nums, int k) {
//    	if(nums.length <2 || k<1){
//    		return false;
//    	}
//    	for(int i=0; i<nums.length; i++){
//    		for(int j=i+1; j<=i+k && j<nums.length; j++){
//    			if(nums[i] == nums[j]){
//        			return true;
//        		}
//    		}
//    	}
//    	return false;
//    }
//}

/*
3. 存在重复元素 III
给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。

示例 1:

输入: nums = [1,2,3,1], k = 3, t = 0
输出: true
示例 2:

输入: nums = [1,0,1,1], k = 1, t = 2
输出: true
示例 3:

输入: nums = [1,5,9,1,5,9], k = 2, t = 3
输出: false
 * */
public class Test_0126 {
	public static void main(String[] args) {
		Solution So = new Solution();
		int[] nums={1,5,9,1,5,9};
		int k=2;
		int t=3;
		System.out.println(So.containsNearbyAlmostDuplicate(nums, k, t));
	}
}
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
    	if(nums.length <2 || k<1){
    		return false;
    	}
    	for(int i=0; i<nums.length; i++){
    		for(int j=i+1; j<=i+k && j<nums.length; j++){
    			if(nums[i] - nums[j]>=-t && nums[i] - nums[j]<=t){    
        			return true;
        		}
    		}
    	}
    	return false;
    }
}