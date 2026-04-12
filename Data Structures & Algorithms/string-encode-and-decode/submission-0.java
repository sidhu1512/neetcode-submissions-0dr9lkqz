class Solution {

    public final String s = "µ";
    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append(s).append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i=0;
        while(i< str.length()){
            int idx = str.indexOf(s, i);
            int size = Integer.parseInt(str.substring(i, idx));
            res.add(str.substring(idx+1, idx+size+1));
            i = idx + size+ 1;
        }
        return res;
    }
}
