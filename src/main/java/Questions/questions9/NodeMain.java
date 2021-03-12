package Questions.questions9;

public class NodeMain {
    public static void main(String[] args) {
        NodeExample node1 = new NodeExample();
        NodeExample node2 = new NodeExample();
        NodeExample node3 = new NodeExample();
        node1.next = node2;
        node2.next = node3;
        node1.value = "a";
        node1.next.value = "b";
        node1.next.next.value = "c";
    }
}
