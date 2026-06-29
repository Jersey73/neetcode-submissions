class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char [] ch = new char [s.length()];
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            ch[j]=s.charAt(i);
            j++;
        }
        for(int i =0;i<s.length();i++){
            if(ch[i]!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}