class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int b=0;
        for(char c:s.toCharArray()){
            if(c=='R'){
             b++;
            }else{
                b--;
            }if(b==0){
                count++;
            }
        }
        return count;
    }
}