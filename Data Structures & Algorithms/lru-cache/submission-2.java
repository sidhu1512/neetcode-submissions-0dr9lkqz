class LRUCache {

    int capacity =  0;
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity =  capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)) {
            list.remove(Integer.valueOf(key));
            list.add(key);
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            //add at first
            list.remove(Integer.valueOf(key));
            list.add(key);
            map.put(key, value);
        } else {
            if(list.size() == capacity){
                //need to remove the last from list and map
                map.remove(list.getFirst());
                list.remove(0);
            }
            list.add(key);
            map.put(key, value);
        }
        
    }
}
