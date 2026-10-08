class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){return "";}
        String longestCommonPrefix= new String();
        char crrlongestprefix='\0';
        longestCommonPrefix="";
        for(int i=0;i<strs.length;i++){
            
            if (strs[i].length()==0){return "";}
            for (int j=0;j<=strs[i].length();j++){
                crrlongestprefix=strs[i].charAt(j);
                if (crrlongestprefix==strs[i+j].charAt(j)){
                    longestCommonPrefix=longestCommonPrefix+crrlongestprefix;
                }
                else{
                    return longestCommonPrefix;
                }
            }
            

        }
        return longestCommonPrefix;
    }
}