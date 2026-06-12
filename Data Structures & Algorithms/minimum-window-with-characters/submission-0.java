class Solution {
    public String minWindow(String s, String t) {
        int tlen = t.length(), slen = s.length(), l =0, r =0, minlen = Integer.MAX_VALUE, idx =0, count=0;

        Map<Character, Integer> freq = new HashMap<>();

        for(char c : t.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) +1);
        }

        while(r < slen){
            char c = s.charAt(r);
            if(freq.get(c) != null &&  freq.get(c) > 0){
                count++;
                freq.put(c, freq.get(c) - 1);
             
            } else {
                freq.put(c, freq.getOrDefault(c, 0) - 1);
            }

            //shrinking logic
            while(count == tlen){

                if(minlen > r - l +1){
                    minlen = r - l +1;
                    idx = l;
                }

                char first = s.charAt(l);
                freq.put(first, freq.get(first) + 1);
                if(freq.get(first) > 0) 
                count = count -1;
                l++;
            }
            r++;
        }

        if(minlen != Integer.MAX_VALUE) return s.substring(idx, idx + minlen);
        else return "";
    }
}
