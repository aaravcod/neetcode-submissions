
class Solution {

    public String encode(List<String> strs) {
        String data= new String();
        String character= "#";
        for(String c:strs){
            data=data+c+character;
        }
        return data;
    }

    public List<String> decode(String str) {
        List<String> output=new ArrayList<>();
        String temp=new String();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                int j=i;
                output.add(temp);
                temp="";
                continue;
            }
            temp=temp+str.charAt(i);


        }
        return output;
    }
}
