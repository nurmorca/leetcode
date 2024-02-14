class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int i = 0, j = 0;
        
        while(i < nums.length - 1){
                  j = i + 1;
                while(j < nums.length){
                        if(nums[j] + nums[i] == target){
                            arr[0] = i;
                            arr[1] = j;
                            return arr;
                        }
                    j++;
                }
            i++;
        }
              
    return null;        
}
        
        
}
