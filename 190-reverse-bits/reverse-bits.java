class Solution {
    public int reverseBits(int n) {
        String binaryString = Integer.toString(n, 2);
        String padded = String.format("%32s", binaryString).replace(' ', '0');
        String reversed = new StringBuilder(padded).reverse().toString();
        return Integer.parseInt(reversed, 2);
    }
}