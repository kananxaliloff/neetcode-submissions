class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueSoFar = new HashSet<Integer>();

        for (int num : nums) {
            if (uniqueSoFar.contains(num)) {
                return true;
            }

            uniqueSoFar.add(num);
        }

        return false;
    }
}