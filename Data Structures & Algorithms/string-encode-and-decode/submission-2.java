class Solution {

    public static final String unique = "µ";
    public String encode(List<String> strs) {

        if(strs.size() == 0) return " ";

        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append(unique).append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int idx = 0;
        int len =0;

        for(int i = 0 ; i< str.length(); i++){

            if(str.charAt(i) == 'µ'){
                len = Integer.parseInt(str.substring(idx, i));
                result.add(str.substring(i +1, i+ 1 + len));
                i += len + 1;
                idx = i;
            }

            
        }

        return result;
    }
}
