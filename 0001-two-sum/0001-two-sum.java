class Solution {
    int[] solution= new int[2];
    public int[] twoSum(int[] nums, int target) {
        int size= nums.length;
        for(int i=0;i < size;i++){
            for (int j=0; j< size; j++){
                if( i!=j && nums[i]+nums[j]==target)
                {solution[0]=i;
                solution[1]=j;
                return solution;
             }
             
            }
           

        }   
        return solution;     
    
}
}