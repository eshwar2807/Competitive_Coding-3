class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0;
        HashMap < Integer, Integer > m = new HashMap < > ();
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])){
                 m.put(nums[i], 2);
            }else{
        m.put(nums[i], 1);}}
        for (int i = 0; i < nums.length; i++) {
            if(k == 0 && i!=0 && nums[i]!=nums[i-1]){
                if(m.get(nums[i])==2){
                    ++c;
                }}
                 if(k == 0 && i==0){
                if(m.get(nums[i])==2){
                    ++c;
                }}
            
            if(i>0 && nums[i]!=nums[i-1] && k!=0){
            if (m.containsKey(nums[i] + k)){
                ++c;}
        }else if(i==0 && k!=0){
                if (m.containsKey(nums[i] + k)){
                ++c;}
            }}
        return c;
                    }
}
//tc=O(n)
//sc=O(n)
