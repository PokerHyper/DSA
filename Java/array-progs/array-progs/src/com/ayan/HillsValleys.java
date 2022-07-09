package com.ayan;

public class HillsValleys {
    public static void main(String[] args) {
        int[] arr = {2,4,1,1,6,5};
        int count = countHillValley(arr);
        System.out.println(count);
    }
    static int countHillValley(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i =1; i < n -1; i++){
            int j = i + 1;
            while(j < n && nums[i] == nums[j]){
                j ++;
            }
            if(j < n && (nums[i] > nums[j] && nums[i] > nums[i-1])){
                count++;
            }
            if(j < n && (nums[i] < nums[j] && nums[i] < nums[i-1])){
                count++;
            }
            i = j -1;

        }
        return count;

    }
}
