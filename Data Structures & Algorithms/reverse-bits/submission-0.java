class Solution {
    public int reverseBits(int n) {
       StringBuilder sb = new StringBuilder();

       for(int i=0; i < 32; i++){
        sb.append(n & 1);

        n >>>= 1;
       }

       return Integer.parseUnsignedInt(sb.toString(), 2); 
    }
}
