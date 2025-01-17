


class Solution {
List<List<Integer>> result;    
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        if(nums== null || nums.length == 0)
          return result;
        helper(nums, 0, new ArrayList<>());
    
        return result;
    }
    private void helper(int[] nums, int i, List<Integer> path){
        if(i== nums.length){
            result.add(path);
            return;
        }
        
        helper(nums, i+1, new ArrayList<>(path));
        path.add(nums[i]);
        helper(nums, i+1, new ArrayList<>(path));
    }
}