class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(nums);

        solve(0, nums, current, result);

        return result;
    }

    public void solve(int i, int[] nums, List<Integer> current,
                      List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int j = i; j < nums.length; j++) {

            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }

            current.add(nums[j]);

            solve(j + 1, nums, current, result);

            current.remove(current.size() - 1);
        }
    }
}