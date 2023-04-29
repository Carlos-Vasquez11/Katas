/*
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  You may assume that each input would have exactly one solution, and you may not use the same element twice.
  You can return the answer in any order.

  Tested on LeetCode
*/
package Katas;

public class TwoSum {

  public int[] twoSum(int[] nums, int target){

    int[] twoSumResul = new int[2];

    for (int i = 0; i < nums.length ; i++){
      for (int j = i+1; j < nums.length ; j++){
        if(nums[i] + nums[j] == target){
          twoSumResul[0] = i;
          twoSumResul[1] = j;
          return twoSumResul;
        }
      }
    }

    throw new RuntimeException("There are no numbers that satisfies the condition");
  }

  public static void main(String args[]){

  }

}


