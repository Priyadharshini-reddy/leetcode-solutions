class MyLinkedList {

    class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);

        head.next = tail;
        tail.prev = head;

        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = getNode(index);
        return curr.val;
    }

    public void addAtHead(int val) {
        insertBetween(new Node(val), head, head.next);
        size++;
    }

    public void addAtTail(int val) {
        insertBetween(new Node(val), tail.prev, tail);
        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node nextNode = getNode(index);
        Node prevNode = nextNode.prev;

        insertBetween(new Node(val), prevNode, nextNode);
        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        Node node = getNode(index);

        node.prev.next = node.next;
        node.next.prev = node.prev;

        size--;
    }

    private Node getNode(int index) {

        Node curr;

        if (index < size / 2) {

            curr = head.next;

            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }

        } else {

            curr = tail.prev;

            for (int i = size - 1; i > index; i--) {
                curr = curr.prev;
            }
        }

        return curr;
    }

    private void insertBetween(Node node, Node prev, Node next) {

        prev.next = node;
        node.prev = prev;

        node.next = next;
        next.prev = node;
    }
}










/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */