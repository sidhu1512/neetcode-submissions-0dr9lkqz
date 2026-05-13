class Solution {

    public final String  symbol= "@";
    public String encode(List<String> strs) {
        if(strs.size() == 0) return " ";
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length()).append(symbol).append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int idx = 0;
        int len = 0; 
        for(int i =0 ; i< str.length(); i++){
            if(str.charAt(i) == '@'){
                len = Integer.parseInt(str.substring(idx, i));
            

            result.add(str.substring(i+1, i + 1 +len));
            idx = i + len +1;
            i += len;
            }
        }

        return result;
    }
}
