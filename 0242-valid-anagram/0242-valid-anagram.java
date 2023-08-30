class Solution {
    public boolean isAnagram(String s, String t) {

  String new_s= sorting(s);
  String new_t= sorting(t);

 return new_s.equals(new_t);




    }

      public String sorting(String l){
        char[] stringArray=l.toCharArray();
        Arrays.sort(stringArray);
        return new String(stringArray);
      }

}