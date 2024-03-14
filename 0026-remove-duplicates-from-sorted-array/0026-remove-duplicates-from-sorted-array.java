class Solution {
    public int removeDuplicates(int[] nums) {
        
      int i = 0, k = 0;
      int j = 0;
        
        
      while (i < nums.length - 1 - k){
          if(nums[i + 1] <= nums[i]){
              for(j = i; j < (nums.length - 1); j++){
                  nums[j] = nums[j + 1];
              }
              nums[j] = 101;
              k++;
          } else {
              i++;
          }  
      }
        
       
    return nums.length - k;
    }
}