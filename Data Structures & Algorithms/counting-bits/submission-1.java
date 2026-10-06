    class Solution {
        public int[] countBits(int n) {
            
            int[] output=new int[n+1];
            output[0]=0;
            for(int i=1;i<=n;i++){
                int count=0;
                String data=Integer.toBinaryString(i);
                for(int j=0;j<data.length();j++){
                    if(data.charAt(j)=='1'){
                        count++;
                    }
                }
                output[i]=count;
            }

            return output;
        }
    }
