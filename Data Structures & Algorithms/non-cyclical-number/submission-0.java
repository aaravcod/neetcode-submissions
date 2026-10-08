import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        
        while(n!=1){
            if(set.contains(sum)){return false;}
            set.add(sum);
            int rem = n % 10;
            sum=sum+rem*rem;
            n = n / 10;
            n=sum;
        }        
        return true;
    }
}
