class Solution {
    public boolean isAnagram(String s, String t) {


HashMap<Character, Integer> map= new HashMap();
for(char c: s.toCharArray())
{map.put(c, map.getOrDefault(c,0)+1);}

for(char x: t.toCharArray())
{map.put(x,map.getOrDefault(x,0)-1);}

for(int val : map.values())
{if (val!=0)
return false;}
return true ;
}
}