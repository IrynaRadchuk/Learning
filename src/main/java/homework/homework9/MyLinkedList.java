package homework.homework9;

public class MyLinkedList<T> {
    Node<T> firstNode;
    Node<T> currentNode;

    public MyLinkedList() {
    }

    public void get(int index) {
    }

    public void add(T value) {
        Node<T> node1 = new Node<>(value);
        if (currentNode == null) {
            currentNode = node1;
            firstNode = currentNode;
        } else {
            /*if (currentNode.getNext() == null) {
                currentNode.setNext(node1);
                node1.setPrevious(currentNode);
                currentNode = node1;
            }*/
            lastNode();
            currentNode.setNext(node1);
            node1.setPrevious(currentNode);
            currentNode = node1;
        }
        System.out.println(currentNode);
    }

    public Node<T> lastNode() {
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void remove(int index) {

    }

    public void clear() {

    }

    public void size() {

    }
}
