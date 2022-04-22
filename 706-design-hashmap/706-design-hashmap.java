class MyHashMap {

    class Node {
        int key, val;
        Node next;
        Node(int k, int v) {
            key = k;
            val = v;
        }
    }
    
    Node[] map;
    
    
    public MyHashMap() {
        map = new Node[1000];
    }
    
    public void put(int key, int value) {
        Node n = getPrevNode(key);
        if (n.next == null) {
            n.next = new Node(key, value);
        } else {
            n.next.val = value;
        }
    }
    
    public int get(int key) {
        Node n = getNode(key);
        return n == null ? -1 : n.val;
    }
    
    public Node getPrevNode(int key) {
        int idx = key % 1000;
        if (map[idx] == null) {
            map[idx] = new Node(-1, -1); //dummy head;
        }
        
        Node n = map[idx];
        while (n.next != null && n.next.key != key)
            n = n.next;
        
        return n;
    }
    
    public Node getNode(int key) {
        Node n = getPrevNode(key);
        return n.next;
    }
    
    public void remove(int key) {
        Node n = getPrevNode(key);
        if (n.next == null)
            return;
        
        n.next = n.next.next;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */