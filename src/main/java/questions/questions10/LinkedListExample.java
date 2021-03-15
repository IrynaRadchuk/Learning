package questions.questions10;

public class LinkedListExample {
    public static void main(String[] args) {
        MyLinkedList <String> list = new MyLinkedList<>();
        list.add ("111");
        list.add ("222");
        list.add ("333");
        list.add ("444");
        list.add ("555");
        list.print();
        list.remove(2);
        list.print();
    }
}
