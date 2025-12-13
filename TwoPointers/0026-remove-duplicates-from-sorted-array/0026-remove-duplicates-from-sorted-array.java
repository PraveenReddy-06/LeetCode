class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i : nums) {
            map.add(i);
        }

        List<Integer> temp= new ArrayList<>(map);
        Collections.sort(temp);

        int l=0;
        for(int k: temp) {
            nums[l++]=k;
        }
    return l;
    }
}