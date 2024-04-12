class MyHashSet {

    int bucket = 1000;
    int bucketitems = 1000;

    boolean[][] storage;

    private int hash1(int key) {
        return key % 1000;
    }

    private int hash2(int key) {
        return key / 1000;
    }

    public MyHashSet() {
        this.storage = new boolean[bucket][];
    }

    public void add(int key) {
        int h_id1 = hash1(key);
        int h_id2 = hash2(key);

        if (storage[h_id1] == null) {
            if(h_id1==0){
                storage[h_id1] = new boolean[bucketitems+1];
            }else
                storage[h_id1] = new boolean[bucketitems];
            
        }
        storage[h_id1][h_id2] = true;
    }

    public void remove(int key) {
        int h_id1 = hash1(key);
        int h_id2 = hash2(key);
        if (storage[h_id1] == null) {
            return;
        }
        storage[h_id1][h_id2] = false;
    }

    public boolean contains(int key) {
        int h_id1 = hash1(key);
        int h_id2 = hash2(key);
        if (storage[h_id1] == null) {
            return false;
        }
        return storage[h_id1][h_id2];
    }
}


/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */