class Solution {
    public boolean containsDuplicate(int[] nums) {
        int nb=1; 
        HashMap<Integer, Integer> map =new HashMap();

        for(int i=0; i<nums.length;i++)
        { if (map.containsKey(nums[i]))
          { nb++;
          map.replace(nums[i],nb);
          return true;
          }
          else{map.put(nums[i],1);}

        }

         return false;
        
       
    }
}
