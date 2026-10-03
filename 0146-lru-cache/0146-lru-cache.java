class Node {
    int key;
    int val;
    Node prev;
    Node next;

    Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class LRUCache {

    int capacity;
    HashMap<Integer, Node> map = new HashMap<>();

    Node head;
    Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    private void remove(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {

        Node prev = tail.prev;

        prev.next = node;
        node.prev = prev;

        node.next = tail;
        tail.prev = node;
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        remove(node);
        insert(node);

        return node.val;
    }

    public void put(int key, int value) {

        if (map.containsKey(key)) {

            Node node = map.get(key);

            node.val = value;

            remove(node);
            insert(node);

            return;
        }

        Node node = new Node(key, value);

        map.put(key, node);
        insert(node);

        if (map.size() > capacity) {

            Node lru = head.next;

            remove(lru);

            map.remove(lru.key);
        }
    }
}