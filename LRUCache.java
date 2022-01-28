class LRUCache {  
    
    // Creating a double linked list to keep track of the Least and Most recently 
    // used Cache
  class Node{
    Node prev, next;
    int key, value;
    Node(int _key, int _value) {
      key = _key;
      value = _value;
    }
  }
    
    // Creating head node which will always be in front 
    // We will always insert the recently used cache after the head
    // Most used cache will be right after the head
  Node head = new Node(0, 0) ;
    
    // Creating tail node wich will always be in end 
    // Least used cache will be right before the tail
  Node tail = new Node(0, 0);
    
    // HashMap to store key as an Integer and value as a Node
  Map<Integer, Node> hMap = new HashMap();
    
    // capacity of the LRU Cache
  int capacity;
  
    
    // Constructor for LRUCache
    // At beginning head next is pointing to tail and head prev is pointing to null
    // At beginning tail prev is pointing to head and tail next is pointing to null
    // || Head || -> <- || Tail ||
  public LRUCache(int _capacity) {
    capacity = _capacity;
    head.next = tail;
    tail.prev = head;
  }

    // get the value based on the key
  public int get(int key) {
      // If the hashMap contains key, get that node and return that node's value
      // Once we get value from that node, than that becomes the most recently used cache
      // So, we need to add that recently used cache right before the head
      // So, we remove it from the double linked list and we insert it again
      // If the key is not present return -1
    if(hMap.containsKey(key)) {
      Node node = hMap.get(key);
      remove(node);
      insert(node);
      return node.value;
    } else {
      return -1;
    }
  }

    // if map conatians the same key then we need to update the value
    // To update the value we will delete the node from double linked list and
    // then insert that node with updated/new value right after the head
    // If the size of the map is equal to the capacity, we need to delete before adding
    // We will remove the node from the tail, which is least recently used
    // Then we will insert the value
  public void put(int key, int value) {
    if(hMap.containsKey(key)) {
      remove(hMap.get(key));
    }
    if(hMap.size() == capacity) {
      remove(tail.prev);
    }
    insert(new Node(key, value));
  }
  
    // This removes the node for double linked list
    // Also removes the node from hMap
  private void remove(Node node) {
    hMap.remove(node.key);
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }
  
    // This always inserts the node right after the head
    // Also inserts the node into hMap 
  private void insert(Node node){
    hMap.put(node.key, node);
    node.next = head.next;
    node.next.prev = node;
    head.next = node;
    node.prev = head;
  }
  
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
