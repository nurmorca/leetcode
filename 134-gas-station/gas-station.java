class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSurplus = 0;
        int totalGas = 0;
        int start = 0;
        int index = 0;

        for(int i = 0; i < cost.length; i++) {
            totalSurplus += gas[i] - cost[i];
            totalGas += gas[i] - cost[i];
            if (totalGas < 0) {
                start = i + 1;
                totalGas = 0;
            }
        }
        if (totalSurplus >= 0) {
           return start;
         }
        return -1;
    }
}