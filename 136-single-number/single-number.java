class Solution {
    public int singleNumber(int[] nums) {
        int XOR= 0;
        
        for(int ele : nums) {
            XOR = XOR ^ ele;
        }

        return XOR;
    }
}