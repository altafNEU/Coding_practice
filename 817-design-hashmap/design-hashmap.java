class MyHashMap {
    class Node {
        private int key, value;
        private Node next;
        public Node(int key , int value){
            this.key = key;
            this.value= value;
        }
    }

    Node[] storage;
    public MyHashMap() {
        this.storage = new Node[10000];
    }
    
    private int hash1(int key){
        return (key%10000);
    }

    private Node find_prev(Node node, int key){
        Node prev = null;
        Node curr = node;

        while(curr != null && curr.key != key){
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }
    public void put(int key, int value) {
        int h_id = hash1(key);
        Node newNode = new Node(key,value);

        if(storage[h_id] == null){
            storage[h_id] = new Node(-1,-1);
        }

        
        Node prev = find_prev(storage[h_id], key);
        if(prev.next == null){
            prev.next = newNode;
        }
        if(prev.next.key == key){
            prev.next.value = value;
        }
    }
    
    public int get(int key) {
        int h_id = hash1(key);
        if(storage[h_id] == null)
            return -1;

        Node prev = find_prev(storage[h_id], key);
        if(prev.next == null)
            return -1;
        return prev.next.value;
    }
    
    public void remove(int key) {
        int h_id = hash1(key);
        if(storage [h_id] == null)
            return;
        Node prev = find_prev(storage[h_id], key);
        if(prev.next == null)
            return;
        
        prev.next = prev.next.next;
        
        return;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */