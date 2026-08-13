class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int start =0, i=0;
        while(i<str.length()){
            while(str.charAt(i) != '#') i++;
            int len = Integer.parseInt(str.substring(start, i));
            result.add(str.substring(i+1, i+1+len));
            start = i+1+len;
            i = start;
        }
        return result;
    }
}
