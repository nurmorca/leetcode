int removeElement(int* nums, int numsSize, int val) {

    int i;
    int k = 0;

    for(i = 0; i < numsSize; i++){
        if(nums[i] == val){
          nums[i] = nums[numsSize - 1 - k];
          nums[numsSize - 1 - k] = -1;
          k++;
          i--;
        }
    }
    k = numsSize - k;
    return k;
}