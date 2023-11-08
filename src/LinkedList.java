
class LinkedList {
    Node2 head;
    Node2 tail;

    public LinkedList() {
        this.head = null;
        this.tail=null;
    }

    public void append(Node data, int key) {
        Node2 newNode = new Node2(data, key);
        if (head == null) {
            head = newNode;
            tail = newNode; 
        } else {
            tail.next = newNode;
            tail = newNode; 
        }
        
    }
    public Node nodefromkey(int key){
        Node2 currNode = head;
        while(currNode!=null ){
            
            if(currNode.key==key){
                return currNode.data;
            }
            currNode=currNode.next;
            
        }
        return null;
        
        
    }
}