class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        for(int key:m.keySet()){
            if(m.get(key)>1){
                return true;
            }
        }
        return false;
        
    }
}