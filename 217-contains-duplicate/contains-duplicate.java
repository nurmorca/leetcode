class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        System.out.println(numSet);
        if (numSet.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }
}