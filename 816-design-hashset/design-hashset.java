class MyHashSet {
    private int bucket,bucketitems;
    private boolean [][]storage;
    public MyHashSet() {
        this.bucket = 1000;
        this.bucketitems = 1000;
        this.storage = new boolean[bucket][];
    }
    
    private int hash1(int key){
        return key%1000;
    }
    private int hash2(int key){
        return key/1000;
    }
    public void add(int key) {
        int h1 = hash1(key);
        int h2 = hash2(key);

        if(storage[h1] == null){
            if(h1 == 0)
                storage[h1] = new boolean [bucketitems+1];
            else 
                storage[h1] = new boolean [bucketitems];
        }
        storage[h1][h2] = true;
    }
    
    
    public void remove(int key) {
        int h1 = hash1(key);
        int h2 = hash2(key);
        if(storage[h1] != null){
            storage[h1][h2] = false;
        }
    }
    
    public boolean contains(int key) {
        int h1 = hash1(key);
        int h2 = hash2(key);
        return storage[h1] != null && storage[h1][h2];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */