class Solution {
    public boolean isAnagram(String s, String t) {
        char [] ch = s.toCharArray();
        char[] ch1=t.toCharArray();
        if(ch.length!=ch1.length){
            return false;
        }
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i =0;i<s.length();i++){
            if(ch[i]!=ch1[i]){
                return false;
            }
        }
        return true;
    }
}
