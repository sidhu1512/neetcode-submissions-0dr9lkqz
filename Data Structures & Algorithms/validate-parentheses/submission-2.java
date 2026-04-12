class Solution {
    public boolean isValid(String s) {
        Map<Character , Character> symbols = new HashMap<>();
        symbols.put('(',')');
        symbols.put('{','}');
        symbols.put('[',']');
        
        Stack<Character> stack  = new Stack<>();
        for(char c: s.toCharArray()){
            if (symbols.containsKey(c)){
                stack.push(symbols.get(c));
            }
            else{
                if(stack.isEmpty() || stack.pop() != c){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else return false;
       

    }
}
