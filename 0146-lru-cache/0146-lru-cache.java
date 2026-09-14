class LRUCache {
    class Node {
        public int key,val;
        public Node prev;
        public Node next;

        public Node(int key,int val){
            this.key=key;
            this.val=val;
            
        }
    }
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
   
    HashMap<Integer,Node> map=new HashMap<>();
    int limit;

    public LRUCache(int capacity) {
        limit=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node ansNode=map.get(key);
        deleteNode(map.get(key));
        addNode(map.get(key));
       
        return ansNode.val;
    }
    
    public void put(int key, int value) {

        if(map.containsKey(key)){
            Node oldNode=map.get(key);
            deleteNode(oldNode);
            map.remove(key);
        }if(map.size()==limit){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        Node newNode=new Node(key,value);
        addNode(newNode);
        map.put(key,newNode);
    }

    public void addNode(Node newNode){
        Node oldNext=head.next;
        head.next=newNode;
        oldNext.prev=newNode;
        newNode.next=oldNext;
        newNode.prev=head;
    }
    public void deleteNode(Node oldNode){
     
        Node oldPrev=oldNode.prev;
        Node oldNext=oldNode.next;
        oldPrev.next=oldNext;
        oldNext.prev=oldPrev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */