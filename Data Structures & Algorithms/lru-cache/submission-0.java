class Node{
    int  key;
    int val;
    Node prev;
    Node next;
     Node(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }


}
class LRUCache {
    HashMap<Integer,Node> map;
    int cap;
    Node left;
    Node right;

    public LRUCache(int capacity) {
        map=new HashMap<>();
        cap=capacity;
        left= new Node(0,0);
        right=new Node(0,0);
        left.next=right;
        right.prev=left;
        
    }
    void remove(Node node){
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;

    }
    void insert(Node node){
        Node prev=right.prev;
        prev.next=node;
        node.prev=prev;
        node.next=right;
        right.prev=node;
    }
    
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
        
    }
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            Node node=new Node(key,value);
            if(map.size()>=cap){
                Node next= left.next;
                remove(next);
                map.remove(next.key);
            }
            insert(node);
            map.put(node.key,node);

        }
        else{
            Node curr=map.get(key);
            remove(curr);
            curr.val=value;
            insert(curr);
            map.put(curr.key,curr);

        }
        
        
    }
}
