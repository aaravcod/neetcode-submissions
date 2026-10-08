
class Solution {

    public String encode(List<String> strs) {
        
        return String.join("##", strs);
    }

    

    public List<String> decode(String str) {
        if(str.isEmpty()){
            return new ArrayList<>();
        }
    return new ArrayList<>(Arrays.asList(str.split("##", -1))); 
}

}
