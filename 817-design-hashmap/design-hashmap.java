class MyHashMap {
    class Node{
        int key,value;
        Node next;
        public Node(int key ,int value){
            this.key = key;
            this.value = value;
        }
    }

    Node[] storage;
    public MyHashMap() {
        this.storage = new Node[10000];
    }


//////////////////////////////////////////  
private int hash1(int key){         //private hash1 function
        return key % 10000;
    }
    
//find function, to return node just before the placement node...
//we could reach, and our target node could be last also, 
//ie 2nd last or previous in this case
private Node find_prev(Node node, int key){                        
        Node prev = null;
        Node curr = node;

        while(curr != null && curr.key != key){
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }
    //////////////////////////////////
    public void put(int key, int value) {
        int h_id = hash1(key);
        if(storage[h_id] == null){
            storage[h_id] = new Node(-1,-1);   //1.create new linklist Node
        }
        Node prev = find_prev(storage[h_id], key);
        if(prev.next == null){          //2.if we reach end, so add our new neode
            prev.next = new Node(key, value);
        }else{                             //3.else it means the key already existing, hence 
                                            //it means we need to update
            prev.next.value = value;
        }
        
    }
    
    public int get(int key) {
        int h_id = hash1(key);
        if(storage[h_id] == null){return -1;}           //1.if that linklist Node never existed,
        Node prev = find_prev(storage[h_id], key);      

        if(prev.next == null){return -1;}           //2.if we reach end, and never found
        return prev.next.value;                     //3. we found , so return next of previous
    }
    
    public void remove(int key) {
        int h_id = hash1(key);
        if(storage[h_id] == null){return ;}
        Node prev = find_prev(storage[h_id], key);

        if(prev.next == null){return ;}
        prev.next = prev.next.next;
        return ;    
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */