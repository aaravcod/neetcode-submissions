
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){return "";}
        String data=strs[0];

        for(int i=0;i<data.length();i++){
            Character c=data.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(c!=strs[j].charAt(i)){
                    return data.substring(0,i);
                }
            }
        }
        return data;
    }
}