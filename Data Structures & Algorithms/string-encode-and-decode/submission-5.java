
class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0){return "#E#";}
        return String.join("##", strs);
    }

    

    public List<String> decode(String str) {
        if(str=="#E#"){return new ArrayList<>();}
    return new ArrayList<>(Arrays.asList(str.split("##", -1))); 
}

}