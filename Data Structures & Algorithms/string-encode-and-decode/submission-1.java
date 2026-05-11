class Solution {

    StringBuilder sb = new StringBuilder();
    public String encode(List<String> strs) {
        for(String s: strs){
            sb.append("#").append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        int sidx = 0;
        int len = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '#'){
                sidx = i+1;

                for(int j = sidx; j < str.length(); j++){
                    if(str.charAt(j) == '#'){
                        len = Integer.parseInt(str.substring(i+1, j));
                        i = j + 1;
                        break;
                    }
                    
                }
                result.add(str.substring(i, i + len));
                i += len -1;
            }
        }
        return result;
    }
}
