class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            String str="";
        
        for(int j=i;j<s.length();j++){
            char c = s.charAt(j);
        
        if(str.contains(c+""))
        break;
        str=str+c;
    }
    max=Math.max(max,str.length());
    }
    return max;
    }
}