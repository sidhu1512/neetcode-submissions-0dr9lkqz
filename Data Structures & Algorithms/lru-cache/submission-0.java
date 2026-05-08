class LRUCache {

    Map<Integer, Integer> map = new HashMap<>();
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> stack = new ArrayDeque<>();
    int capacity = 0;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (map.containsKey(key)){
            queue.remove(key);
            queue.add(key);
            stack.remove(key);
            stack.add(key);
            return map.get(key);
        } 
        return -1;
    }
    
    public void put(int key, int value) {
        
        if (map.containsKey(key)){
            map.put(key, value);
            queue.remove(key);
            queue.add(key);
            stack.remove(key);
            stack.add(key);

        }else {
            if(queue.size() == capacity) {
                int oldestKey = stack.poll();
                map.remove(oldestKey);//
                queue.remove(oldestKey);
            }

            map.put(key, value);
            queue.add(key);
            stack.add(key);
        }
        
    }
}

