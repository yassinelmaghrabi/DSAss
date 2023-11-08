class Node2 {
    Node data;
    int key;
    Node2 next;

    public Node2(Node data,int key) {
        this.data = data;
        this.key=key;
        this.next = null;
    }
    public Node2(Node data) {
        this.data = data;

        this.next = null;
    }
}

