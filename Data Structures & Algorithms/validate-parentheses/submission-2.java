
class Solution {
    public boolean isValid(String s) {
        if(s.isEmpty()){return false;}
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }
            if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                Character input=s.charAt(i);
                Character data=stk.peek();
                if(data=='(' && input== ')'){if(stk.empty()){return false;}else{stk.pop();}}
                if(data=='[' && input== ']'){if(stk.empty()){return false;}else{stk.pop();}}
                if(data=='{' && input== '}'){if(stk.empty()){return false;}else{stk.pop();}}
            }
        }
        if(stk.empty()){
            return true;
        }
        else{return false;}
        
    }
}
